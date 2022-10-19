
public class BloodData {
    
    public static String bloodType;
    public static String rhFactor;
    
    public BloodData(){
        bloodType = "O";
        rhFactor = "+";
    }
    public BloodData(String bt, String rh){
        this.bloodType = bt;
        this.rhFactor = rh;
    }
    public void Display(){
        System.out.println(bloodType +""+ rhFactor +" is added to BloodBank");
    }
}