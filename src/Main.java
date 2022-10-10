public class Main {
    public static void main(String[] args) {
        System.out.println("1.8. Методы");

        System.out.println("Задание 1");
        checkYear(2022);
        System.out.println();

        System.out.println("Задание 2");
        checkDevice(2010,'i');
        System.out.println();

        System.out.println("Задание 3");
        checkDistance(95);
        System.out.println();

    }

    public static void checkYear(int year) {
            if (((year %4 ==0) && (year %100 !=0)) || (year %400 ==0)) {
                System.out.println(year + " год является високосным");
            } else {
                System.out.println(year + " год не является високосным");
            }
    }

    public static void checkDevice(int clientDeviceYear,char device) {
        if (device == 'i' && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для IOS");
        } else {
            if (device == 'a' && clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для Android");
            }
        }
        if (device == 'i' && clientDeviceYear >= 2015) {
            System.out.println("Установите приложениe для IOS");
        } else {
            if (device == 'a' && clientDeviceYear >= 2015) {
                System.out.println("Установите приложениe для Android");
            }
        }
    }

    public static void checkDistance(int deliveryDistance) {
        int minDistance = 20;
        int maxDistance = 60;
        int dayDelivery = deliveryDistance/(maxDistance - minDistance);
        int firstDistance = deliveryDistance - dayDelivery*(maxDistance - minDistance);
        if (minDistance<=firstDistance && firstDistance<(maxDistance - minDistance)) {
            System.out.println("Потребуется дней: " + (dayDelivery + 2));
        } else {
            System.out.println("Потребуется дней: " + (dayDelivery + 1));
        }
    }

}