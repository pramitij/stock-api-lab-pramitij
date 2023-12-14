package edu.neu.csye7374;

public class Netflix extends Stock{

    private double percentChange;
    private double bid;

    public Netflix(String name, double price, String desc) {
        super.setName(name);
        super.setPrice(price);
        super.setDesc(desc);
    }

    public Netflix() {
    }

    private double getPercentaChange() {
        return this.percentChange;
    }

    private void setPercentChange(double percentChange){
        this.percentChange = percentChange;
    }

    public void setBid(double bid) {
        System.out.println("Setting bid for NewNetflix at "+bid+" \n");
        this.bid = bid;
        double oldPrice = this.getPrice();
        double newPrice = oldPrice +(this.bid- oldPrice);
        double percentChange = ((newPrice - oldPrice) / oldPrice) * 100;
        this.setPercentChange(percentChange);

    }


    public int getMetric() {
        return 5;
    }

}
