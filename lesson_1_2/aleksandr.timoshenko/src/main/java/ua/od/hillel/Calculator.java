package ua.od.hillel;

import java.util.ArrayList;

public class Calculator {

  private int i;
  private int j;
  private int [] results = new int[4];

  public Calculator(){

  }

  public Calculator(int i, int j){
    this.i = i;
    this.j = j;
  }

  public int getI() {
    return i;
  }

  public void setI(int i) {
    this.i = i;
  }

  public int getJ() {
    return j;
  }

  public void setJ(int j) {
    this.j = j;
  }

  public int [] getResult() {
    return results;
  }

  public void setResult(int i, int number) {
    results[i] = number;
  }
}
