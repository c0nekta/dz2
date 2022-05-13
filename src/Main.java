public class Main {
    public static void main(String[] args) {
        int ticketPrice = 1000; // Стоимость билета
        int rub = 20; // мин колличество рублей для одной мили

        int miles = ticketPrice / rub;
        System.out.println("Вам начисленно милей: " + miles);

    }
}