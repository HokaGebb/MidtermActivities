public class BloodData {
    private String bloodType;
    private String rhFactor;

    public BloodData(){
        bloodType = "0";
        rhFactor = "+";
    }
    public void setBloodType(String bt){
        this.bloodType = bt;
    }
    public String getBloodType(){
        return bloodType;
    }
    public void setRhFactor(String rf){
        this.rhFactor = rf;
    }
    public String getRhFactor(){
        return rhFactor;
    }
    public void Display(){
        System.out.println(bloodType + rhFactor +" is added to the blood bank.");
    }
}