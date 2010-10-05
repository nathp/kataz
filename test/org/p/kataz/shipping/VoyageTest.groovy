package org.p.kataz.shipping
/**
 * Copyright Xurmo Technologies.
 */


import org.p.kataz.shipping.Voyage
import org.p.kataz.shipping.Container
import org.p.kataz.shipping.Kilo
import org.p.kataz.shipping.CostingRules
import org.p.kataz.shipping.DefaultCostingRules

public class VoyageTest extends GroovyTestCase {

    protected void setUp() {
        Kilo.class
        DefaultCostingRules.class
    }


    void test_add_single_container_and_calculate_cost() {
        Voyage v = new Voyage()
        v.add new Container("small", 100.kilo())
        assertEquals 1000 * 100, v.cost(new DefaultCostingRules())
    }

    void test_add_two_small_containers() {
        Voyage v = new Voyage()
        v.add new Container("small", 100.kilo())
        v.add new Container("small", 200.kilo())
        assertEquals 1000 * 100 + (1000 * 200), v.cost(new DefaultCostingRules())
    }

    void test_add_two_small_container_with_bulk_discount() {
        Voyage v = new Voyage()
        v.add new Container("small", 100.kilo())
        v.add new Container("small", 200.kilo())
        assertEquals (((1000 * 100 + (1000 * 200)) * 0.8), v.cost(new SmallBulkDiscountRules()))
    }
}
