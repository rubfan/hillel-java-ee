package ua.od.hillel.springlombokrestcalc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import ua.od.hillel.springlombokrestcalc.controller.dto.CalculatorDto;
import ua.od.hillel.springlombokrestcalc.service.CalculatorService;

@Controller
public class CalculatorController {


  @Autowired
  private CalculatorService calculatorService;

  @GetMapping("/calc/{val1}/{op}/{val2}")
  @ResponseBody
  public CalculatorDto calculate(@PathVariable("val1") String val1, @PathVariable("op") String op,
      @PathVariable("val2") String val2,
      @RequestParam(name = "name", required = false, defaultValue = "Stranger") String user_name) {
    Double result = calculatorService.calculate(val1, val2, op);
    return new CalculatorDto(Double.valueOf(val1), Double.valueOf(val2), op, result, user_name);
  }
}
