package ua.od.hillel.springlombokrestcalc.service;

import org.springframework.stereotype.Service;
import ua.od.hillel.springlombokrestcalc.service.calc.Calculator;

@Service
public class CalculatorService {

  public Double calculate(String val1, String val2, String op) {
    Calculator calculator = Calculator.defineOperation(op);
    return calculator.calculate(Double.valueOf(val1), Double.valueOf(val2));
  }
}
