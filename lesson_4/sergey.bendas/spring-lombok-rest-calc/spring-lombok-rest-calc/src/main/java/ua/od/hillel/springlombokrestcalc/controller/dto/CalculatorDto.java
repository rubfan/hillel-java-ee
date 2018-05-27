package ua.od.hillel.springlombokrestcalc.controller.dto;

import java.util.Objects;
import lombok.Data;

@Data
public class CalculatorDto {

  private Double val1;
  private Double val2;
  private String op;
  private Double result;
  private String hello;

  public CalculatorDto(Double val1, Double val2, String op, Double result, String hello) {
    this.val1 = val1;
    this.val2 = val2;
    this.op = op;
    this.result = result;
    this.hello = hello;
  }

  @Override
  public String toString() {
    return "CalculatorDto{" +
        "val1=" + val1 +
        ", val2=" + val2 +
        ", op='" + op + '\'' +
        ", result=" + result +
        ", hello='" + hello + '\'' +
        '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CalculatorDto that = (CalculatorDto) o;
    return Objects.equals(val1, that.val1) &&
        Objects.equals(val2, that.val2) &&
        Objects.equals(op, that.op) &&
        Objects.equals(result, that.result) &&
        Objects.equals(hello, that.hello);
  }

  @Override
  public int hashCode() {

    return Objects.hash(val1, val2, op, result, hello);
  }

  public void setVal1(Double val1) {

    this.val1 = val1;
  }

  public void setVal2(Double val2) {
    this.val2 = val2;
  }

  public void setOp(String op) {
    this.op = op;
  }

  public void setResult(Double result) {
    this.result = result;
  }

  public void setHello(String hello) {
    this.hello = hello;
  }

  public Double getVal1() {

    return val1;
  }

  public Double getVal2() {
    return val2;
  }

  public String getOp() {
    return op;
  }

  public Double getResult() {
    return result;
  }

  public String getHello() {
    return hello;
  }
}
