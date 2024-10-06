import java.util.Scanner;

public class FoodOrderingSystem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        int quantity;
        double total = 0;
        boolean ordering = true;

        while (ordering) {
            // Display the food menu
            System.out.println("\n*** Welcome to the Food Ordering System ***");
            System.out.println("1. Burger - $5.00");
            System.out.println("2. Pizza - $8.00");
            System.out.println("3. Sandwich - $4.00");
            System.out.println("4. Pasta - $7.00");
            System.out.println("5. Coke - $2.00");
            System.out.println("6. Finish Order and Show Total");
            System.out.println("Enter your choice: ");
            
            choice = sc.nextInt();

            switch (choice) {
                case 1:  // Burger
                    System.out.print("Enter quantity of Burgers: ");
                    quantity = sc.nextInt();
                    total += 5.00 * quantity;
                    System.out.println(quantity + " Burger(s) added to your order.");
                    break;

                case 2:  // Pizza
                    System.out.print("Enter quantity of Pizzas: ");
                    quantity = sc.nextInt();
                    total += 8.00 * quantity;
                    System.out.println(quantity + " Pizza(s) added to your order.");
                    break;

                case 3:  // Sandwich
                    System.out.print("Enter quantity of Sandwiches: ");
                    quantity = sc.nextInt();
                    total += 4.00 * quantity;
                    System.out.println(quantity + " Sandwich(es) added to your order.");
                    break;

                case 4:  // Pasta
                    System.out.print("Enter quantity of Pasta: ");
                    quantity = sc.nextInt();
                    total += 7.00 * quantity;
                    System.out.println(quantity + " Pasta(s) added to your order.");
                    break;

                case 5:  // Coke
                    System.out.print("Enter quantity of Cokes: ");
                    quantity = sc.nextInt();
                    total += 2.00 * quantity;
                    System.out.println(quantity + " Coke(s) added to your order.");
                    break;

                case 6:  // Finish order
                    ordering = false;
                    System.out.println("\nOrder Completed.");
                    System.out.println("Total Bill: $" + total);
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
        sc.close();
    }
}
