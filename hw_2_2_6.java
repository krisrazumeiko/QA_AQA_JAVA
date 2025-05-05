//6. Напишите метод, которому в качестве параметра передается целое число, метод должен напечатать
//   в консоль, положительное ли число передали или отрицательное. Замечание: ноль считаем положительным числом.

public class hw_2_2_6 {
    public static void main(String[] args) {
        checkValue (0);
        checkValue (-1);
        checkValue (2);
    }

    public static void checkValue (int a) {
        if (a >= 0) {
            System.out.println("Число " + a + " " + "положительное :)");
        } else {
            System.out.println("Число " + a + " " + "отрицательное :(");
        }
    }
}