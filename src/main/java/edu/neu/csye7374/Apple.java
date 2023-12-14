package edu.neu.csye7374;

public class Apple extends Stock{

    private double price;

    public Apple(String name, double price, String desc){
        super.setName(name);
        super.setPrice(price);
        super.setDesc(desc);
    }

    public Apple() {

    }


    public void setBid(double bid) {
        System.out.println("Setting bid for NewNetflix at "+bid+" \n");
       // this.bid = bid;
        double oldPrice = this.getPrice();
        //double newPrice = oldPrice +(this.bid- oldPrice);
        //double percentChange = ((newPrice - oldPrice) / oldPrice) * 100;
        //this.setPercentChange(percentChange);
    }


    public int getMetric() {
        return 5;

    }


}