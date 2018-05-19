package ua.od.hillel.hwlesson4.servise;

import java.util.HashMap;
import java.util.Map;
import org.springframework.stereotype.Service;

@Service
public class CalculatorServise {


  public Map<String, String> actAdd(double val1, double val2, String userName) {
    Map<String, String> result = new HashMap<>();
    result.put("val1", Double.toString(val1));
    result.put("val2", Double.toString(val2));
    result.put("operation", "addition");
    result.put("result", Double.toString(val1 + val2));
    result.put("hello", userName);
    return result;
  }

  public Map<String, String> actSub(double val1, double val2, String userName) {
    Map<String, String> result = new HashMap<>();
    result.put("val1", Double.toString(val1));
    result.put("val2", Double.toString(val2));
    result.put("operation", "subtraction");
    result.put("result", Double.toString(val1 - val2));
    result.put("hello", userName);
    return result;
  }

  public Map<String, String> actMul(double val1, double val2, String userName) {
    Map<String, String> result = new HashMap<>();
    result.put("val1", Double.toString(val1));
    result.put("val2", Double.toString(val2));
    result.put("operation", "multiplication");
    result.put("result", Double.toString(val1 * val2));
    result.put("hello", userName);
    return result;
  }

  public Map<String, String> actDiv(double val1, double val2, String userName) {
    Map<String, String> result = new HashMap<>();
    result.put("val1", Double.toString(val1));
    result.put("val2", Double.toString(val2));
    result.put("operation", "division");
    if(val2 > 0){
      result.put("result", Double.toString(val1/val2));
    } else {
      result.put("result", "You try Divide By Zero" );
    }
    result.put("hello", userName);
    return result;
  }
}
