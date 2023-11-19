package HomeWork.ex2;

class Answer {
    public void printPrimeNums(){
        // Напишите свое решение ниже
        for (int i = 2; i <= 1000; i++) {
            boolean isPrime = true;
            if (i <= 1) {
                isPrime = false;
            } else if (i <= 3) {
                isPrime = true;
            } else if (i % 2 == 0 || i % 3 == 0) {
                isPrime = false;
            } else {
                int j = 5;
                while (j * j <= i) {
                    if (i % j == 0 || i % (j + 2) == 0) {
                        isPrime = false;
                        break;
                    }
                    j += 6;
                }
            }
            if (isPrime) {
                System.out.println(i);
            }
        }
    }
}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Printer{
    public static void main(String[] args) {

        Answer ans = new Answer();
        ans.printPrimeNums();
    }
}
