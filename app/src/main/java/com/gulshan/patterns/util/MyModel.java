package com.gulshan.patterns.util;

// acts as database or network
// model
public class MyModel {
    String appName;
    String appDownloads;
    int appRating;

    public MyModel(String appName, String appDownloads, int appRating) {
        this.appName = appName;
        this.appDownloads = appDownloads;
        this.appRating = appRating;
    }

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public String getAppDownloads() {
        return appDownloads;
    }

    public void setAppDownloads(String appDownloads) {
        this.appDownloads = appDownloads;
    }

    public int getAppRating() {
        return appRating;
    }

    public void setAppRating(int appRating) {
        this.appRating = appRating;
    }
}
