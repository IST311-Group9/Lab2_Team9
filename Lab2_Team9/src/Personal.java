/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Adam
 */
public class Personal extends Customer{
    private String fName;
    private String lName;
    
    Personal(String CustomerID, String PIN, String fName, String lName)
    {
        super(CustomerID, PIN);
        this.fName = fName;
        this.lName = lName;
    }
    @Override
    public String getInfo()
    {
        return super.getInfo() + ", First Name: "+fName + ", Last Name: " + lName;
    }
    /**
     * @return the fName
     */
    public String getfName() {
        return fName;
    }

    /**
     * @param fName the fName to set
     */
    public void setfName(String fName) {
        this.fName = fName;
    }

    /**
     * @return the lName
     */
    public String getlName() {
        return lName;
    }

    /**
     * @param lName the lName to set
     */
    public void setlName(String lName) {
        this.lName = lName;
    }
}
