package seminar3;

import java.util.ArrayList;

public class Main2 {
/*
Создать список типа ArrayList
Поместить в него как строки, так и целые числа.
Пройти по списку, найти и удалить целые числа.
list.add("apple");
// list.add("5");
// list.add("orange");
// list.add("cucumber");
// list.add("6");
// list.add("100");
// list.add("raisins");
// list.add("meat");
 */
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        fillList(list);
        System.out.println(list);
        for (int i = list.size() - 1; i >= 0; i--) {
            if (list.get(i) instanceof Integer){
                list.remove(i);
//                i--;
            }
        }
        System.out.println(list);
    }

    static void fillList(ArrayList list) {
        list.add("apple");
        list.add(5);
        list.add("orange");
        list.add("cucumber");
        list.add(6);
        list.add(100);
        list.add(12.3);
        list.add("raisins");
        list.add("meat");
    }
}
