package ua.od.hillel.calc.controller.dto;

import lombok.Data;
import ua.od.hillel.calc.utils.calculator.Operator;

@Data
public class SimpleCalculatorResultDto {
    double operand1;
    double operand2;
    Operator operator;
    double result;
    String requestedBy;

    public SimpleCalculatorResultDto(double operand1, double operand2, Operator operator, double result) {
        this.operand1 = operand1;
        this.operand2 = operand2;
        this.operator = operator;
        this.result = result;
    }
}
