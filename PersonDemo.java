import java.util.Arrays;
import java.util.List;

public class PersonDemo {
    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(2,7,3,9,4,3,8);
        for (int i = 0; i < arr.size(); i++) {
            int j = arr.lastIndexOf(arr.get(i));
            while(i != j) {
                arr.remove(j);
                j = arr.lastIndexOf(arr.get(i));
            }
        }
        System.out.println(arr);
    }
}