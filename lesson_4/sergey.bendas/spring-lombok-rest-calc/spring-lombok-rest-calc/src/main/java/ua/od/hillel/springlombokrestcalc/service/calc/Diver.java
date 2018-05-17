package ua.od.hillel.springlombokrestcalc.service.calc;

public class Diver implements Calculator {

  @Override
  public Double calculate(Double val1, Double val2) {
    return val2.equals(0.0) ? null : val1 / val2;
  }
}
