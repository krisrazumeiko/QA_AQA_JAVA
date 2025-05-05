//14. Написать метод, принимающий на вход два аргумента: len и initialValue,
//    и возвращающий одномерный массив типа int длиной len, каждая ячейка которого равна initialValue.

public class hw_2_2_14 {
    public static void main(String[] args) {
        int[] arr = createArray(20, 23); //создаем массив через вызов метода

        for (int i = 0; i < arr.length; i++) { //печатаем массив
            System.out.print(arr[i] + " ");
        }
    }

    public static int [] createArray (int len, int initialValue) {
        int [] arr = new int[len];

        for (int i = 0; i < len; i++) {
            arr[i] = initialValue;
        }
        return arr; //возвращаем массив
    }
}