package org.p.kataz.shipping;/**
 * Copyright Xurmo Technologies.
 */




public class KiloTest extends GroovyTestCase {

    protected void setUp() {
           Kilo.class
           DefaultCostingRules.class
    }


    void test_calculating_cost() {
        assertEquals 200, 100.kilo() * 2.rate() 
    }
}
