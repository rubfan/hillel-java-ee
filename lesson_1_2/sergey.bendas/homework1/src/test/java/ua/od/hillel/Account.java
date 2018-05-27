package ua.od.hillel;

public class Account {

  private Human owner;
  private int money;

  public Account(Human user, int money) {
    this.owner = user;
    this.money = money;
  }

  public int getMoney() {
    return money;
  }
}
