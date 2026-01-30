package ru.course.kp.oop;

import java.io.BufferedReader;
import java.io.FileReader;

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

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
