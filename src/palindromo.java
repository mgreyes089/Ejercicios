import java.util.Scanner;

public class palindromo {

    public static void main(String[] args) {

        String word = wordToOperate();
        String invertedWord = revertName(word);
        isPalindrome(word, invertedWord);

    }

    private static void isPalindrome(String word, String inverted) {
        if (word.equals(inverted)) {
            System.out.println("Es palíndromo");
        } else { System.out.println("No es palíndromo");}
    }

    private static String revertName(String word) {
        String invertedWord = "";
        for (int i = word.length() - 1; i >= 0; i--) {

            invertedWord += word.substring(i, i + 1);

        }
        return invertedWord;
    }

    private static String wordToOperate() {
        System.out.println("Escriba su palabra: ");
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();

    }


}
