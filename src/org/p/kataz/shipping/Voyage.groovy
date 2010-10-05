package org.p.kataz.shipping

/**
 * Copyright Xurmo Technologies.
 */
class Voyage {

    def containers  = []

    def add(Container container) {
        containers << container
    }

    def cost(CostingRules rules) {
        for (c in containers) {
            rules.notifyContainer(c)
        }
        rules.cost()
    }
}
