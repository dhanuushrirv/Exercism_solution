package com.thoughtworks.Rupee;

import javax.management.relation.RelationSupport;

public class Rupee {
    private final double value;

    public Rupee(double value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object obj) {
        Rupee newValue= (Rupee) obj;
        return this.value == newValue.value;
    }
}
