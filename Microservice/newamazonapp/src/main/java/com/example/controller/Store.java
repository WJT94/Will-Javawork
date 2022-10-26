package com.example.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.model.Device;
import com.example.model.Devices;

@Controller
public class Store {
    private Devices listOfDevices;
    
    @RequestMapping("/")
    public String home(){
        return "home";
    }

    @RequestMapping("/samsung")
    public ModelAndView samsung()
    {
        ModelAndView mv=new ModelAndView("samsung");
        List<Device> samsungList= new ArrayList<>();
        samsungList.add(new Device("Galaxy","smart phone"));
        samsungList.add(new Device("Note","smart tablet"));
        Devices listOfDevices=new Devices("Samsung",samsungList);
        String name="upasana";
        mv.addObject("devices",listOfDevices);
        mv.addObject("myname",name);
        return mv;
    }
}
