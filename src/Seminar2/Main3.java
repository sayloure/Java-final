package Seminar2;

public class Main3 {
    /*
    Напишите метод, который принимает на вход строку (String) и определяет является ли строка палиндромом (возвращает boolean значение).

    Полиндром - Слово или фраза, которые одинаково читаются слева направо и справа налево.
     */

    public static void main(String[] args) {
        String s = "аргентина манит негра";
        System.out.println(palindrom(s));
    }

    static boolean palindrom(String s){
        s = s.replace(" ", "");
        StringBuilder stringBuilder = new StringBuilder(s);
        stringBuilder.reverse();
        return stringBuilder.toString().equalsIgnoreCase(s);
    }
}
