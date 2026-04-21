public class Coffee {
    private String type;
    private double price;
    public Coffee(String type, double price) {
        this.type = type;
        this.price = price;
    }
    public Coffee (){
        this("",0);
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public double getPrice() {
        return this.price;
    }

}
