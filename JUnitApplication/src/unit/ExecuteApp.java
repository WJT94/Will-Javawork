package unit;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class ExecuteApp {
    public static void main(String[] args) {
        System.out.println("Run start");


        Result res = JUnitCore.runClasses(RunTest.class);
        System.out.println(res.getFailureCount() + " test(s) failed!");
        for (Failure fail: res.getFailures()) {
            System.out.println(fail.toString());
        }


        System.out.println("Run end");

        int test;
        System.out.println();
    }
}
