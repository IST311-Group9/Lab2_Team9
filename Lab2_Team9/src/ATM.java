/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Arthur
 */
public class ATM {
    private String location;
    private String ID;
    private double ATM_Balance;
    private String[] ATM_History;
    public ATM(String location, String ID, double ATM_Balance, String[] ATM_History)
    {
        this.location = location;
        this.ID = ID;
        this.ATM_Balance = ATM_Balance;
        this.ATM_History = ATM_History;
    }
    
    public String getInfo()
    {
        return "Location: "+location+", ATM ID: "+ID+", ATM Balance: "+ATM_Balance+", ATM History: "+ATM_History;
    }
    /**
     * @return the location
     */
    public String getLocation() {
        return location;
    }

    /**
     * @param location the location to set
     */
    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * @return the ID
     */
    public String getID() {
        return ID;
    }

    /**
     * @param ID the ID to set
     */
    public void setID(String ID) {
        this.ID = ID;
    }

    /**
     * @return the ATM_Balance
     */
    public double getATM_Balance() {
        return ATM_Balance;
    }

    /**
     * @param ATM_Balance the ATM_Balance to set
     */
    public void setATM_Balance(double ATM_Balance) {
        this.ATM_Balance = ATM_Balance;
    }

    /**
     * @return the ATM_History
     */
    public String[] getATM_History() {
        return ATM_History;
    }

    /**
     * @param ATM_History the ATM_History to set
     */
    public void setATM_History(String[] ATM_History) {
        this.ATM_History = ATM_History;
    }
}
