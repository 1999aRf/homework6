public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        for (int i = 1; i <= 10; i++ ) {
            System.out.println(i);
        }

        System.out.println("Задание 2");
        for (int i = 10; i >= 1; i-- ) {
            System.out.println(i);
        }

        System.out.println("Задание 3");
        for (int i = 0; i <= 17; i = i+2 ) {
            System.out.println(i);
        }

        System.out.println("Задание 4");
        for (int i = 10; i >= -10; i-- ) {
            System.out.println(i);
        }

        System.out.println("Задание 5");
        for (int i = 1904; i <= 2096; i = i + 4 ) {
            System.out.println(i);
        }

        System.out.println("Задание 6");
        for (int i = 7; i <= 98; i = i + 7 ) {
            System.out.println(i);
        }

        System.out.println("Задание 7");
        for (int i = 1; i <= 512; i = i * 2) {
            System.out.println(i);
        }

        System.out.println("Задание 8");
        int money = 29000;
        int summa = 0;
        for (int i = 1; i <= 12; i++) {
        summa = summa + money;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + summa + " рублей");
        }

        System.out.println("Задание 9");
        int moneys = 29000;
        int summaMoney = 0;
        for (int i = 1; i <= 12; i++) {
            summaMoney = summaMoney + summaMoney/100;
            summaMoney = summaMoney + moneys;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + summaMoney + " рублей");
        }

        System.out.println("Задание 10");
        int total;
        int number = 2;
        for (int i = 1; i <= 10; i++) {
            total = number * i;
            System.out.println("2 * " + i + " = " + total);
          }
        }
}