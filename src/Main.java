import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
    }
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] ledgerArrays = new int[30];
        for (int i = 0; i < ledgerArrays.length; i++) {
            ledgerArrays[i] = random.nextInt(100_000) + 100_000;
        }
        return ledgerArrays;
    }
    public static void task1() {
        int[] ledgerArrays = generateRandomArray();
        System.out.println(Arrays.toString(ledgerArrays));
        System.out.println();

        int sum = 0;
        for (int element : ledgerArrays) {
            sum += element;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");

        int maxPayment = ledgerArrays[0];
        for (int i = 0; i < ledgerArrays.length; i++) {
            if (ledgerArrays[i] > maxPayment) {
                maxPayment = ledgerArrays[i];
            }
        }
        int minPayment = ledgerArrays[0];
        for (int i = 0; i < ledgerArrays.length; i++) {
            if (ledgerArrays[i] < minPayment) {
                minPayment = ledgerArrays[i];
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minPayment + " рублей. Максимальная сумма трат за день составила " + maxPayment + " рублей");

        double monthlyAverageSpend = (double) sum / ledgerArrays.length;
        System.out.println("Средняя сумма трат за месяц составила " + monthlyAverageSpend + " рублей.");

        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }

    }
}