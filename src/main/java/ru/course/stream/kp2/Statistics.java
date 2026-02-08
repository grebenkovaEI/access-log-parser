package ru.course.stream.kp2;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Optional;

public class Statistics {
    private long totalTraffic, countVisits, countErrorReq;
    private LocalDateTime minTime, maxTime;
    private final HashSet<String> pages, nonExistPage, realUserIP, referers;
    private final HashMap<String, Integer> os, browserStat, realUserVisits;
    private final HashMap<Integer, Integer> visitsPerSec;

    public Statistics() {
        this.totalTraffic = 0;
        this.minTime = LocalDateTime.MAX;
        this.maxTime = LocalDateTime.MIN;
        this.pages = new HashSet<>();
        this.os = new HashMap<>();
        this.nonExistPage = new HashSet<>();
        this.browserStat = new HashMap<>();
        this.countVisits = 0;
        this.countErrorReq = 0;
        this.realUserIP = new HashSet<>();
        this.visitsPerSec = new HashMap<>();
        this.referers = new HashSet<>();
        this.realUserVisits = new HashMap<>();
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
        if (log.getResponseCode() == 404) {
            addNonExistPage(log.getPath());
        }
        if (log.getResponseCode() / 100 == 4 ||  log.getResponseCode() / 100 == 5) {
            countErrorReq++;
        }
        String osName = log.getUserAgent().getTypeOS();
        os.put(osName, os.getOrDefault(osName, 0) + 1);
        String browser = log.getUserAgent().getBrowser();
        browserStat.put(browser, browserStat.getOrDefault(browser, 0) + 1);

        boolean isBot = UserAgent.isBot(log.getUserAgent().toString());
        if (!isBot) {
            countVisits++;

            String ipAddr = log.getIpAddr();
            realUserIP.add(ipAddr);

            LocalDateTime dateTime = log.getTime();
            int sec = (int) dateTime.toEpochSecond(ZoneOffset.UTC);
            visitsPerSec.put(sec, visitsPerSec.getOrDefault(sec, 0) + 1);

            realUserVisits.put(ipAddr, realUserVisits.getOrDefault(ipAddr, 0) + 1);
        }

        Optional.ofNullable(log.getReferer())
                .map(this::refererDomain)
                .ifPresent(referers::add);
    }

    public double getMaxVisitsByIP() {
        return realUserVisits.values().stream()
                .mapToInt(Integer::intValue)
                .max()
                .orElse(0);
    }

    private String refererDomain(String referer) {
        return Optional.of(referer)
                .map(i -> i.replaceFirst("^(https?://)?", ""))
                .map(i -> i.split("/")[0])
                .orElse(null);
    }

    public HashSet<String> getReferer() {
        return new HashSet<>(referers);
    }

    public int getPeakVisits() {
        return visitsPerSec.values().stream()
                .mapToInt(Integer::intValue)
                .max()
                .orElse(0);

    }

    public double getVisitsByIP() {
        return (double) countVisits / realUserIP.size();
    }

    public double getErrorReqPerHour() {
        Duration duration = Duration.between(minTime, maxTime);
        double hours = duration.toMillis() / (1000.0 * 60 * 60);
        return (double) hours / countErrorReq;
    }

    public double getVisitsPerHour() {
        Duration duration = Duration.between(minTime, maxTime);
        double hours = duration.toMillis() / (1000.0 * 60 * 60);
        return (double) countVisits / hours;
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

    public long getCountVisits() {
        return countVisits;
    }

    public long getCountErrorReq() {
        return countErrorReq;
    }

    public HashSet<String> getRealUserIP() {
        return new HashSet<>(realUserIP);
    }

    public HashMap<Integer, Integer> getVisitsPerSec() {
        return new HashMap<>(visitsPerSec);
    }

    public HashSet<String> getReferers() {
        return new HashSet<>(referers);
    }

    public HashMap<String, Integer> getRealUserVisits() {
        return new HashMap<>(realUserVisits);
    }
}
