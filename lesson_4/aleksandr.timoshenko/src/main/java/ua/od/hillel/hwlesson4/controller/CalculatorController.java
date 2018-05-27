package ua.od.hillel.hwlesson4.controller;

import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import ua.od.hillel.hwlesson4.servise.CalculatorServise;

@Controller
@RequestMapping("/calc")
public class CalculatorController {

  @Autowired
  CalculatorServise calculatorServise;


  @GetMapping("/{val1}/add/{val2}")
  @ResponseBody
  public Map<String, String> operationAdd(
      @PathVariable(name = "val1") double val1,
      @PathVariable(name = "val2") double val2,
      @RequestParam(name = "username") String userName) {
    return calculatorServise.actAdd(val1, val2, userName);
  }

  @GetMapping("/{val1}/sub/{val2}")
  @ResponseBody
  public Map<String, String> operationSub(
      @PathVariable(name = "val1") double val1,
      @PathVariable(name = "val2") double val2,
      @RequestParam(name = "username") String userName) {
    return calculatorServise.actSub(val1, val2, userName);
  }

  @GetMapping("/{val1}/mul/{val2}")
  @ResponseBody
  public Map<String, String> operationMul(
      @PathVariable(name = "val1") double val1,
      @PathVariable(name = "val2") double val2,
      @RequestParam(name = "username") String userName) {
    return calculatorServise.actMul(val1, val2, userName);
  }

  @GetMapping("/{val1}/div/{val2}")
  @ResponseBody
  public Map<String, String> operationDiv(
      @PathVariable(name = "val1") double val1,
      @PathVariable(name = "val2") double val2,
      @RequestParam(name = "username") String userName) {
    return calculatorServise.actDiv(val1, val2, userName);
  }
}
