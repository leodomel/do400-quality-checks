package com.redhat.simple.calculator;

import java.security.SecureRandom;

public final class BasicCalculator extends Calculator {
    private final SecureRandom rand = new SecureRandom();
    public int random() {
        return this.rand.nextInt();
    }
}
