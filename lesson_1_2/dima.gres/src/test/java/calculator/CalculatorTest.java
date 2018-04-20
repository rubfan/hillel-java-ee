package calculator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

  Calculator calculator;
  double delta = .001;

  @Before
  public void setUp() {
    calculator = new Calculator();
  }

  @Test
  public void add() {
    assertEquals(calculator.add(2, 3), 2. + 3., delta);
  }

  @Test
  public void sub() {
    assertEquals(calculator.sub(10,4), 10. - 4., delta);
  }

  @Test
  public void mult() {
    assertEquals(calculator.mult(4, 5), 4. * 5, delta);
  }

  @Test (expected = ArithmeticException.class)
  public void div() {
    assertEquals(calculator.div(10, 2), 10. / 2, delta);
    calculator.div(1, 0);
  }
}