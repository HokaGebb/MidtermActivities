
import java.util.Scanner;

public class RunBloodData {
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        BloodData bd;
        String bloodType;
        String rhFactor;
        
        System.out.print("Enter the blood type of patient: ");
        bloodType = input.nextLine();
        
        if(bloodType.equals("")){
            System.out.print("Enter the Rhesus factor (+ or -): ");
            rhFactor = input.nextLine();
            if(rhFactor.equals("")){
            bd = new BloodData();
            bd.Display();
            }
        }
        else if(bloodType.equals("A") || bloodType.equals("B") || bloodType.equals("O") || bloodType.equals("AB")){
                System.out.print("Enter the Rhesus factor (+ or -): ");
                rhFactor = input.next();
                if(rhFactor.equals("+") || rhFactor.equals("-")){
                bd = new BloodData(bloodType, rhFactor);
                 bd.Display();
        }else{
            System.out.println("Invalid Input! Try Again!");
            System.exit(0);
        }      
        }else{
            System.out.println("Invalid Input! Try Again!");
            System.exit(0);
        } 
    }
}