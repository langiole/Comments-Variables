interface EvenNum {
    void computeEven(int[] arr);
}

public class TerryDemo {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};

        EvenNum inter = (param)->{
            for (int i : param) {
                if (i % 2 == 0) {
                    System.out.println("The even numbers are: " + i);
                }
            }
        };
        inter.computeEven(arr);
    }
}