import java.util.Scanner;

public class MattDemo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
    
        while (true) {
            System.out.println("Please type any sentence of your choosing: ");
            
            String str = in.nextLine();
            String vowels = "";
            for (char c : str.toCharArray()) {
                if (Character.toString(c).matches("[aeiouAEIOU]"))
                    vowels += c;
            }

            System.out.println("Your statement: " + str);
            System.out.println("# of vowels: " + vowels.length());
            System.out.println("Your vowels: " + vowels.toUpperCase());
        }
    
    }
}