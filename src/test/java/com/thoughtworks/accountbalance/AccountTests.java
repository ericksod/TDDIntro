package com.thoughtworks.accountbalance;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class AccountTests {
    @Test
    public void shouldIncreaseMyBalanceWhenIDepositMoney(){
        int initialBalance = 500;
        Account myAccount = new Account(initialBalance);
        myAccount.deposit(10);
        assertThat(myAccount.getBalance(), is(initialBalance+10));
    }

    @Test
    public void shouldDecreaseMyBalanceWhenIWithdrawMoney(){

    }

    @Test
    public void shouldNotDecreaseMyBalanceWhenIWithdrawMoneyAndDoNotHaveEnoughToCoverTheWithdrawal(){

    }
}
