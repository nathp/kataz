package org.p.kataz.shipping

/**
 * Copyright Xurmo Technologies.
 */
class Container {

    def type
    Kilo cargoWeight

    def Container(String type, Kilo kilo) {
        this.type = type
        cargoWeight = kilo
    }
    
}
