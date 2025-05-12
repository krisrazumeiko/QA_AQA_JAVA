//11. Задать пустой целочисленный массив длиной 100.
//    С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 ... 100;

public class hw_2_2_11 {
    public static void main(String[] args) {
        int [] arr = new int [100];

        for (int i = 0; i < arr.length; i++) {
            System.out.println((arr[i] = i + 1) + " ");
        }
    }
}