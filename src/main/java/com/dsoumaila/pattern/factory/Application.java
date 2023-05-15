package com.dsoumaila.pattern.factory;


import static com.dsoumaila.pattern.factory.Operator.DIVIDE;

public class Application {
    static int calculate(int a, int b, String operator) {
        int result = 0;

        if ("+".equals(operator)) {
            result = a + b;
        } else if ("*".equals(operator)) {
            result = a * b;
        } else if ("/".equals(operator)) {
            result = a / b;
        } else if ("-".equals(operator)) {
            result = a - b;
        }

        return result;
    }

    static int calculateWithFactory(int a, int b, Operator operator) throws Exception {
        return OperatorFactory.getOperation(operator)
                .orElseThrow(() -> new IllegalArgumentException("Invalid Operator"))
                .apply(a, b);
    }


    public static void main(final String[] args) throws Exception {
        System.out.println(calculate(1, 3, "+"));
        System.out.println(calculateWithFactory(10, 10, DIVIDE));
    }
}
