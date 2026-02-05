package ru.course.collections.kp1;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Statistics {
    private long totalTraffic;
    private LocalDateTime minTime, maxTime;
    private HashSet<String> pages;
    private HashMap<String, Integer> os;

    public Statistics() {
        this.totalTraffic = 0;
        this.minTime = LocalDateTime.MAX;
        this.maxTime = LocalDateTime.MIN;
        this.pages = new HashSet<>();
        this.os = new HashMap<>();
    }

    void addEntry(LogEntry log) {
        totalTraffic += (int) log.getResponseSize();
        if (log.getTime().isBefore(minTime)) {
            minTime = log.getTime();
        }
        if (log.getTime().isAfter(maxTime)) {
            maxTime = log.getTime();
        }
        if (log.getResponseCode() == 200) {
            pages.add(log.getPath());
        }
        String osName = log.getUserAgent().getTypeOS();
        os.put(osName, os.getOrDefault(osName, 0) + 1);
    }

    public HashMap<String, Double> getOsStat() {
        HashMap<String, Double> osStat = new HashMap<>();
        int total = 0;
        for (int count : os.values()) {
            total += count;
        }
        for (Map.Entry<String, Integer> entry : os.entrySet()) {
            String osStr = entry.getKey();
            int count = entry.getValue();
            double stat = (double) count / total;
            osStat.put(osStr, stat);
        }
        return osStat;
    }

    double getTrafficRate() {
        Duration duration = Duration.between(minTime, maxTime);
        double hours = duration.toMillis() / (1000.0 * 60 * 60);
        return (double) totalTraffic / hours;
    }

    public long getTotalTraffic() {
        return totalTraffic;
    }

    public LocalDateTime getMinTime() {
        return minTime;
    }

    public LocalDateTime getMaxTime() {
        return maxTime;
    }

    public HashSet<String> getPages() {
        return pages;
    }

    public HashMap<String, Integer> getOs() {
        return os;
    }
}
