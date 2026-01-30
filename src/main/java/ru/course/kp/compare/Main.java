package ru.course.kp.compare;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String path = "access.log";
        File file = new File(path);
        String regex = "^(\\S+) (\\S+) (\\S+) \\[([^\\]]+)\\] \"(\\S+) (\\S+) [^\"]*\" (\\d{3}) (\\d+|-) \"([^\"]*)\" \"([^\"]*)\"";
        Pattern pattern = Pattern.compile(regex);
        if (!file.exists()) {
            System.out.println("Файл не существует");
        } else if (!file.isFile()) {
            System.out.println("Указанный путь является путем к папке, а не к файлу");
        } else {
            try {
                int totalLines = 0;
                FileReader fileReader = new FileReader(path);
                BufferedReader reader = new BufferedReader(fileReader);
                String line;
                int googlebot = 0;
                int yandexbot = 0;
                while ((line = reader.readLine()) != null) {
                    int length = line.length();
                    if (length > 1024) {
                        throw new LineLengthException("Обнаружена строка длиннее 1024 символов");
                    }
                    totalLines++;
                    Matcher matcher = pattern.matcher(line);
                    if (matcher.find()) {
                        String userAgent = matcher.group(10);
                        //выделите часть, которая находится в первых скобках;
                        int start = userAgent.indexOf('(');
                        int end = userAgent.indexOf(')');
                        if (start != -1 && end != -1) {
                            String firstBrackets = userAgent.substring(start + 1, end);
                            //разделите эту часть по точке с запятой
                            String[] parts = firstBrackets.split(";");
                            if (parts.length >= 2) {
                                //возьмите второй фрагмент
                                String fragment = parts[1];
                                //очистьте от пробелов каждый получившийся фрагмент
                                fragment = fragment.trim();
                                //отделите в этом фрагменте часть до слэша
                                int slash = fragment.indexOf('/');
                                if (slash != -1) {
                                    String program = fragment.substring(0, slash);
                                    //Определяя равенство найденного фрагмента строкам Googlebot или YandexBot, подсчитывайте количество
                                    // строк в файле, соответствующих запросам от данных ботов.
                                    if (program.equals("Googlebot")) {
                                        googlebot++;
                                    } else if (program.equals("YandexBot")) {
                                        yandexbot++;
                                    }
                                }
                            }
                        }
                    }
                }
                System.out.println("Общее количество строк в файле: " + totalLines);
                //Выведите в консоль долю запросов от YandexBot и Googlebot к веб-сайту относительно общего числа сделанных запросов.
                double reqYandex = (double) yandexbot / totalLines;
                double reqGoogle = (double) googlebot / totalLines;
                System.out.println("Доля запросов от YandexBot: " + reqYandex);
                System.out.println("Доля запросов от Googlebot: " + reqGoogle);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }
}
