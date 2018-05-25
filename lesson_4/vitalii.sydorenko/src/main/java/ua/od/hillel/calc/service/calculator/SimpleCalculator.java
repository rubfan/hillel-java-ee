package ua.od.hillel.calc.service.calculator;

import ua.od.hillel.calc.controller.dto.SimpleCalculatorResultDto;
import ua.od.hillel.calc.exception.DividedByZeroException;

public interface SimpleCalculator {
    SimpleCalculatorResultDto add(double operand1, double operand2);
    SimpleCalculatorResultDto sub(double operand1, double operand2);
    SimpleCalculatorResultDto mul(double operand1, double operand2);
    SimpleCalculatorResultDto div(double operand1, double operand2) throws DividedByZeroException;
}
