/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//Test
/**
 *
 * @author az060_001
 */
import java.util.*;
import java.io.*;
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Bank PNC = new Bank("PNC");
        String fName;
        String lName;
        String PIN;
        String CustomerID;
        int intID;
        Random rand = new Random();
        System.out.println("Enter 1 to create a Personal Account, 2 to create a Commercial");
        String customerType = in.next();
        if(customerType =="1")
        {
            System.out.println("Enter your first name");
            fName = in.next();
            System.out.println("Enter your first name");
            lName = in.next();
            System.out.println("Enter a four number PIN");
            PIN = in.next();
            intID = rand.nextInt((100 - 0) + 1) + 0;
            CustomerID = ""+intID;
            Personal personal = new Personal(CustomerID, PIN, fName, lName);
            PNC.addPersonal(personal);
            int accountNumber = rand.nextInt((100 - 0) + 1) + 0;
            int routingNumber = rand.nextInt((100 - 0) + 1) + 0;
            System.out.println("Enter C to create a Checking Account, S to create a Savings Account");
            String accountType = in.next();
            if (accountType == "C")
            {
                double balance = 100;
                Checks check = new Checks((rand.nextInt((100 - 0) + 1) + 0),100);
                Checking checking = new Checking(accountNumber, routingNumber, balance, check);
            }
            if (accountType == "P")
                
        }
        else if (customerType =="2")
        {
            
        }
        // TODO code application logic here
        //test2
//        Personal p_customer = new Personal("123456","1234","Adam","Warfield");
//        Checking p_checking = new Checking();
//        Bank PNC;
        
    }
    
}
