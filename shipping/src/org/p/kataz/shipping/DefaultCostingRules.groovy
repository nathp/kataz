package org.p.kataz.shipping

/**
 * Copyright Xurmo Technologies.
 */
class DefaultCostingRules implements CostingRules {
    def cost = 0

    static {
        Integer.metaClass.rate = { ->
            new Rate(delegate)
        }
    }

    def notifyContainer(Container container) {
        switch (container.type) {
            case "small":
                cost += container.cargoWeight * 1000.rate() 
        }

    }

    def Object cost() {
        cost
    }


}
