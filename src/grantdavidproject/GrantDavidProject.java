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
public class GrantDavidProject {
//@Author David Grant
//@Version 4/24/2020
/* Five Major Tasks:
    1. Check Balance
    2. Deposit
    3. Withdraw
    4. Transfer
    5. Calculate Interest on Savings Account
 */   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Checking checking = new Checking(true, "Checking", 0, 0.0);
        Savings savings = new Savings(0.0, true, "name", 0, 0.0);

        CreateCheckingAccount checkAccountFrame = new CreateCheckingAccount(checking, savings);
        checkAccountFrame.setVisible(true);

    }
}
