package ru.course.kp.oop;

import java.time.Duration;
import java.time.LocalDateTime;

public class Statistics {
    private long totalTraffic;
    private LocalDateTime minTime, maxTime;

    public Statistics() {
        this.totalTraffic = 0;
        this.minTime = LocalDateTime.MAX;
        this.maxTime = LocalDateTime.MIN;
    }

    void addEntry(LogEntry log) {
        totalTraffic += (int) log.getResponseSize();
        if (log.getTime().isBefore(minTime)) {
            minTime = log.getTime();
        }
        if (log.getTime().isAfter(maxTime)) {
            maxTime = log.getTime();
        }
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
}
