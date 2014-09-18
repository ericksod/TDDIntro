package com.thoughtworks.accountbalance;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class AccountTests {
    Account myAccount;
    int initialBalance;

    @Before
    public void setUp(){
        initialBalance = 500;
        myAccount = new Account(initialBalance);
    }

    @Test
    public void shouldIncreaseMyBalanceWhenIDepositMoney(){

        myAccount.deposit(10);
        assertThat(myAccount.getBalance(), is(initialBalance + 10));
    }

    @Test
    public void shouldDecreaseMyBalanceWhenIWithdrawMoney(){
        myAccount.withdraw(50);
        assertThat(myAccount.getBalance(), is(initialBalance-50));


    }

    @Test
    public void shouldNotDecreaseMyBalanceWhenIWithdrawMoneyAndDoNotHaveEnoughToCoverTheWithdrawal(){

    }
}
