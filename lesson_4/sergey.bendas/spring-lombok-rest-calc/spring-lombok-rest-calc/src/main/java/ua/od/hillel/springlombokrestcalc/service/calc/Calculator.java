package ua.od.hillel.springlombokrestcalc.service.calc;

@FunctionalInterface
public interface Calculator {

  static Calculator defineOperation(String op) {
    op = op.trim().toLowerCase();
    switch (op) {
      case "add":
        return new Adder();
      case "sub":
        return new Suber();
      case "mul":
        return new Muler();
      case "div":
        return new Diver();
      default:
        throw new RuntimeException("Unknown operation");
    }
  }

  Double calculate(Double val1, Double val2);
}
