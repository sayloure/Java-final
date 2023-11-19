package seminar3;

import java.util.*;

public class Main {
    /*
    Заполнить список десятью случайными числами.
Отсортировать список методом sort() и вывести его на экран.
     */
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        randomNumbers(list, 10, 0, 10);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
        list.sort(Comparator.reverseOrder());
        System.out.println(list);
    }

    static void randomNumbers(ArrayList<Integer> list, int n, int min, int max) {
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            list.add(random.nextInt(min, max + 1));
        }
    }
}
