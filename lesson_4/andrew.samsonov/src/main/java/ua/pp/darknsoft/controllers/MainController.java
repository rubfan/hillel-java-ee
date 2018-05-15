package ua.pp.darknsoft.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import ua.pp.darknsoft.dto.Hello;
import ua.pp.darknsoft.dto.Result;
import ua.pp.darknsoft.services.Calculator;

@Controller
public class MainController {
    @Autowired
    Calculator calculator;

    @GetMapping(value = "/")
    @ResponseBody
    public Hello helloPage() {

        return new Hello();
    }

    @GetMapping(value = "/calc/{value1}/{operation}/{value2}")
    @ResponseBody
    public Result calc(@PathVariable int value1, @PathVariable String operation, @PathVariable int value2,
                       @RequestParam(defaultValue = "user_name") String user_name) {
        double res;
        switch (operation) {
            case "add":
                res = calculator.add(value1, value2);
                break;
            case "div":
                res = calculator.div(value1, value2);
                break;
            case "mul":
                res = calculator.mul(value1, value2);
                break;
            case "sub":
                res = calculator.sub(value1, value2);
                break;
            default:
                res = 0.0;
        }

        return new Result(value1, value2, operation, res, user_name);
    }
}
