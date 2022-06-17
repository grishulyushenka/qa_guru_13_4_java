package guru.qa.vgromova;

public class Main {

    public static void main(String[] args) {

        Base b = new Base();

        System.out.println("Деление на ноль " + (b.aInteger / b.aDouble)); // деление на ноль
        System.out.println("Сложение byte и short " + (b.aByte + b.aShort));
        System.out.println("Умножение long и float " + (b.aLong * b.aFloat));

        System.out.println("Первое значение массива  " + b.arr[0]); // вывести отдельное значение

        int aInteger = b.aInteger + 1; //переполнение int
        System.out.println("Переполнение int " + aInteger);

        long aLong = b.aLong + 1; //переполнение long
        System.out.println("Переполнение long " + aLong);

        double aDouble = b.aDouble + Double.MAX_VALUE;
        aDouble = aDouble * 10; // переполнение double
        System.out.println("Переполнение double " + aDouble);

        // операторы
        int a = 100 + 30;
        System.out.println("Результат сложения " + a);
        System.out.println("Результат сложения " + (100 + 30));
        int bb = 20000 - 1111;
        System.out.println("Результат вычитания " + bb);
        int c = 10 / 3;
        System.out.println("Результат деления " + c);
        int d = 10 % 3;
        System.out.println("Результат остатка от деления " + d);
        int e = 111 * 111;
        System.out.println("Результат умножения " + e);

        // логические операторы
        System.out.println("Результат выражения 3 > 2 " + b.result1);
        System.out.println("Результат выражения 3 >= 2 " + b.result2);
        System.out.println("Результат выражения 3 < 2 " + b.result3);
        System.out.println("Результат выражения 3 <= 2 " + b.result4);
        System.out.println("Результат выражения 3 != 2 " + b.result5);
        System.out.println("Результат выражения 3 == 2 " + b.result6);
        System.out.println("Результат выражения !(5 < 10) && 10 > 5 " + b.result7);
        System.out.println("Результат выражения !(5 < 10) || 10 > 5 " + b.result8);

        String first = "first";

        String[] str = new String[10];

        for (int i=0; i<10; i++) {
            if (str[0] == null && i == 0) {
                str[0] = first;
                System.out.println("1 значение массива - " + str[0]);
            } else {
                str[i] = String.valueOf(i+1);
                System.out.println((i + 1) + " значение массива - " + str[i]);
            }
        }
    }
}
