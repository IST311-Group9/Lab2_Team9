/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Arthur
 */
public abstract class Customer {
    private String AccountNum;
    private String PIN;
    
    public Customer(String AccountNum, String PIN)
    {
        this.AccountNum = AccountNum;
        this.PIN = PIN;
    }
    public String getInfo()
    {
        return "Account Number: "+AccountNum+", PIN: "+ PIN;
    }
    /**
     * @return the AccountNum
     */
    public String getAccountNum() {
        return AccountNum;
    }

    /**
     * @param AccountNum the AccountNum to set
     */
    public void setAccountNum(String AccountNum) {
        this.AccountNum = AccountNum;
    }

    /**
     * @return the PIN
     */
    public String getPIN() {
        return PIN;
    }

    /**
     * @param PIN the PIN to set
     */
    public void setPIN(String PIN) {
        this.PIN = PIN;
    }
    
}
