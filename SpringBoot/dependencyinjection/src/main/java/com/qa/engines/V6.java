package com.qa.engines;

import org.springframework.stereotype.Component;

import com.qa.interfaces.Engine;

@Component("V6")
public class V6 implements Engine {
    public String spec() {
        return "V6";
    }
}
