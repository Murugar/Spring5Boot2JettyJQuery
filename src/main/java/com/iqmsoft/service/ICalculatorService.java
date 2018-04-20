package com.iqmsoft.service;

import java.math.BigDecimal;

import com.iqmsoft.common.Operator;

public interface ICalculatorService {


    double calculate(BigDecimal firstNumber, BigDecimal secondNumber, Operator operator);

}
