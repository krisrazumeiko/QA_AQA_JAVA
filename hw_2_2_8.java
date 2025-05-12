//8. Напишите метод, которому в качестве аргументов передается строка и число,
//   метод должен отпечатать в консоль указанную строку, указанное количество раз;

public class hw_2_2_8 {
    public static void main(String[] args) {
        printSomeText("hello task 2.2.8", 5);
    }

    public static void printSomeText (String s, int a) {
        for (int i = 1; i <= a; i++) {
            System.out.println(i + " " + s);
        }
    }
}