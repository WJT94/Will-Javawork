package com.example.model;

public class Device {
    public String name; // Mobile
    public String type; // Smartphone, etc.

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Device(String name, String type) {
        super();
        this.name = name;
        this.type = type;
    }

    public Device() {
        super();
    }
}
