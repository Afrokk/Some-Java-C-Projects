import java.util.Scanner;
import java.util.ArrayList;

public class ChargeAccValidation {
    private ArrayList<String> chargeList = new ArrayList<String>();
    
    public void makeChargeList() {
        chargeList.add("5658845");
        chargeList.add("4520125");
        chargeList.add("7895122");
        chargeList.add("8777541");
        chargeList.add("8451277");
        chargeList.add("1302850");
        chargeList.add("8080152");
        chargeList.add("4562555");
        chargeList.add("5552012");
        chargeList.add("5050552");
        chargeList.add("7825877");
        chargeList.add("1250255");
        chargeList.add("1005231");
        chargeList.add("6545231");
        chargeList.add("3852085");
        chargeList.add("7576651");
        chargeList.add("7881200");
        chargeList.add("4581002");
    }

    public boolean checkList(String AccNumber) {
        boolean result = false;
        for (String i : this.chargeList) {
           if ((AccNumber.equals(i)) == true) {
               result = true;
               break;
           } 
           else if ((AccNumber.equals(i)) == false) {
               result = false;
           }
        }
        return result;
    }

    public static void main(String[] args) {
        ChargeAccValidation ChargeAcc = new ChargeAccValidation();
        ChargeAcc.makeChargeList();
        Scanner scnr = new Scanner(System.in);
        String accNumber;
        System.out.print("Enter Charge Account Number: ");
        accNumber = scnr.next();
        if ((ChargeAcc.checkList(accNumber)) == true) {
            System.out.println("This account number is VALID."); 
        }
        else {
            System.out.println("This account number is INVALID.");  
        }
        scnr.close();
    }
}