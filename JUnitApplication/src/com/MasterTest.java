package com;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({
    TestCustomer.class,
    TestPayment.class,
    TestProduct.class
})
public class MasterTest {
    
}
