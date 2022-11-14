package AnimalRescue;

public class Adopter {
    private String name;
    private double netWorth;

    public void setName(String name){
        this.name=name;
    }

    public String getName(){
        return name;
    }

    public void setNetWorth(double netWorth){
        this.netWorth=netWorth;
    }

    public double getNetWorth(){
        return netWorth;
    }
}