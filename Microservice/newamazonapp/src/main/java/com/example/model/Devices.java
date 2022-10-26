package com.example.model;

import java.util.List;

public class Devices {
    public String brandName; // Samsung
    public List<Device> devices; // Note, Galaxy, etc.

    public String getBrandName() {
        return brandName;
    }
    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }
    public List<Device> getDevices() {
        return devices;
    }
    public void setDevices(List<Device> devices) {
        this.devices = devices;
    }
    public Devices(String brandName, List<Device> devices) {
        super();
        this.brandName = brandName;
        this.devices = devices;
    }
    public Devices() {
        super();
    }

    
}
