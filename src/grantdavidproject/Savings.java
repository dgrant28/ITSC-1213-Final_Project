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
public class Savings extends Account {

    private double interestRate;
    private boolean open;

    public Savings(double interestRate, boolean open, String name, int pin, double balance) {
        super(name, pin, balance);
        this.interestRate = interestRate;
        this.open = open;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public boolean isOpen() {
        return open;
    }

    public void setOpen(boolean open) {
        this.open = open;
    }

}
