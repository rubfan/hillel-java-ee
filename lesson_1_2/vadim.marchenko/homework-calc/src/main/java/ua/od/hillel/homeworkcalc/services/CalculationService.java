package ua.od.hillel.homeworkcalc.services;

import org.springframework.stereotype.Service;
import ua.od.hillel.homeworkcalc.exceptions.UnknownOperationException;

@Service
public class CalculationService {

  public int initialOperation(String operation, int value1, int value2) {
    if (operation.equals("add")) {
      return addition(value1, value2);
    }
    if (operation.equals("div")) {
      return division(value1, value2);
    }
    if (operation.equals("mul")) {
      return multiplication(value1, value2);
    }
    if (operation.equals("sub")) {
      return subtraction(value1, value2);
    }
    throw new UnknownOperationException();
  }

  private int addition(int value1, int value2) {
    return value1 + value2;
  }

  private int subtraction(int value1, int value2) {
    return value1 - value2;
  }

  private int multiplication(int value1, int value2) {
    return value1 * value2;
  }

  private int division(int value1, int value2) {
    return value1 / value2;
  }

}
