public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();

    }

    public static void task1 () {
        System.out.println("Задача 1");
        int clientOS = 1;

        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Выбранная операция ошибочна");
        }
    }

    public static void task2 () {
        System.out.println("Задача 2");
        int clientOS1 = 3;
        int clientDeviceYear = 2014;

        if (clientDeviceYear >= 2015 && clientOS1 == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        else if (clientDeviceYear >= 2015 && clientOS1 == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        else if (clientDeviceYear < 2015 && clientOS1 == 0) {
            System.out.println("Установите облегченную приложения для iOS по ссылке");
        }
        else if (clientDeviceYear < 2015 && clientOS1 == 1)  {
            System.out.println("Установите облегченную приложения для Android по ссылке");
        } else {
            System.out.println("Выбор ошибочен");
        }
    }
    public static void task3 () {
        System.out.println("Задача 3");
        int year = 1800;

        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год является высокосным");
        } else {
            System.out.println(year + " год не является высокосным");
        }
    }

    public static void task4 () {
        System.out.println("Задача 4");
        int deliveryDistance = 150;

        int days = 1;

        if (deliveryDistance > 20) {
            days++;
        }
        if (deliveryDistance > 60 ) {
            days++;
        }
        System.out.println("Потребуется дней " + days);
    }
    public static void task5 () {
        System.out.println("Задача 5");
        int month = 13;

        switch (month) {
            case 1:
            case 2:
            case 12:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Вы указали несуществующий месяц " + month);
        }
    }
}
