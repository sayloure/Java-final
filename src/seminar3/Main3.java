package seminar3;

import java.util.ArrayList;
import java.util.List;

public class Main3 {
    /*
Каталог товаров книжного магазина сохранен в виде двумерного списка List<ArrayList<String>> так,
что на 0й позиции каждого внутреннего списка содержится название жанра, а на остальных позициях - названия книг.
Напишите метод для заполнения данной структуры.
     */
    public static void main(String[] args) {
        List<List<String>> shopBook = new ArrayList<>();
        addBook(shopBook, "Роман", "Мастер и Маргарита");
        addBook(shopBook, "Сказка", "Золотой ключик");
        addBook(shopBook, "Роман", "Война и мир");
        addBook(shopBook, "Фентези", "Гарри Поттер");
        addBook(shopBook, "Сказка", "Репка");
        addBook(shopBook, "Сказка", "Репка");

        System.out.println(shopBook);
    }

    static void addBook(List<List<String>> shopBook, String genre, String nameBook){
        for (int i = 0; i < shopBook.size(); i++) {
            List<String> curList = shopBook.get(i);
            if (curList .get(0).equalsIgnoreCase(genre)){
                if (!curList.contains(nameBook)){
                    curList.add(nameBook);
                }
                return;
            }
        }
        List<String> list = new ArrayList<>();
        list.add(genre);
        list.add(nameBook);
        shopBook.add(list);
    }
}
