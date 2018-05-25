package ua.od.hillel.calc.service.calculator;

import org.springframework.stereotype.Service;
import ua.od.hillel.calc.controller.dto.SimpleCalculatorResultDto;
import ua.od.hillel.calc.exception.DividedByZeroException;
import ua.od.hillel.calc.utils.calculator.Calculator;
import ua.od.hillel.calc.utils.calculator.Operator;

@Service
public class CalculatorService implements SimpleCalculator {
    @Override
    public SimpleCalculatorResultDto add(double operand1, double operand2) {
        return new SimpleCalculatorResultDto(operand1, operand2, Operator.ADD, Calculator.add(operand1, operand2));
    }

    @Override
    public SimpleCalculatorResultDto sub(double operand1, double operand2) {
        return new SimpleCalculatorResultDto(operand1, operand2, Operator.SUB, Calculator.sub(operand1, operand2));
    }

    @Override
    public SimpleCalculatorResultDto mul(double operand1, double operand2) {
        return new SimpleCalculatorResultDto(operand1, operand2, Operator.MUL, Calculator.mul(operand1, operand2));
    }

    @Override
    public SimpleCalculatorResultDto div(double operand1, double operand2) throws DividedByZeroException {
        return new SimpleCalculatorResultDto(operand1, operand2, Operator.DIV, Calculator.div(operand1, operand2));
    }
}
