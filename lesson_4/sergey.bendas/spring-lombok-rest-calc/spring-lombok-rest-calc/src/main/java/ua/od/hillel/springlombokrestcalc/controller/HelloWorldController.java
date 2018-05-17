package ua.od.hillel.springlombokrestcalc.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import ua.od.hillel.springlombokrestcalc.controller.dto.GreetingDto;
import ua.od.hillel.springlombokrestcalc.service.HelloWorldService;

@Controller
public class HelloWorldController {

  @Autowired
  private HelloWorldService helloWorldService;

  @GetMapping("/hello-world")
  @ResponseBody
  public GreetingDto sayHello(
      @RequestParam(name = "name", required = false, defaultValue = "Stranger") String name) {
    return helloWorldService.sayHello(name);
  }

}
