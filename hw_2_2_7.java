//7. Напишите метод, которому в качестве параметра передается целое число.
//   Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.
//   Замечание: ноль считаем положительным числом.

public class hw_2_2_7 {
    public static void main(String[] args) {
        checkValue(-5);
        checkValue(0);
        checkValue(3);
    }

    public static void checkValue (int a) {
        if (a < 0) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}