/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Adam
 */
public class Checking extends Account{
    private Checks checks;
    
    Checking(int accountNumber, int routingNumber, double balance, Checks checks){
        super(accountNumber, routingNumber, balance);
        this.checks = checks;
    }

    /**
     * @return the checks
     */
    public Checks getChecks() {
        return checks;
    }

    /**
     * @param checks the checks to set
     */
    public void setChecks(Checks checks) {
        this.checks = checks;
    }
    
    @Override
    public String getInfo(){
     String  info = (super.getInfo() + " Check Info: " + checks);
     return info;
    }
    
}
