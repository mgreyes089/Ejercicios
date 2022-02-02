import java.util.Scanner;

public class Main {

    private static final int DOLLARS=1;
    private static final int POUNDS=2;
    private static final Double EURO_TO_DOLLARS=0.89;
    private static final Double EURO_TO_POUNDS=1.20;

    public static void main(String[] args) {
/*
        int money = askForMoney();
        int option = askForCurrencyOption();
        Double price=getCurrencyPrice(option);
        purchaseCurrency(money,price);
*/
    }

    private static void purchaseCurrency(int money, int price) {
    }

    private static Double getCurrencyPrice(int option) {
       // if(option==DOLLARS) return DOLLARS_PRICE;
        //if(option==POUNDS) return POUNDS_PRICE;
        //return 0;
return 0.0;
    }

    private static int askForCurrencyOption() {
        System.out.println("CAMBIOS DISPONIBLE: ");
        //System.out.println("1. DOLARS: " + DOLLARS_PRICE);
        //System.out.println("2. POUNDS: " + POUNDS_PRICE);

        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    private static int askForMoney() {
        System.out.println("Escriu quantitat en euros :");
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();

    }
}
