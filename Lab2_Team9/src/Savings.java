/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Adam
 */
public class Savings extends Account{
    private double interestRate;
    
    Savings(int accountNum, int routingNum, double balance, double interestRate){
        super(accountNum, routingNum, balance);
        this.interestRate = interestRate;
        
        
    }

    /**
     * @return the interestRate
     */
    public double getInterestRate() {
        return interestRate;
    }

    /**
     * @param interestRate the interestRate to set
     */
    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }
    @Override
    public String getInfo(){
       String info = (super.getInfo() + " Interest Rate: " + interestRate);
       return info;
    }
    
}
