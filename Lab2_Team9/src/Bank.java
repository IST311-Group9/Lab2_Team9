/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Arthur
 */
public class Bank {
    private String BankName;
    
    public Bank(String BankName)
    {
        this.BankName = BankName;
    }

    /**
     * @return the BankName
     */
    public String getBankName() {
        return BankName;
    }

    /**
     * @param BankName the BankName to set
     */
    public void setBankName(String BankName) {
        this.BankName = BankName;
    }
}
