import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //task 1
        System.out.println("Задача №1");
        //Целочисленный массив, заполненный тремя цифрами
        // — 1, 2 и 3 — с помощью ключевого слова new.
        int[] one = new int[3];
        one[0] = 1;
        one[1] = 2;
        one[2] = 3;
        //Массив, в котором можно хранить три дробных числа
        // — 1.57, 7.654, 9.986. Массив сразу заполните значениями.
        double[] twentyOne = {1.57, 7.654, 9.986};
        //или такой способ
        double[] two = new double[3];
        two[0] = 1.57;
        two[1] = 7.654;
        two[2] = 9.986;
        //Произвольный массив. Тип и количество данных определите сами.
        // Самостоятельно выберите способ создания массива:
        // с помощью ключевого слова или сразу заполненный элементами.
        int[] three = {10, 11, 12, 13, 14, 15, 16, 17, 18};
        //task2
        //Распечатайте на отдельной строчке элементы каждого массива по порядку через запятую.
        // В конце строки запятую ставить не надо.
        System.out.println("Задача №2");
        for (int i = 0; i < one.length; i++) {
            System.out.print(one[i]);
            if (i != one.length - 1)
                System.out.print(", ");
        }
        System.out.println();
        for (int i = 0; i < two.length; i++) {
            System.out.print(two[i]);
            if (i != two.length - 1)
                System.out.print(", ");
        }
        System.out.println();
        for (int i = 0; i < three.length; i++) {
            System.out.print(three[i]);
            if (i != three.length - 1)
                System.out.print(", ");
        }
        System.out.println();
        //task 3
        System.out.println("Задача №3");
        for (int i = one.length - 1; i >= 0; i--) {
            System.out.print(one[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = two.length - 1; i >= 0; i--) {
            System.out.print(two[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = three.length - 1; i >= 0; i--) {
            System.out.print(three[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        //task 4
        System.out.println("Задача №4");
        for (int i = 0; i < three.length; i++) {
            if (three[i] % 2 != 0) {
                three[i] += 1;
            }
        }
        System.out.println(Arrays.toString(three));
    }
}