package com.qa.engines;

import org.springframework.stereotype.Component;

import com.qa.interfaces.Engine;

@Component("V8")
public class V8 implements Engine {
    public String spec() {
        return "V8";
    }
}
