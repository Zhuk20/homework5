public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }

    public static void task1() {
        System.out.println("Задание 1");
        byte clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }

    public static void task2() {
        System.out.println("Задание 2");
        int clientDeviceYear = 2015;
        byte clientOS = 1;
        if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else {
            System.out.println("Введите верные значения");
        }
    }
    public static void task3(){
        System.out.println("Задание 3");
        int year = 2023;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
            System.out.println("год является високосным");
        } else {
            System.out.println("год не является високосным");
        }
    }
    public static void task4(){
        System.out.println("Задание 4");
        int countDay = 0;
        int deliveryDistance = 95;
        if (deliveryDistance < 20){
            countDay += 1;
        } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            countDay += 2;
        } else if (deliveryDistance >= 60 && deliveryDistance < 100) {
            countDay += 3;
        } else if (deliveryDistance >= 100) {
            System.out.println("к выбранному адресу доставки нет");
        }
        System.out.println("Потребуется дней: " + countDay);
    }
    public static void task5(){
        System.out.println("Задание 5");
        int monthNumber = 12;
        switch (monthNumber){
            case 12:
            case 1:
            case 2:
                System.out.println("Месяц принадлежит к зимнему сезону");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Месяц принадлежит к весеннему сезону");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Месяц принадлежит к летнему сезону");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Месяц принадлежит к осеннему сезону");
                break;
            default:
                System.out.println("Введите правильный номер месяца");

        }
    }
}