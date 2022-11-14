package AnimalRescue;

public class AnimalFood {
    private String name;
    private double price;
    private int qty;
    private boolean stockAvailability;

public void setName(String name){
    this.name=name;
}

public String getName(){
    return name;
    }

    public void setPrice(double price){
    this.price=price;
    }

    public double getPrice(){
    return price;
    }

    public void setQty(int qty){
    this.qty=qty;
    }

    public int getQty(){
    return qty;
    }

    public void setStockAvailability(boolean stockAvailability){
    this.stockAvailability=stockAvailability;
    }

    public boolean getStockAvailability(){
    return stockAvailability;
    }
}