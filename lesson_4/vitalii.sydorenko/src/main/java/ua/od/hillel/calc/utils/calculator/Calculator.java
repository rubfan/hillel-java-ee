package ua.od.hillel.calc.utils.calculator;

import ua.od.hillel.calc.exception.DividedByZeroException;

public class Calculator {
    public static double add(double operand1, double operand2) {
        return operand1 + operand2;
    }

    public static double sub(double operand1, double operand2) {
        return operand1 - operand2;
    }

    public static double mul(double operand1, double operand2) {
        return operand1 * operand2;
    }

    public static double div(double operand1, double operand2) throws DividedByZeroException {
        if (operand2 == 0) {
            throw new DividedByZeroException();
        }
        return operand1 / operand2;
    }
}
