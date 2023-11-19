package Seminar2;

public class Main2 {
    /*
    Напишите метод, который сжимает строку.
Пример: вход aaaabbbcdd.
Результат: a4b3cd2
     */
    public static void main(String[] args) {
        String s = "aaaabbbcdd";
        System.out.println(work(s));

    }

    static String work(String s){
        int count = 1;
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i-1)){
                count ++;
            } else {
                stringBuilder.append(s.charAt(i-1));
                if (count > 1){
                    stringBuilder.append(count);
                    count = 1;
                }
            }
        }
        stringBuilder.append(s.charAt(s.length()-1));
        if (count > 1){
            stringBuilder.append(count);
            count = 1;
        }
        return stringBuilder.toString();
    }
}
