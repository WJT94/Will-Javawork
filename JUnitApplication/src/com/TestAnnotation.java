package com;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import unit.Calculator;

public class TestAnnotation {
    int maths;
    int english;
    int chemistry;    
    @BeforeClass
    public static void m1()
    {
        System.out.println("@BeforeClass we are generating the report card");
    }    
    @Before
    public void m2()
    {
        System.out.println("initialize the marks");
        this.chemistry=80;
        this.english=66;
        this.maths=75;
    }
    @After
    public void m3()
    {
        this.chemistry=0;
        this.english=0;
        this.maths=0;
        System.out.println("Result calculation completed");
    }
    @AfterClass
    public static void m4()    
    {
            System.out.println("@AfterClass  report generated");
    }
    @Ignore
    public void m5()
    {
        System.out.println("we are ignore othet subject marks calculation");
    }    
    @Test  
    public void runFindBig1() {        
        assertEquals(true,Calculator.findAvgMarks(maths,chemistry,english));
    }
    @Test  // check if FindBig() method returns right results
    public void runFindBig() {
        //assertequals check if first argument is equal to 2nd args
        assertEquals(500,Calculator.findBig(500, 200));
    }
}