package iilm.java.practicals;

import java.util.Scanner;

// Base Account class
class Acct {
    protected String name, accNo, accType;
    protected double bal;

    public Acct(String name, String accNo, String accType, double bal) {
        this.name = name;
        this.accNo = accNo;
        this.accType = accType;
        this.bal = bal;
    }

    public void dep(double amt) {
        if (amt > 0) {
            bal += amt;
            System.out.println("Deposited. Bal: " + bal);
        } else {
            System.out.println("Invalid amt.");
        }
    }

    public void showBal() {
        System.out.println("Bal: " + bal);
    }
}

// Savings Account class
class SavAcct extends Acct {
    private double intRate;

    public SavAcct(String name, String accNo, double bal, double intRate) {
        super(name, accNo, "Savings", bal);
        this.intRate = intRate;
    }

    public void addInt(int yrs) {
        if (yrs > 0) {
            double interest = bal * Math.pow(1 + intRate / 100, yrs) - bal;
            bal += interest;
            System.out.println("Int added for " + yrs + " yrs. Bal: " + bal);
        } else {
            System.out.println("Invalid yrs.");
        }
    }

    public void with(double amt) {
        if (amt > 0 && bal >= amt) {
            bal -= amt;
            System.out.println("Withdrew. Bal: " + bal);
        } else {
            System.out.println("Insufficient bal or invalid amt.");
        }
    }
}

// Current Account class
class CurrAcct extends Acct {
    private double minBal, svcChg;

    public CurrAcct(String name, String accNo, double bal, double minBal, double svcChg) {
        super(name, accNo, "Current", bal);
        this.minBal = minBal;
        this.svcChg = svcChg;
    }

    public void with(double amt) {
        if (amt > 0) {
            if (bal - amt >= 0) {
                bal -= amt;
                System.out.println("Withdrew. Bal: " + bal);
                if (bal < minBal) {
                    bal -= svcChg;
                    System.out.println("Below min. Svc chg: " + svcChg + ". Bal: " + bal);
                }
            } else {
                System.out.println("Insufficient bal.");
            }
        } else {
            System.out.println("Invalid amt.");
        }
    }
}

// Main class
public class BankMgmt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Savings Account
        SavAcct sav = new SavAcct("Rahul", "S123", 5000, 4);
        sav.dep(1000);
        sav.addInt(2);
        sav.with(2000);
        sav.showBal();

        // Current Account
        CurrAcct cur = new CurrAcct("Bob", "C456", 3000, 1000, 50);
        cur.dep(500);
        cur.with(2000);
        cur.with(2000); // Trigger svc chg
        cur.showBal();

        sc.close();
    }
}

