public class Main {
    public static void main(String[] args) {
        task11();
        task12();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        dtask1();
        dtask2();
        dtask3();
        dtask4();
        dtask5();
        dtask6();
        dtask61();

    }

    private static void task11() {
        // я по началуне разобрался как использовать While.
        System.out.println("задание №1. вар 1");
        int salary = 15_000;
        int total = 0;
        int i = 0;
        for (; total < 2_459_000; i++) {
            total = total + total / 100;
            total = total + salary;
        }
        System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей.");
    }

    private static void task12() {
        System.out.println("задание №1. вар 2");
        int salary = 15_000;
        int total = 0;
        int i = 0;
        while (total < 2_459_000) {
            i++;
            total = total + total / 100;
            total = total + salary;
        }
        System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей." + "\n");

    }

    private static void task2() {
        System.out.println("задание №2");
        for (int num = 10; num >= 1; num--) {
            System.out.print(num + "; ");
        }
        System.out.println();

        int num1 = 1;
        while (num1 <= 10) {
            System.out.print(num1 + "; ");
            num1 = num1 + 1;
        }
        System.out.println("\n");

    }

    private static void task3() {
        System.out.println("задание №3. вар 1");
        int human = 12_000_000;
        int year = 2023;
        for (; year < 2033; year++) {
            int birthRate = human / 1000 * 17;
            int mortality = human / 1000 * 8;
            int total = birthRate - mortality;
            human = human + total;
            System.out.println("Год " + year + " численность населения составляет " + human +
                    " рождаемость: " + birthRate + " смертность: " + mortality);
        }
        System.out.println("задание №3. вар 2");
        int human1 = 12_000_000;
        int year1 = 2023;
        while (year1 < 2033) {
            year1++;
            int birthRate1 = human1 / 1000 * 17;
            int mortality1 = human1 / 1000 * 8;
            int total1 = birthRate1 - mortality1;
            human1 = human1 + total1;
            System.out.println("Год " + year1 + " численность населения составляет " + human1 +
                    " рождаемость: " + birthRate1 + " смертность: " + mortality1);
        }
        System.out.println();
    }

    private static void task4() {
        System.out.println("задание №4");
        int money = 15000;
        int total = 0;
        int mount = 0;
        while (total < 12_000_000) {
            mount++;
            total = total + total / 100 * 7;
            total = total + money;
            System.out.println("Месяц " + mount + " Итого " + total);
        }
        System.out.println();
    }


    private static void task5() {
        System.out.println("задание №5");
        int money = 15000;
        int total = 0;
        int mount = 0;
        while (total < 12_000_000) {
            mount++;
            total = total + total / 100 * 7;
            total = total + money;
            if (mount % 6 == 0) {
                System.out.println("Месяц " + mount + " Итого " + total);
            }
        }
        System.out.println();
    }

    private static void task6() {
        System.out.println("задание №6");
        int money = 15000;
        int total = 0;
        int mount = 0;
        while (mount < (9 * 12)) {
            mount++;
            total = total + total / 100 * 7;
            total = total + money;
            if (mount % 6 == 0) {
                System.out.println("Месяц " + mount + " Итого " + total);
            }
        }
        System.out.println();
    }

    private static void task7() {
        System.out.println("задание №7");

        int day = 0;
        while (day < 31) {
            day++;
            if ((day - 3) % 7 == 0) {
                System.out.println("сегодня пятница, " + day + "-е число. Необходимо " +
                        "подготовить отчет.");
            }
        }
        System.out.println(" \n \n \n \n");
    }

    // доп. задания
    private static void dtask1() {
        System.out.println("доп.задание №1");
        int number = 1000;
        int divider = 4;
        int quantity = 5;
        while (quantity > 0) {
            if (number % divider == 0) {
                System.out.print(number + " ");
                quantity--;
            }
            number++;
        }
        System.out.println("\n");
    }

    private static void dtask2() {
        System.out.println("доп.задание №2");
        int i = 1;
        while (i < 10) {
            System.out.print(i + " ");
            i += 2;
        }
        System.out.println("\n");
    }

    private static void dtask3() {
        System.out.println("доп.задание №3");
        int i = 90;
        while (i >= 0) {
            System.out.print(i + " ");
            i -= 5;
        }
        System.out.println("\n");
    }

    private static void dtask4() {
        System.out.println("доп.задание №4");
        int num = 2;
        for (int i = 1; i <= 10; i++) {
            System.out.print(num + " ");
            num *= 2;
        }
        System.out.println("\n");
    }

    private static void dtask5() {
        System.out.println("доп.задание №5\nвыходные дни: ");
        int day = 0;
        while (day < 31) {
            day++;
            if ((day - 1) % 7 == 0) {
                System.out.print(day + " " + (day + 1) + " ");
            }
        }
        System.out.println("\n");
    }

    // это решение которое было на сайте
    private static void dtask6() {
        System.out.println("доп.задание №6. Вар1");
        int result = 0;
        int first = 1;
        int last = 999_999;
        for (int current = first; current <= last; current++) {
            int firstPart = current / 1000;
            int lastPart = current % 1000;
            if (firstPart == 0 || lastPart == 0) {
                continue;
            }
            int firstSum = calculateSumOfDigits(firstPart);
            int lastSum = calculateSumOfDigits(lastPart);
            if (firstSum == lastSum) {
                result++;
            }
        }
        System.out.println(result);
    }

    //этот блок для работы калькулятора, который выполняет сумму цыфр
    private static int calculateSumOfDigits(int num) {
        int result = 0;

        while (num > 0) {
            result += num % 10;
            num /= 10;
        }

        return result;
    }

    // скорее всего я бы его не решил, но принцип я понял, и поменял лишь только с for на while.
// теперь буду знать что есть функция сложение цыфр числа. я еще не сильно продвинулся по
// изучению языка посмотре ролики про массивы
    private static void dtask61() {
        System.out.println("доп.задание №6. Вар2");
        int result = 0;
        int first = 0;
        int current = first;
        while (current < 999_999) {
            current++;
            int firstPart = current / 1000;
            int lastPart = current % 1000;
            if (firstPart == 0 || lastPart == 0) {
                continue;
            }
            int firstSum = calculateSumOfDigits(firstPart);
            int lastSum = calculateSumOfDigits(lastPart);
            if (firstSum == lastSum) {
                result++;
            }
        }
        System.out.println(result);
    }
}