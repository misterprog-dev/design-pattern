package com.dsoumaila.pattern.factory;

public class Division implements Operation {
    @Override
    public int apply(int a, int b) throws Exception {
        if (b == 0) {
            throw new Exception("Impossible to divide with zero.");
        }

        return a / b;
    }
}
