/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Arthur
 */
public class Commercial extends Customer{
    private String CompanyName;
    
    Commercial(String CustomerID, String PIN, String CompanyName)
    {
        super(CustomerID,PIN);
        this.CompanyName = CompanyName;
    }
    @Override
    public String getInfo()
    {
        return super.getInfo()+", Company Name: "+getCompanyName();
    }

    /**
     * @return the CompanyName
     */
    public String getCompanyName() {
        return CompanyName;
    }

    /**
     * @param CompanyName the CompanyName to set
     */
    public void setCompanyName(String CompanyName) {
        this.CompanyName = CompanyName;
    }
}
