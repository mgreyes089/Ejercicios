import java.util.Scanner;
public class login {

    private static final String PASSWORD=  "gaby";
    private static final String EMAIL=  "gaby@gmail.com";

    public static void main(String[] args) {

        String givenPassword = askForPassword();
        String givenEmail = askForEmail();
        isUser (PASSWORD,EMAIL,givenPassword,givenEmail);

    }

    private static void isUser(String password, String email, String givenPassword, String givenEmail) {
        if (password.equals(givenPassword)&& email.equals(givenEmail)) {
            System.out.println("Es válido");
        } else { System.out.println("Error");}
    }

    private static String askForEmail() {
        System.out.println("Email: ");
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }

    private static String askForPassword() {
        System.out.println("Password: ");
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }

}