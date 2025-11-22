public class Main {
    public static void main(String[] args) {
        int initialBalance = 100;
        int topUp = 1600;
        int bonus = 0;

        if (topUp > 1000) {
            bonus = (topUp / 100);
        }

        int finalBalance = initialBalance + topUp + bonus;

        System.out.println("Начальный баланс: " + initialBalance + "руб.");
        System.out.println("Сумма пополнения: " + topUp + "руб.");
        System.out.println("Бонусные рубли: " + bonus + "руб.");
        System.out.println("Итоговый баланс: " + finalBalance + "руб.");


    }
}