/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grantdavidproject;

import java.util.Scanner;

/**
 *
 * @author david
 */
public class Account {

    private String name;
    private double balance;

    private int pin;

    public Account(String name, int pin, double balance) {
        this.name = name;
        this.pin = pin;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
 
//Takes the parameter amount and get the balance from the checking account 
    // to update the balance of the account
    public void depositChecking(Checking checking, double amount) {
        double var = checking.getBalance();

        checking.setBalance(var + amount);

    }
//Takes the parameter amount1 and get the balance from the savings account 
    // to update the balance of the account
    public void depositSavings(Savings savings, double amount1) {

        double var = savings.getBalance();
        savings.setBalance(var + amount1);
    }
//Takes the parameter amount and get the balance from the checking account 
    // to update the balance of the account
    public double withdrawChecking(Checking checking, double amount) {

        double var = checking.getBalance();
        checking.setBalance(var - amount);
        return balance;
    }
//Takes the parameter amount and get the balance from the checking and savings account 
    // to update the balance of the account
    public void transferFromChecking(Checking checking, Savings savings, double amount) {

        double var1 = checking.getBalance();
        checking.setBalance(var1 - amount);
        double var2 = savings.getBalance();
        savings.setBalance(var2 + amount);
    }
//Takes the parameter amount and get the balance from the savings account 
    // to update the balance of the account
    public void withdrawSavings(Savings savings, double amount) {

        double var = savings.getBalance();
        savings.setBalance(var - amount);

    }
//Takes the parameter amount and get the balance from the checking and savings account 
    // to update the balance of the account
    public void transferFromSavings(Checking checking, Savings savings, double amount) {

        double var1 = savings.getBalance();
        savings.setBalance(var1 - amount);
        double var2 = checking.getBalance();
        checking.setBalance(var2 + amount);
    }
}
