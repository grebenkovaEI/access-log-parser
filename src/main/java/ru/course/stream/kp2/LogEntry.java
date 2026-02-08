package ru.course.stream.kp2;

import ru.course.kp.oop.httpMethod;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LogEntry {
    private final String ipAddr, path, referer;
    private final UserAgent userAgent;
    private final int responseCode;
    private final long responseSize;
    private final LocalDateTime time;
    private final httpMethod method;

    private final String regex = "^(\\S+) (\\S+) (\\S+) \\[([^\\]]+)\\] \"(\\S+) (\\S+) [^\"]*\" (\\d{3}) (\\d+|-) \"([^\"]*)\" \"([^\"]*)\"";
    Pattern pattern = Pattern.compile(regex);
    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MMM/yyyy:HH:mm:ss Z", Locale.ENGLISH);

    public LogEntry(String line) {
        Matcher matcher = pattern.matcher(line);
        if(matcher.find()) {
            this.ipAddr = matcher.group(1);
            this.path = matcher.group(6);
            this.referer = matcher.group(9);
            this.userAgent = new UserAgent(matcher.group(10));
            this.responseCode = Integer.parseInt(matcher.group(7));
            this.responseSize = Long.parseLong(matcher.group(8));
            this.time = LocalDateTime.parse(matcher.group(4), formatter);
            this.method = httpMethod.valueOf(matcher.group(5));
        } else {
            throw new RuntimeException("Строка не соответствует формату");
        }
    }


    public String getIpAddr() {
        return ipAddr;
    }

    public String getPath() {
        return path;
    }

    public String getReferer() {
        return referer;
    }

    public UserAgent getUserAgent() {
        return userAgent;
    }

    public int getResponseCode() {
        return responseCode;
    }

    public long getResponseSize() {
        return responseSize;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public httpMethod getMethod() {
        return method;
    }
}
