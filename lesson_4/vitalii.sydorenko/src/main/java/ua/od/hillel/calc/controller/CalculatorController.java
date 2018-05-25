package ua.od.hillel.calc.controller;

import lombok.extern.log4j.Log4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import ua.od.hillel.calc.controller.dto.SimpleCalculatorResultDto;
import ua.od.hillel.calc.exception.DividedByZeroException;
import ua.od.hillel.calc.service.calculator.CalculatorService;

@Controller
@Log4j
@RequestMapping("/calc")
public class CalculatorController {
    private CalculatorService CalculatorService;

    @Autowired
    public CalculatorController(CalculatorService CalculatorService) {
        this.CalculatorService = CalculatorService;
    }

    @GetMapping("/{val1}/add/{val2}")
    @ResponseBody
    public SimpleCalculatorResultDto add(
            @PathVariable("val1") double val1,
            @PathVariable("val2") double val2,
            @RequestParam(name = "user_name", required = false) String name
    ) {
        SimpleCalculatorResultDto result = CalculatorService.add(val1, val2);
        result.setRequestedBy(name);
        log.info(result);
        return result;
    }

    @GetMapping("/{val1}/sub/{val2}")
    @ResponseBody
    public SimpleCalculatorResultDto sub(
            @PathVariable("val1") double val1,
            @PathVariable("val2") double val2,
            @RequestParam(name = "user_name", required = false) String name
    ) {
        SimpleCalculatorResultDto result = CalculatorService.sub(val1, val2);
        result.setRequestedBy(name);
        log.info(result);
        return result;
    }

    @GetMapping("/{val1}/mul/{val2}")
    @ResponseBody
    public SimpleCalculatorResultDto mul(
            @PathVariable("val1") double val1,
            @PathVariable("val2") double val2,
            @RequestParam(name = "user_name", required = false) String name
    ) {
        SimpleCalculatorResultDto result = CalculatorService.mul(val1, val2);
        result.setRequestedBy(name);
        log.info(result);
        return result;
    }

    @GetMapping("/{val1}/div/{val2}")
    @ResponseBody
    public SimpleCalculatorResultDto div(
            @PathVariable("val1") double val1,
            @PathVariable("val2") double val2,
            @RequestParam(name = "user_name", required = false) String name
    ) throws DividedByZeroException {
        SimpleCalculatorResultDto result = CalculatorService.div(val1, val2);
        result.setRequestedBy(name);
        log.info(result);
        return result;
    }
}
