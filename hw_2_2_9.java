//9. Напишите метод, который определяет, является ли год високосным, и возвращает boolean (високосный - true,
//   не високосный - false). Каждый 4-й год является високосным, кроме каждого 100-го,
//   при этом каждый 400-й – високосный.

public class hw_2_2_9 {
    public static void main(String[] args) {
        System.out.println(LeapYear (2025));
    }

    public static boolean LeapYear (int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            return true; // Год високосный
        } else {
            return false; // Год не високосный
        }
    }
}