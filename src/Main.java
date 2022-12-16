import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static int[] arrayRandom(int day) {
        java.util.Random random = new java.util.Random();
        int[] array = new int[day];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100_000) + 100_000;
        }
        return array;
    }

    // Посчитать сумму всех выплат за месяц.

    public static void main(String[] args) {
        int[] array = arrayRandom(30);
        // Посчитать сумму всех выплат  за месяч
        int sum = 0;
        for (int numder : array) {
            sum += numder;
        }
        System.out.println("Сумма трат за месяц составила" + " " + sum + " " + " рублей");


        // Найти минимальную и максимальную трату за день
        int min = array[0];
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min){
                min = array[i];
            }
            if (array[i] > max){
                max = array[i];
            }
        }
        System.out.println("Минимальное значение =" + " " + min + " " +  "; Максимальное значение = " + "" + max);



        // Какую в среднем сумму наша компания тратила в течение данных 30 дней.
        System.out.println("Средняя сумма за месяц" + " " + (double) sum/array.length);

        // Исправить програму чтобы она правельно писала имя

        String string = "Иван Иванович Иванов";
        char[] stringToChar = string.toCharArray();
        System.out.println(Arrays.toString(stringToChar));
        for (int i = stringToChar.length - 1; i>= 0; i--){
            System.out.print(stringToChar[i]);
        }
    }
}








