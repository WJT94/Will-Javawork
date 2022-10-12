package com;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class ExecutionPoint {
    public static void main(String[] args) {
        System.out.println("Start app");

        Result res = JUnitCore.runClasses(MasterTest.class);
        for (Failure fail : res.getFailures()) {
            System.out.println(fail.toString());
        }

        System.out.println("End app");
    }
}
