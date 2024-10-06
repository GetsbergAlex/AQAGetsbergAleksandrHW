
public class Main {
    public static void main(String args[]) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
        positiveNumber(-7);
        printString("небо", 5);

    }

    public static void printThreeWords() {// метод printThreeWords()
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");

    }


    public static void checkSumSign() {//метод checkSumSign()
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

    public static void printColor() {//метод printColor()
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

    public static void compareNumbers() {//метод comparedNumbers()
        int a = 4;
        int b = 6;
        if (a >= b) {
            System.out.println("a>=b");
        } else {
            System.out.println("a<b");
        }

    }

    public static boolean number10To20(int a, int b) {// метод принимающий на вход два
        // целых числа и проверяющий,что их сумма лежит в пределах от 10 до 20(включительно0),
        // если да- вернуть true,в противном случае -false
        int sum = a + b;
        return sum >= 10 & sum <= 20;
    }

    public static void positiveNumber(int var) {//метод,которому в качестве параметра передается
        // целое число,метод должен передать в консоль ,положительное ли число передали или
        // отрицательное. Замечание: ноль считаем положительным числом
        if (var >= 0) {
            System.out.println("var положительное число");
        } else {
            System.out.println("var отрицательное число");
        }

    }

    public static boolean negativeNumber(int var) {//метод, которому в качестве параметра передается
        // целое число. Метод должен вернуть true,если число отрицательное ,и вернуть false если
        // положительное. Замечание: ноль считается положительным
        return var < 0;
    }

    public static void printString(String str, int i) {//метод, которому в качестве аргументов
        // передается строка и число. Метод должен отпечатать в консоль , указанное количество раз
        int c;
        for (c = 0; c < i; c++) {
            System.out.println(str);
        }
    }

    public static boolean leapYear(int n) {//метод,который определяет, является ли год високосным,
        // и возвращает boolean (високосный - true, не високосный - false). Каждый 4-ый год
        // является високосным,кроме каждого 100-го,при этом каждый 400-ый високосный.
        if (n % 100 != 0 & n % 400 == 0) {
            return true;
        } else if (n % 100 == 0) {
            return false;
        } else {
            return n % 4 == 0;
        }
    }


}
