package ua.od.hillel;

import java.util.ArrayList;
import java.util.List;

public class Bank {

  private String name;
  private Address adress;
  private List<Account> accounts;


  public Bank(String bankName, Address bankAdress) {
    this.name = bankName;
    this.adress = bankAdress;
    this.accounts = new ArrayList<>();
  }

  public void addAccount(Account account) {
    accounts.add(account);
  }

  public int countMoney() {
    int money = 0;
    for (Account account : accounts) {
      money += account.getMoney();
    }
    return money;
  }
}
