package com.qa.laptopapp.disks;

import org.springframework.stereotype.Component;

import com.qa.laptopapp.interfaces.HDD;

@Component("512GB")
public class Disk512GB implements HDD {
    public String storage() {
        return "512GB";
    }
}
