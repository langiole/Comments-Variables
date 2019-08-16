import java.util.HashMap;
import java.util.Scanner;

public class AbdulDemo {
    public static void main(String[] args) {
        HashMap<String, String> towns = new HashMap<>();

        towns.put("River Vale", "07675");
        towns.put("Northvale", "07647");
        towns.put("Closter", "07624");

        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.println("\nEnter a Bergen County town:");
            String town = in.nextLine();
            String zip = towns.get(town);
            if (zip == null) {
                System.out.println("\n" + town + " does not exist in Bergen County");
            }
            else {
                System.out.println("\n" + town + " zipcode is " + zip);
            }
        }
    }
}