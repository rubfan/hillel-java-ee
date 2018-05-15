package ua.od.hillel.homeworkcalc.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import ua.od.hillel.homeworkcalc.services.CalculationService;
import ua.od.hillel.homeworkcalc.services.UserService;

@Controller
public class CalculatorController {

  @Autowired
  private CalculationService calculationService;

  @Autowired
  private UserService userService;

  @GetMapping(path = "/hello/{name}")
  @ResponseBody
  public String helloWorld(@PathVariable("name") String name) {
    return "Hello, " + name;
  }

  @GetMapping(path = "/calc/{value1}/{operation}/{value2}")
  @ResponseBody
  public String calculation(@PathVariable("value1") int value1,
      @PathVariable("operation") String operation, @PathVariable("value2") int value2,
      @RequestParam(value = "user_name", required = false) String name) {
    int operationResult = calculationService.initialOperation(operation, value1, value2);
    return userService.operationResultToUser(operationResult, name);
  }

}
