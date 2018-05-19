package od.ua.hillel;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;
import ua.od.hillel.Calculator;
import ua.od.hillel.CalculatorPerfome;
import ua.od.hillel.CalculatorServ;

public class TestMockitoCalculator {

  @Mock
  Calculator calculator;
  @Mock
  CalculatorServ calculatorService;
  CalculatorPerfome calculatorPerfome;

  @Rule public MockitoRule rule = MockitoJUnit.rule();

  @Before
  public void setUp(){
    this.calculatorPerfome = new CalculatorPerfome(calculatorService);
  }

  @Test
  public void testPerfom(){
    calculator.setI(2);
    calculator.setJ(2);
    when(calculatorService.add()).thenReturn(4);
    assertEquals(40, calculatorPerfome.perfom());
    verify(calculatorService).add();

  }

}
