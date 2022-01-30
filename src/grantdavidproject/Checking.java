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
public class Checking extends Account {

    private boolean open;

    public Checking(boolean open, String name, int pin, double balance) {
        super(name, pin, balance);
        this.open = open;
    }

    public boolean isOpen() {
        return open;
    }

    public void setOpen(boolean open) {
        this.open = open;
    }

}
