import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class App {
    List<Integer> qsort(List<Integer> l_nums2) {
        if (l_nums2.size() <= 1) {
            List<Integer> result = new ArrayList<>();
            for (int num : l_nums2) {
                result.add(num);
            }
            return result;
        } else {
            Random rand = new Random();
            int q = l_nums2.get(rand.nextInt(l_nums2.size()));

            
            List<Integer> l_nums = new ArrayList<>();
            List<Integer> e_nums = new ArrayList<>();
            List<Integer> b_nums = new ArrayList<>();

            for (int n : l_nums2) {
                if (n < q) {
                    l_nums.add(n);
                } else if (n == q) {
                    e_nums.add(n);
                } else {
                    b_nums.add(n);
                }
            }

            List<Integer> result = new ArrayList<>();
            result.addAll(qsort(l_nums));
            result.addAll(e_nums);
            result.addAll(qsort(b_nums));
            
            return result;
        }
    }

    public static void main(String[] args) {
        List<Integer> m = new ArrayList<>();
        Collections.addAll(m, 0); 

        App app = new App();
        List<Integer> sortedList = app.qsort(m);

        System.out.println("Отсортированный массив:");
        for (int num : sortedList) {
            System.out.print(num + " ");
        }
    }
}
