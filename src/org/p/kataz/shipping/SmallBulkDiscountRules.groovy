package org.p.kataz.shipping

/**
 * Copyright Xurmo Technologies.
 */
class SmallBulkDiscountRules implements CostingRules {

    def defaultRules = new DefaultCostingRules()

    def count = 0
    def discount = 0.8

    def Object notifyContainer(Container container) {
        defaultRules.notifyContainer(container)

        switch (container.type) {
            case "small": count++
        }            
    }

    def Object cost() {
        count >= 2 ? discountOn(defaultCost()) : defaultCost()
    }

    def discountOn(int cost) {
        cost * discount
    }

    def defaultCost() {
        defaultRules.cost()
    }
}
