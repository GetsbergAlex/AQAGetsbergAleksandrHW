public class Arrays {
    public static void main(String args[]) {
        int[] number = {1, 1, 0, 0, 1, 1, 0, 0};//задать целочисленный массив,состоящий
        // из элементов 0 и 1. Например:[1,1,0,0,1,1,0,0].С помощью цикла и условия
        // заменить 0 на 1, 1 на 0
        for (int i = 0; i < number.length; i++) {
            if (number[i] == 1) {
                number[i] = 0;
            } else {
                number[i] = 1;
            }
            System.out.println(number[i]);
        }
        System.out.println();


        int[] arr = new int[100];//Задать пустой целочисленный массив длиной 100.
        // С помощью цикла заполнить его значения 12345....100
        for (int i = 0; i < 100; i++) {
            arr[i] = i + 1;
            System.out.println(arr[i]);
        }
        System.out.println();


        int[] arr1 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};//задать массив [1,5,3,2,11,4,5,2,4,8,9,1]
        // пройти по нему циклом ,и числа < 6 умножить на 2
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] < 6) {
                arr1[i] *= 2;
            }
            System.out.println(arr1[i]);
        }
        System.out.println();

        int[][] matrice = new int[3][3];//создать квадратный двумерный целочисленный массив
        // ( количество строк и столбцов одинаковое), и с помощью цикла заполнит его
        // диагональные элементы единицами( можно одну диагональ).
        for (int i = 0; i < matrice.length; i++) {
            for (int j = 0; j < matrice[i].length; j++) {
                if (i == j) {
                    matrice[i][j] = 1;
                }

                System.out.print(matrice[i][j]);
            }
            System.out.println();
        }
        System.out.println();







    }
}















