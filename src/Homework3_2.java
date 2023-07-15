import java.util.*;

//        Задан целочисленный список ArrayList.
//        Найти минимальное, максимальное и среднее арифметическое из этого списка. Collections.max()
public class Homework3_2 {
    public static void main(String[] args) {
        Random random = new Random();
        int n = random.nextInt(1,20);
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(random.nextInt(1,100));
        }
        System.out.println(list);
        System.out.println("min " + min(list));
        System.out.println("min " + minShort(list));
        System.out.println("max " + maxShort(list));
        System.out.println(ave(list));
        reverse(list);
        System.out.println(list);
    }

    public static int min(ArrayList<Integer> list){
        int min = list.get(0);
        for (int element: list) {
            if (element < min){
                min = element;
            }
        }
        return min;
    }

    public static int minShort(ArrayList<Integer> list){
        return Collections.min(list);
    }
    public static int maxShort(ArrayList<Integer> list){
        return Collections.max(list);
    }
    public static void reverse(ArrayList<Integer> list){
        Collections.reverse(list);
    }

    public static double ave(ArrayList<Integer> list){
        Iterator iterator = list.iterator();
        int sum = 0;
        while(iterator.hasNext()){
            int number = (int) iterator.next();
            sum+=number;
        }
        return (double)sum / (double)list.size();


    }
}
