package com.coralogix.calculator.services;

import ...

@Service
public class AddService {
    public Result add(int a, int b) {
        int sum = a + b;
        return new Result(sum);
    }
}
