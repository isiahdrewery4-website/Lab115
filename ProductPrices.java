import java.util.Scanner;

public class ProductPrices {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // A
        double[][] prices = new double[3][4];

        for (int i = 0; i < 3; i++) {

            System.out.println("Enter prices for Store " + (i + 1));

            for (int j = 0; j < 4; j++) {

                System.out.print("Price of Product " + (j + 1) + ": ");
                prices[i][j] = input.nextDouble();
            }
        }

        // Display prices
        System.out.println("\Product Prices:");

        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 4; j++) {

                System.out.print(prices[i][j] + "\t");
            }

            System.out.println();
        }

        // Calculate total for each store
        for (int i = 0; i < 3; i++) {

            double total = 0;

            for (int j = 0; j < 4; j++) {

                total = total + prices[i][j];
            }

            System.out.println("Total for Store "
                    + (i + 1) + ": " + total);
        }


        // B: String Array - Employee Information
        String[][] employees = {
            {"John", "Manager", "HR"},
            {"Mary", "Developer", "IT"},
            {"Peter", "Accountant", "Finance"},
            {"Sarah", "Analyst", "IT"}
        };

        // Display all employee information
        System.out.println("\nAll Employee Information:");

        for (int i = 0; i < employees.length; i++) {

            for (int j = 0; j < employees[i].length; j++) {

                System.out.print(employees[i][j] + " ");
            }

            System.out.println();
        }

        // Display employees in IT department
        System.out.println("\nEmployees in IT Department:");

        for (int i = 0; i < employees.length; i++) {

            if (employees[i][2].equals("IT")) {

                System.out.println(employees[i][0]);
            }
        }

        // Count employees in each department
        int hr = 0;
        int it = 0;
        int finance = 0;

        for (int i = 0; i < employees.length; i++) {

            if (employees[i][2].equals("HR")) {
                hr++;
            }
            else if (employees[i][2].equals("IT")) {
                it++;
            }
            else if (employees[i][2].equals("Finance")) {
                finance++;
            }
        }

        // Display counts
        System.out.println("\nEmployee Count:");

        System.out.println("HR: " + hr);
        System.out.println("IT: " + it);
        System.out.println("Finance: " + finance);

        input.close();
    }
}
