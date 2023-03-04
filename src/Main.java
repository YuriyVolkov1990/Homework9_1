import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
    public static void task1() {
        System.out.println("Задача 1");
        int[] arr = generateRandomArray();
        int sum = 0;
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i : arr) {
            sum += i;
        }
        System.out.println("Сумма трат за месяц составила " +sum+ " рублей");
    }
    public static void task2() {
        System.out.println("Задача 2");
        int[] arr = generateRandomArray();
        int minElement, maxElement;
        minElement = arr[0];
        maxElement = arr[1];
        boolean rule = maxElement > minElement;
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println(rule);
        for (int i : arr) {
            if (!rule) {
                minElement = arr[1];
                maxElement = arr[0];
            }
            for (int k : arr) {
                if (k < minElement) {
                    minElement = k;
                } else if (k > maxElement) {
                    maxElement = k;
                }
            }
        }
        System.out.println("минимальный = "+minElement);
        System.out.println("максимальный = "+maxElement);
    }
    public static void task3() {
        System.out.println("Задача 3");
        int[] arr = generateRandomArray();
        double sum = 0;
        double averageValue;
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i : arr) {
            sum += i;
        }
        averageValue = sum / arr.length;
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");
        System.out.println("Средняя сумма трат за месяц составила " + averageValue + " рублей");
    }
    public static void task4() {
        System.out.println("Задача 4");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (char i : reverseFullName) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = reverseFullName.length-1; i >= 0; i--) {
            System.out.print(reverseFullName[i] + " ");
        }
    }
}