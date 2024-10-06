
public class Main {
    public static void main(String args[]) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
        positiveNumber(-7);
        printString("небо", 5);

    }

    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");

    }


    public static void checkSumSign() {
        int a;
        int b;
        int c;
        a = 5;
        b = -8;
        c = a + b;
        if (c >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }

    }

    public static void printColor() {
        int value;
        value = 101;
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value > 0 & value < 100) {
            System.out.println("Желтый");
        } else if (value > 100) {
            System.out.println("Зеленый");
        }


    }

    public static void compareNumbers() {
        int a = 4;
        int b = 6;
        if (a >= b) {
            System.out.println("a>=b");
        } else {
            System.out.println("a<b");
        }

    }

    public static boolean number10To20(int a, int b) {
        int sum = a + b;
        return sum >= 10 & sum <= 20;
    }

    public static void positiveNumber(int var) {
        if (var >= 0) {
            System.out.println("var положительное число");
        } else {
            System.out.println("var отрицательное число");
        }

    }

    public static boolean negativeNumber(int var) {
        return var < 0;
    }

    public static void printString(String str, int i) {
        int c;
        for (c = 0; c < i; c++) {
            System.out.println(str);
        }
    }

    public static boolean leapYear(int n) {
        if (n % 100 != 0 & n % 400 == 0) {
            return true;
        } else if (n % 100 == 0) {
            return false;
        } else {
            return n % 4 == 0;
        }
    }


}
