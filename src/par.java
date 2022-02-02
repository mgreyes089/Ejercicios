import java.util.Scanner;
public class par {


    public static void main(String[] args) {

        int number = askFornumber();
        kindOfNumber(number);

    }

    private static void kindOfNumber(int number) {
        if(number%2==0){
            System.out.println("Par");
        } else { System.out.println("Impar");}
    }

    private static int askFornumber() {
        System.out.println("Escriba el numero :");
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }
}


