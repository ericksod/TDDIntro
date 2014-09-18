package com.thoughtworks.accountbalance;

/**
 * Created by DanielleErickson on 9/18/14.
 */
public class Account {
    int balance;
    public Account(int initialBalance){
        balance = initialBalance;
    }
    public boolean deposit(int toAdd){
        balance += toAdd;
        return true;
    }
    public int getBalance(){
        return balance;
    }


}
