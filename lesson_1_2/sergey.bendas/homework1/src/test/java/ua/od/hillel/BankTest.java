package ua.od.hillel;


import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

public class BankTest {

  private Bank bank;

  @Mock
  String bankName;
  @Mock
  Address bankAdress;
  @Mock
  Human user1;
  @Mock
  Human user2;

  @Before
  public void createBank() {
    bank = new Bank(bankName, bankAdress);
  }

  @Test
  public void shouldCountMoney() {
    int moneys1 = 1000;
    int moneys2 = 2000;
    Account acc1 = new Account(user1, moneys1);
    Account acc2 = new Account(user2, moneys2);
    bank.addAccount(acc1);
    bank.addAccount(acc2);
    assertThat(bank.countMoney(), is(3000));
  }

}
