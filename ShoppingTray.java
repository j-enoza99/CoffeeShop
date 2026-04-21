public class ShoppingTray {
    Customer customer;
    Flavor flavor;
    Coffee coffee;


    public ShoppingTray(Customer customer, Coffee coffee, Flavor flavor) {
        this.customer = customer;
        this.flavor = flavor;
        this.coffee = coffee;
    }

    public double getTotalPrice() {
        double cPrice = coffee.getPrice();
        double fPrice = flavor.getFPrice();
        double totalPrice = cPrice + fPrice;
        return totalPrice;

    }
}
