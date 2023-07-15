import java.util.ArrayList;
import java.util.List;
import java.util.Random;

//        Пусть дан произвольный список целых чисел, удалить из него четные числа
public class Homework3_1 {
    public static void main(String[] args) {
        Random random = new Random();
        int n = random.nextInt(1,10);
        ArrayList list = new ArrayList();
        for (int i = 0; i < n; i++) {
            list.add(random.nextInt(1,100));
        }
        System.out.println(list);
        remove(list);
        System.out.println(list);

    }

    public static void remove(ArrayList<Integer> numbers)
    {
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i)%2 == 0){
                numbers.remove(i);
                i--;
            }
        }

    }

}