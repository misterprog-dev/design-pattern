package com.dsoumaila.pattern.factory;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import static com.dsoumaila.pattern.factory.Operator.*;
import static java.util.Optional.ofNullable;

public class OperatorFactory {
    static Map<Operator, Operation> operationMap = new HashMap<>();
    static {
        operationMap.put(ADD, new Addition());
        operationMap.put(SUBSTRACT, new Subtraction());
        operationMap.put(MULTIPLY, new Multiplication());
        operationMap.put(DIVIDE, new Division());
    }

    static Optional<Operation> getOperation(Operator operator) {
        return ofNullable(operationMap.get(operator));
    }
}
