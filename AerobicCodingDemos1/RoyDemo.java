import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RoyDemo {
    public static void main(String[] args) {
        String dna = "ACGGGATTATGTAGCCCCTCGAUAGCCGCCCUCGAG";

        Pattern p1 = Pattern.compile("(ATG)");
        Matcher m1 = p1.matcher(dna);

        while (m1.find()) {
            System.out.println("(" + m1.start() + ", " + m1.end() + ")");
        }

        dna = m1.replaceAll("MET");

        Pattern p2 = Pattern.compile("(UAG)|(UAA)|(UGA)");
        Matcher m2 = p2.matcher(dna);

        while (m2.find()) {
            System.out.println("(" + m2.start() + ", " + m2.end() + ")");
        }

        dna = m2.replaceAll("*");
        System.out.println(dna);

    }
}