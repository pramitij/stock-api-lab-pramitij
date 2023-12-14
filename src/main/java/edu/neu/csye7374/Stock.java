package edu.neu.csye7374;

public class Stock implements Tradable{

    private double price;
    private String name;
    private String desc;
    private double bid;

    @Override
    public double getPrice() {
        return price;
    }
    @Override
    public void setPrice(double price) {
        this.price = price;
    }
    @Override
    public String getName() {
        return name;
    }
    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getDesc() {
        return desc;
    }
    @Override
    public void setDesc(String desc) {
        this.desc = desc;
    }


    @Override
    public void setBid(double bid) {
        System.out.println("Entering bidding stock");
        this.bid = bid;
        this.price = getPrice() + ((bid - getPrice())*(getMetric()/100));
        setPrice(this.price);
        this.toString();
    }

    @Override
    public int getMetric() {
        return 5;
    }

    @Override
    public String toString(){
        return "Stock being traded: "+this.name+" : "+this.desc+" priced at " +this.price+"\n";
    }

}
