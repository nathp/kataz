package org.p.kataz.shipping

/**
 * Copyright Xurmo Technologies.
 */
class Kilo {
    static {
        Integer.metaClass.kilo = { ->
            new Kilo(delegate)
        }
    }

    int weight


    def Kilo(int weight) {
        this.weight = weight;
    }

    def multiply(Rate arg) {
        weight * arg.rate        
    }
}
