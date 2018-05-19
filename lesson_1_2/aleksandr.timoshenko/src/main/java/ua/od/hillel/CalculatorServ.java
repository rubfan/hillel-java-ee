package ua.od.hillel;

public class CalculatorServ {

  Calculator calculator = new Calculator();

  public int add(){
    int addRes = calculator.getI()+calculator.getJ();
    calculator.setResult(0, addRes);
    return addRes;
  }

  public int sub(){
    int subRes = calculator.getI()-calculator.getJ();
    calculator.setResult(1, subRes);
    return subRes;
  }

  public int mult(){
    int multRes = calculator.getI()*calculator.getJ();
    calculator.setResult(2, multRes);
    return multRes;
  }

  public int division(){
    int divRes = calculator.getI()/calculator.getJ();
    calculator.setResult(3, divRes);
    return divRes;
  }



}
