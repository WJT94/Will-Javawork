package com.qa.laptopapp.laptops;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.qa.laptopapp.interfaces.HDD;
import com.qa.laptopapp.interfaces.Laptop;

@Component("Dell")
public class Dell implements Laptop {
    @Autowired
    @Qualifier("1TB")
    HDD hdd;

    public String spec() {
        System.out.println(this.getClass().getSimpleName() + "'s HDD is " + hdd.storage());
        return hdd.storage();
    }
}
