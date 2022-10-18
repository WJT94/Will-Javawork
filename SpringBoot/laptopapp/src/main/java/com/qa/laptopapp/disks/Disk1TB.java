package com.qa.laptopapp.disks;

import org.springframework.stereotype.Component;

import com.qa.laptopapp.interfaces.HDD;

@Component("1TB")
public class Disk1TB implements HDD {
    public String storage() {
        return "1TB";
    }
}
