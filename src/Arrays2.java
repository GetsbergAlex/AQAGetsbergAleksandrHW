public class Arrays2{
    public static void main(String args[]) {
    }
    public static int[] returnArrey(int len, int initialValue) {// написать метод принимающий
        // на вход два аргумента: len и initialValue, и возвращающий одномерный массив типа
        // int длинной len, каждая ячейка которога равна initialValue.
        int[] arr2 = new int[len];
        for (int i = 0; i < len; i++) {
            arr2[i] = initialValue;
            System.out.println(arr2[i]);

        }
        return arr2;
    }
}