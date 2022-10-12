package com;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import unit.Calculator;

public class TestProduct {
    @Test
    public void findBiggest() {
        assertEquals(26, Calculator.findBiggest(25, 26, 24, 23, -1));
    }
}
