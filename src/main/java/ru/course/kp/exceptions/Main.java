package ru.course.kp.exceptions;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) {
        String path = "access.log";
        //файл со строкой > 1024 символа
        //String path = "access1.log";
        File file = new File(path);
        if (!file.exists()) {
            System.out.println("Файл не существует");
        } else if (!file.isFile()) {
            System.out.println("Указанный путь является путем к папке, а не к файлу");
        } else {
            try {
                int totalLines = 0;
                int maxLine = 0;
                int minLine = Integer.MAX_VALUE;
                FileReader fileReader = new FileReader(path);
                BufferedReader reader = new BufferedReader(fileReader);
                String line;
                while ((line = reader.readLine()) != null) {
                    int length = line.length();
                    if (length > 1024) {
                        throw new LineLengthException("Обнаружена строка длиннее 1024 символов");
                    }
                    totalLines++;
                    if (length > maxLine) maxLine = length;
                    if (length < minLine) minLine = length;
                }
                System.out.println("Общее количество строк в файле: " + totalLines);
                System.out.println("Длина самой длинной строки в файле: " + maxLine);
                System.out.println("Длина самой короткой строки в файле: " + minLine);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }








    }
}
