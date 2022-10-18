package com.qa.cars;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.qa.interfaces.Car;
import com.qa.interfaces.Engine;

@Component("Audi") // This generates an Audi bean
public class Audi implements Car {
    @Autowired
    @Qualifier("V8")
    Engine eng;

    public String spec() {
        System.out.println(this.getClass().getSimpleName() + "'s engine is " + eng.spec());
        return eng.spec();
    }
    
}
