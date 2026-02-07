package ru.course.stream.kp1;
//src/main/java/ru/course/collections/kp/Main.java

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String path = "access.log";
        Statistics stats = new Statistics();

        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            String line;
            while ((line = reader.readLine()) != null) {
                LogEntry entry = new LogEntry(line);
                stats.addEntry(entry);
            }
            System.out.println("Минимальное время: " + stats.getMinTime());
            System.out.println("Максимальное время: " + stats.getMaxTime());
            System.out.println("Общий трафик: " + stats.getTotalTraffic() + " байт");
            System.out.println("Средний трафик в час: " + stats.getTrafficRate());
            System.out.println("Все существующие страницы сайта: ");
            for (String page : stats.getPages()) {
                System.out.println(page);
            }
            System.out.println("Несуществующие страницы: ");
            for (String page : stats.getNonExistPage()) {
                System.out.println(page);
            }
            System.out.println("Статистика ОС: ");
            HashMap<String, Double> osStat = stats.getOsStat();
            for (Map.Entry<String, Double> os : osStat.entrySet()) {
                System.out.println(os.getKey() + " - " + os.getValue());
            }
            System.out.println("Статистика браузеров: ");
            HashMap<String, Double> browserStat = stats.getBrowserStat();
            for (Map.Entry<String, Double> br : browserStat.entrySet()) {
                System.out.println(br.getKey() + " - " + br.getValue());
            }
            System.out.println("Cреднее количество посещений сайта за час: " + stats.getVisitsPerHour());
            System.out.println("Cреднее количество ошибочных запросов в час: " + stats.getErrorReqPerHour());
            System.out.println("Cредняя посещаемость одним пользователем: " + stats.getVisitsByIP());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
