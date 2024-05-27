public class Main {

    public static void main(String[] args) {
        int price = 20_398;
        int perMile = 20;
        int bonusMiles = price / perMile;

        System.out.println("Бонусные мили:" + bonusMiles);
    }
}
