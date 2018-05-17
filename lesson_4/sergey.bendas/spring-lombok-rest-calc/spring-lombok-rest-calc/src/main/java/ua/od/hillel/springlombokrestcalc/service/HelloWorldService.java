package ua.od.hillel.springlombokrestcalc.service;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.stereotype.Service;
import ua.od.hillel.springlombokrestcalc.controller.dto.GreetingDto;

@Service
public class HelloWorldService {

  private static final String template = "Hello, %s!";
  private final AtomicLong counter = new AtomicLong();

  public GreetingDto sayHello(String name) {
    return new GreetingDto(counter.incrementAndGet(), String.format(template, name));
  }

}
