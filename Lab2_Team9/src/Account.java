/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Adam
 */
public class Account {
    private int accountNum;
    private int routingNum;
    private double balance;
    
    Account(int accountNum, int routingNum, double balance){
        this.accountNum = accountNum;
        this.routingNum = routingNum;
        this.balance = balance;
    }

    /**
     * @return the accountNum
     */
    public int getAccountNum() {
        return accountNum;
    }

    /**
     * @param accountNum the accountNum to set
     */
    public void setAccountNum(int accountNum) {
        this.accountNum = accountNum;
    }

    /**
     * @return the routingNum
     */
    public int getRoutingNum() {
        return routingNum;
    }

    /**
     * @param routingNum the routingNum to set
     */
    public void setRoutingNum(int routingNum) {
        this.routingNum = routingNum;
    }

    /**
     * @return the balance
     */
    public double getBalance() {
        return balance;
    }
    
    public void withdrawl(double amount){
       balance = balance - amount;
    }
    
    public void deposit (double amount){
        balance = balance + amount;
    }
    public String getInfo(){
        String accountInfo = ("Account Number: " + accountNum + " Routing Number: " + routingNum + " Balance: $" + balance);
        return accountInfo;
    }
}
