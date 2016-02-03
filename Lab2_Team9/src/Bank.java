/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
/**
 *
 * @author Arthur
 */
public class Bank {
    private String BankName;
    private ArrayList<Savings> savingsList;
    private ArrayList<Checking> checkingList;
    private ArrayList<Personal> personalList;
    private ArrayList<Commercial> commercialList;
    
    public Bank(String BankName)
    {
        this.BankName = BankName;
        this.savingsList = savingsList;
        this.checkingList = checkingList;
        this.personalList = personalList;
        this.commercialList = commercialList;
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
    public void addSavingsAccount(Savings newAccount){
        savingsList.add(newAccount);
    }
    public void getSavingsList(){
        for(int i=0; i < savingsList.size(); i++){
            Savings savings = savingsList.get(i);
            System.out.println(savings.getInfo());
        }
    }
    public void addCheckingAccoumt(Checking newAccoubt){
        checkingList.add(newAccoubt);
    }
    public void getCheckingList(){
        for(int i=0; i < checkingList.size(); i++){
            Checking checking = checkingList.get(i);
            System.out.println(checking.getInfo());
        }
    }
    public void addPersonal(Personal NewPersonal){
        personalList.add(NewPersonal);
        
    }
    public void getPersonalList(){
        for(int i=0; i < personalList.size(); i++){
            Personal personal = personalList.get(i);
            System.out.println(personal.getInfo());
        }
    }
    public void addCommercial(Commercial NewCommercial){
        commercialList.add(NewCommercial);
        
    }
    public void getCommercialList(){
        for(int i=0; i<commercialList.size(); i++){
            Commercial commercial = commercialList.get(i);
            System.out.println(commercial.getInfo());
        }
    }
}
