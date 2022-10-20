import java.util.*;

public class RunBloodData {
    public static void main(String[] args){
        BloodData bd = new BloodData();
        Scanner input = new Scanner(System.in);

        System.out.print("Enter blood type of patient: ");
        String bt = input.nextLine();
        bd.setBloodType(bt);
        if(bt.equals("")){
            System.out.print("Enter the Rhesus factor (+ or -): ");
            String rh = input.nextLine();
            bd.setRhFactor(rh);
            if(rh.equals("")){
                bd = new BloodData();
                bd.Display();
            }
        }else if(bt.equals("A") || bt.equals("B") || bt.equals("O") || bt.equals("AB")){
            System.out.print("Enter the Rhesus factor (+ or -): ");
            String rh = input.nextLine();
            bd.setRhFactor(rh);
            if(rh.equals("+") || rh.equals("-")){
                System.out.println(bd.getBloodType()+bd.getRhFactor()+" is added to BloodBank");
            }else{
                System.out.println("Invalid Input! Try Again!");
                System.exit(0);
            }
        }else{
            System.out.println("Invalid Input! Try Again!");
            System.exit(0);
        }

    }
}]