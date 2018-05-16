package ua.od.hillel;

public class CalculatorPerfome {

  CalculatorServ calculatorService;
  Calculator calculator = new Calculator();


  public CalculatorPerfome(CalculatorServ calculatorService){
    this.calculatorService = calculatorService;
  }

  public int perfom(){
    return calculatorService.add()*10;
  }

}
