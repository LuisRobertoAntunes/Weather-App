package com.example.weatherapp.Domains;

public class FutureDomain {
    private String day;
    private String picPath;
    private String status;
    private int higtTemp;
    private int lowTemp;

    public FutureDomain(String day, String picPath, String status, int higtTemp, int lowTemp) {
        this.day = day;
        this.picPath = picPath;
        this.status = status;
        this.higtTemp = higtTemp;
        this.lowTemp = lowTemp;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getPicPath() {
        return picPath;
    }

    public void setPicPath(String picPath) {
        this.picPath = picPath;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getHigtTemp() {
        return higtTemp;
    }

    public void setHigtTemp(int higtTemp) {
        this.higtTemp = higtTemp;
    }

    public int getLowTemp() {
        return lowTemp;
    }

    public void setLowTemp(int lowTemp) {
        this.lowTemp = lowTemp;
    }
}
