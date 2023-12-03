public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        System.out.println("Задание 2");
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }

        System.out.println("Задание 3");
        for (int i = 0; i <= 17; i = i + 2) {
            System.out.println(i);
        }

        System.out.println("Задание 4");
        for (int i = 10; i >= -10; i--) {
            System.out.println(i);
        }

        System.out.println("Задание 5");
        for (int i = 1904; i <= 2096; i = i + 4) {
            System.out.println(i);
        }

        System.out.println("Задание 6");
        for (int i = 7; i <= 98; i = i + 7) {
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
            summaMoney = summaMoney + summaMoney / 100;
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


        System.out.println("Домашнее задание 7");
        System.out.println("Задание 1");
        int cash = 15000;
        int target = 2_459_000;
        int summMoney = 0;
        int i = 1;
        while (summMoney <= target) {
            summMoney = summMoney + cash;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + summMoney + " рублей");
            i = i + 1;
        }


        System.out.println("Задание 2");
        int variable = 10;
        int start = 1;
        while (start <= variable) {
            System.out.print(start + " ");
            start = start + 1;
        }
        System.out.println();
        for (; variable >= 1; variable--) {
            System.out.print(variable + " ");
        }

        System.out.println();
        System.out.println("Задание 3");
        int population = 12_000_000;
        float birthRate = (float) 17 / 1000;
        float mortality = (float) 8 / 1000;
        for (int year = 1; year < 11; year++) {
            population = (int) (population + (population * birthRate) - (population * mortality));
            System.out.printf("Год %d, численность населения составляет %d%n", year, population);
        }


        System.out.println("Задание 4");
        int totalMoney = 12_000_000;
        int month = 1;
        double monthInterest = 0.07;
        float totalSum = 15000;
        while (totalSum <= totalMoney) {
            totalSum += totalSum * monthInterest;
            System.out.printf("Месяц %d, сумма накоплений равна %.2f%n", month, totalSum);
            month++;
        }


        System.out.println("Задание 5");
        int totMoney = 12_000_000;
        int monthE = 1;
        double montheInterest = 0.07;
        float totSum = (float) 15000;
        while (totSum <= totMoney) {
            totSum += totSum * montheInterest;

            if (monthE % 6 == 0 ) {
                System.out.printf("Месяц %d, сумма накоплений равна %.2f%n", monthE, totSum);
            }
            monthE++;
        }


        System.out.println("Задание 6");
        int monthPurpose = 9 * 12;
        int mont = 1;
        double montInterest = 0.07;
        float sum = (float) 15000;
        while (mont <= monthPurpose) {
            sum += sum * montInterest;

            if (mont % 6 == 0 ) {
                System.out.printf("Месяц %d, сумма накоплений равна %.2f%n", mont, sum);
            }
            mont++;
        }


        System.out.println("Задание 7");
        int friday = 3;
        int days = 31;
        while (friday <= days) {
            System.out.println("Сегодня пятница, " + friday + "-е число. Необходимо подготовить отчет");
            friday += 7;
        }


        System.out.println("Задание 8");
        int currentYear = 2023;
        int startYear = currentYear - 200;
        int endYear = currentYear + 100;
        for (int year = startYear; year <= endYear; year++) {
            if (year % 79 == 0) {
                System.out.println(year);
            }
        }
    }
}