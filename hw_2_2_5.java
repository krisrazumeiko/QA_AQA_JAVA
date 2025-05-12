//5. Напишите метод, принимающий на вход два целых числа и проверяющий,
//  что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.

public class hw_2_2_5 {
    public static void main(String[] args) {
        System.out.println(checkSum(10, 2));
    }

    public static boolean checkSum(int a, int b) {
        return (a + b) >= 10 && (a + b) <= 20;
    }
}