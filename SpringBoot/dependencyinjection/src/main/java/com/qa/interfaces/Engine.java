package com.qa.interfaces;

import org.springframework.stereotype.Component;

@Component // This generates an Engine bean
public interface Engine {
    public String spec();
}
