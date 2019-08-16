public class DonelysDemo {
    public static void checkAge(int age) {
        assert age >= 21 : "The person is underage, and therefore can't consume alcohol";
        System.out.println("The person is " + age + " years old and can consume alcohol");
    }
    public static void main(String[] args) {
        checkAge(22);
    }
}