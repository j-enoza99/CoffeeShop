import java.util.Scanner;
import java.util.ArrayList;

public class JaidaEspinozaDriver {
    public static void main(String[] args) {
        //Jaida Espinoza
        // THIS PROGRAM WILL ALLOW THE STORE OWNER TO INPUT DATA FOR THEIR COFFEE SHOP INVENTORY,
        // THEY WILL BE ABLE TO ENTER THE VARIETY OF COFFEE AND flavor AVAILABLE FOR THE DAY AND THEIR PRICES
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello shop owner!");

        //Coffee List
        ArrayList<String> coffeeTypes = new ArrayList<>();
        ArrayList<Double> coffeePrices = new ArrayList<>();

        //Flavor List
        ArrayList<String> flavors = new ArrayList<>();
        ArrayList<Double> flavorPrices = new ArrayList<>();

        //User input for different coffee types
        System.out.println("Enter a coffee type (type end to stop): ");
        String coffeeType = scanner.nextLine();

        while (!coffeeType.equalsIgnoreCase("end")) {
            coffeeTypes.add(coffeeType);
            System.out.println("Enter a coffee type (type end to stop): ");
            coffeeType = scanner.nextLine();
        }



        //User input for coffee prices
        for (int i = 0; i < coffeeTypes.size(); i++) {
            System.out.println("Enter price for " + coffeeTypes.get(i) + ": ");
            double price = scanner.nextDouble();
            coffeePrices.add(price);
        }
        System.out.println(coffeeTypes);
        System.out.println(coffeePrices);

        scanner.nextLine();

        //User input for different coffee flavors
        System.out.println("Enter a flavor (type end to stop): ");
        String coffeeFlavor = scanner.nextLine();

        while (!coffeeFlavor.equalsIgnoreCase("end")) {
            flavors.add(coffeeFlavor);

            System.out.println("Enter a flavor (type end to stop): ");
            coffeeFlavor = scanner.nextLine();
        }

        //User input for coffee flavors
        for (int i = 0; i < flavors.size(); i++) {
            System.out.println("Enter price for " + flavors.get(i) + ": ");
            double price = scanner.nextDouble();
            flavorPrices.add(price);
        }

        System.out.println(flavors);
        System.out.println(flavorPrices);

        System.out.println("Welcome to Jaida's Coffee Shop!");
        System.out.println("Enter your name: ");
        String customerName = scanner.nextLine();
        System.out.println("Enter your credit card number: ");
        String cc = scanner.nextLine();
        Customer customer = new Customer(customerName,cc);

        System.out.println("Choose a coffee type (or type 0 to end): ");
        System.out.println(" 1. Cappuccino \n 2. Latte \n 3. Americano \n 4. Frappuccino \n 0. End");
        int choice = scanner.nextInt();

        Coffee coffee1 = new Coffee();
        if (choice == 1) {
            coffee1 = new Coffee(coffeeTypes.get(0), coffeePrices.get(0));
        } else if (choice == 2) {
            coffee1 = new Coffee(coffeeTypes.get(1), coffeePrices.get(1));
        } else if (choice == 3) {
            coffee1 = new Coffee(coffeeTypes.get(2), coffeePrices.get(2));
        } else if (choice == 4) {
            coffee1 = new Coffee(coffeeTypes.get(3), coffeePrices.get(3));
        } else if (choice == 0) {
            return;
        }

        System.out.println("Choose a coffee flavor (or type 0 to end): ");
        int choice2 = scanner.nextInt();
        Flavor flavor1 = new Flavor();
        if (choice2 == 1) {
            flavor1 = new Flavor(flavors.get(0), flavorPrices.get(0));
        }
        else if (choice2 == 2) {
            flavor1 = new Flavor(flavors.get(1), flavorPrices.get(1));
        }
        else if (choice2 == 3) {
            flavor1 = new Flavor(flavors.get(2), flavorPrices.get(2));
        }
        else if (choice2 == 0){
            return;
        }

    ShoppingTray myTray = new ShoppingTray(customer, coffee1, flavor1);
        double totalPrice = myTray.getTotalPrice();
        System.out.println(customer.getName() + ", Your total balance is: " + totalPrice);
    }
}
