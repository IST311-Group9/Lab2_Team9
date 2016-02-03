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
    private String CustomerID;
    private String PIN;
    
    public Customer(String CustomerID, String PIN)
    {
        this.CustomerID = CustomerID;
        this.PIN = PIN;
    }
    public String getInfo()
    {
        return "Account Number: "+CustomerID+", PIN: "+ PIN;
    }
    /**
     * @return the AccountNum
     */
    public String getCustomerID() {
        return CustomerID;
    }

    /**
     * @param AccountNum the AccountNum to set
     */
    public void setCustomerID(String CustomerID) {
        this.CustomerID = CustomerID;
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
