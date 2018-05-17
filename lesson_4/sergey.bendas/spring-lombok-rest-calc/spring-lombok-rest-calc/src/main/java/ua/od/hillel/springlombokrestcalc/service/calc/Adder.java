package ua.od.hillel.springlombokrestcalc.service.calc;

public class Adder implements Calculator {

  @Override
  public Double calculate(Double val1, Double val2) {
    return val1 + val2;
  }
}
