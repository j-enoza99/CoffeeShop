public class Flavor {
    private String flavor;
    private double fPrice;

    public Flavor(String flavor, double fPrice) {
        this.flavor = flavor;
        this.fPrice = fPrice;
    }

    public Flavor() {
        this("",0);
    }

    public String getFlavor() {
        return flavor;
    }

    public double getFPrice() {
        return fPrice;
    }


}
