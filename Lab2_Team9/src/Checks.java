/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Adam
 */
public class Checks {
    private int checkNumber;
    private double checkAmount;
    
    Checks(int checkNumber, double checkAmount){
        
        this.checkNumber = checkNumber;
        this.checkAmount = checkAmount;
    }

    /**
     * @return the checkNumber
     */
    public int getCheckNumber() {
        return checkNumber;
    }

    /**
     * @param checkNumber the checkNumber to set
     */
    public void setCheckNumber(int checkNumber) {
        this.checkNumber = checkNumber;
    }

    /**
     * @return the checkAmount
     */
    public double getCheckAmount() {
        return checkAmount;
    }

    /**
     * @param checkAmount the checkAmount to set
     */
    public void setCheckAmount(double checkAmount) {
        this.checkAmount = checkAmount;
    }
    
}
