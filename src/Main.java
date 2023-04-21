import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Cupcake> cupcakeMenu = new ArrayList<>();
        ArrayList<Drink> drinkMenu = new ArrayList<>();

        Cupcake cupcake = new Cupcake();
        RedVelvet redVelvet = new RedVelvet();
        Chocolate chocolate = new Chocolate();

        Scanner input = new Scanner(System.in);
        String priceText;
        double price;

        System.out.println("We are in the middle of creating the cupcake menu. We currently have three cupcakes on the menu but we need to decide on pricing.");

        System.out.println("We are deciding on the price for our standard cupcake. Here is the description:");
        cupcake.type();
        System.out.println("How much would you like to charge for the cupcake? (Input a numerical number taken to 2 decimal places)");
        priceText = input.nextLine();
        price = Double.parseDouble(priceText);
        cupcake.setPrice(price);

        System.out.println("We are deciding on the price for our Red Velvet cupcake. Here is the description:");
        redVelvet.type();
        System.out.println("How much would you like to charge for the cupcake? (Input a numerical number taken to 2 decimal places)");
        priceText = input.nextLine();
        price = Double.parseDouble(priceText);
        redVelvet.setPrice(price);

        System.out.println("We are deciding on the price for our Chocolate cupcake. Here is the description:");
        chocolate.type();
        System.out.println("How much would you like to charge for the cupcake? (Input a numerical number taken to 2 decimal places)");
        priceText = input.nextLine();
        price = Double.parseDouble(priceText);
        chocolate.setPrice(price);

        cupcakeMenu.add(cupcake);
        cupcakeMenu.add(redVelvet);
        cupcakeMenu.add(chocolate);

        Drink water = new Drink();
        Soda soda = new Soda();
        Milk milk = new Milk();

        System.out.println("We are deciding on the price for our water. Here is the description:");
        water.type();
        System.out.println("How much would you like to charge for the water? (Input a numerical number taken to 2 decimal places)");
        priceText = input.nextLine();
        price = Double.parseDouble(priceText);
        water.setPrice(price);

        System.out.println("We are deciding on the price for our soda. Here is the description:");
        soda.type();
        System.out.println("How much would you like to charge for the soda? (Input a numerical number taken to 2 decimal places)");
        priceText = input.nextLine();
        price = Double.parseDouble(priceText);
        soda.setPrice(price);

        System.out.println("We are deciding on the price for our milk. Here is the description:");
        milk.type();
        System.out.println("How much would you like to charge for the milk? (Input a numerical number taken to 2 decimal places)");
        priceText = input.nextLine();
        price = Double.parseDouble(priceText);
        milk.setPrice(price);

        drinkMenu.add(water);
        drinkMenu.add(soda);
        drinkMenu.add(milk);

        Order customerOrder = new Order(cupcakeMenu, drinkMenu);

        // Print out the menu
        for (Cupcake c : cupcakeMenu) {
            System.out.println("Cupcake price: $" + c.getPrice());
            c.type();
            System.out.println();
        }

        // Print out the drink menu
        for (Drink d : drinkMenu) {
            System.out.println("Drink price: $" + d.getPrice());
            d.type();
            System.out.println();
        }

        input.close();
    }

    public static class Cupcake {
        public double price;

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public void type() {
            System.out.println("A basic, generic cupcake, with vanilla frosting");
        }
    }

    public static class RedVelvet extends Cupcake {
        @Override
        public void type() {
            System.out.println("A red velvet based cupcake, with cream cheese frosting.");
        }
    }

    public static class Chocolate extends Cupcake {
        @Override
        public void type() {
            System.out.println("A chocolate based cupcake, with chocolate frosting.");
        }
    }

    public static class Drink {
        public double price;

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public void type() {
            System.out.println("A bottle of water.");
        }
    }

    public static class Soda extends Drink {
        @Override
        public void type() {
            System.out.println("A bottle of soda.");
        }
    }

    public static class Milk extends Drink {
        @Override
        public void type() {
            System.out.println("A bottle of milk.");
        }
    }
}
