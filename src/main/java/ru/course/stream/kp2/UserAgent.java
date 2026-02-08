package ru.course.stream.kp2;

public class UserAgent {
    private final String typeOS, browser;

    public UserAgent(String str) {
        this.typeOS = os(str);
        this.browser = browser(str);
    }
    private String os (String str) {
        if (str.contains("Windows")) {
            return "Windows";
        } else if (str.contains("Mac OS")) {
            return "macOS";
        } else if (str.contains("Linux")) {
            return "Linux";
        } else {
            return "Unknown";
        }
    }
    private String browser(String str) {
        if (str.contains("Edge")) {
            return "Edge";
        } else if (str.contains("Opera/")) {
            return "Opera";
        } else if (str.contains("Firefox/")) {
            return "Firefox";
        } else if (str.contains("Chrome/")) {
            return "Chrome";
        } else {
            return "Unknown";
        }
    }

    public static boolean isBot(String str) {
        return str.contains("bot");
    }

    public String getTypeOS() {
        return typeOS;
    }

    public String getBrowser() {
        return browser;
    }
}
