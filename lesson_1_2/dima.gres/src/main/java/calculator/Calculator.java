package calculator;

public class Calculator implements Calculable {
  @Override
  public double add(double operandFirst, double secondOperand) {
    return operandFirst + secondOperand;
  }

  @Override
  public double sub(double operandFisrt, double secondOperand) {
    return operandFisrt - secondOperand;
  }

  @Override
  public double mult(double operandFisrt, double secondOperand) {
    return operandFisrt * secondOperand;
  }

  @Override
  public double div(double operandFisrt, double secondOperand) {
    try {
      if (secondOperand == 0) throw new ArithmeticException("illegal second operand. I can't division by 0...");
    } catch (ArithmeticException exception) {
//      exception.printStackTrace();
    }

    return operandFisrt /secondOperand;
  }
}
