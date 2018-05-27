package od.ua.hillel;


import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import ua.od.hillel.Calculator;
import ua.od.hillel.CalculatorServ;

public class TestJUnitCalculator {

  Calculator calc = new Calculator(2, 2);;
  CalculatorServ calcService;

  @Before
  public void setUp(){

    calcService = new CalculatorServ();
  }
  @Test
  public void testAdd(){
    assertEquals(4, calcService.add());
  }

  @Test
      public void testSub(){
    assertEquals(0, calcService.sub());
  }
  @Test
  public void testMult(){
    assertEquals(0, calcService.mult());
  }

  @Test
  public void testDivision(){
    assertEquals(0, calcService.division());
  }

  @Test
  public void testRes(){
    int [] res = calc.getResult();
    assertArrayEquals(new int [] {4, 4, 4, 1}, res);
  }
}
