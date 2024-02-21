package com.unoth.dashboardapp;

public class ContactDomain {
    private String name;
    private String picPath;

    public ContactDomain(String name, String picPath) {
        this.name = name;
        this.picPath = picPath;
    }

    public String getName() {
        return name;
    }

    public String getPicPath() {
        return picPath;
    }
}
