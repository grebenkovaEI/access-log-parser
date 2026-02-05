package ru.course.collections.kp2;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Statistics {
    private long totalTraffic;
    private LocalDateTime minTime, maxTime;
    private final HashSet<String> pages;
    private final HashMap<String, Integer> os;
    private final HashSet<String> nonExistPage;
    private final HashMap<String, Integer> browserStat;

    public Statistics() {
        this.totalTraffic = 0;
        this.minTime = LocalDateTime.MAX;
        this.maxTime = LocalDateTime.MIN;
        this.pages = new HashSet<>();
        this.os = new HashMap<>();
        this.nonExistPage = new HashSet<>();
        this.browserStat = new HashMap<>();
    }

    void addEntry(LogEntry log) {
        totalTraffic += log.getResponseSize();
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

        if (log.getResponseCode() == 404) {
            addNonExistPage(log.getPath());
        }

        String browser = log.getUserAgent().getBrowser();
        browserStat.put(browser, browserStat.getOrDefault(browser, 0) + 1);
    }

    private void addNonExistPage(String path) {
        nonExistPage.add(path);
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

    public HashMap<String, Double> getBrowserStat() {
        HashMap<String, Double> browsersStat = new HashMap<>();
        int total = 0;
        for (int count : browserStat.values()) {
            total += count;
        }
        for (Map.Entry<String, Integer> entry : browserStat.entrySet()) {
            String name = entry.getKey();
            int count = entry.getValue();
            double stat = (double) count / total;
            browsersStat.put(name, stat);
        }
        return browsersStat;
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
        return new HashSet<>(pages);
    }

    public HashMap<String, Integer> getOs() {
        return new HashMap<>(os);
    }

    public HashSet<String> getNonExistPage() {
        return new HashSet<>(nonExistPage);
    }

    public HashMap<String, Integer> getBrowsersStat() {
        return new HashMap<>(browserStat);
    }
}
