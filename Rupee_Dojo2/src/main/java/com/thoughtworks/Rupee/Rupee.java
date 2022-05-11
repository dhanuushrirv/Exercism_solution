package com.thoughtworks.Rupee;


public class Rupee {
    private final double value;

    public Rupee(double value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        Rupee newValue = (Rupee) obj;
        return this.value == newValue.value;
    }

}
