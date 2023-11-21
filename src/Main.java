import java.util.Scanner;

//abcdefghijklmnopqrstuvwxyz
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        CaesarCypher myCypher = new CaesarCypher();
        ReverseCaesarCypher reverseCaesarCypher = new ReverseCaesarCypher();


        System.out.println("Enter a text you want to cipher");
        String userInput = scanner.nextLine();
        System.out.println("Enter a key");
        int key = scanner.nextInt();
        while ((key>25) || (key<0)){
            System.out.println("Please enter a key between 0 and 25");
            key = scanner.nextInt();
        }

        String cipherText = myCypher.caesarCypher(userInput, key);
        System.out.println("Cipher text is = "+cipherText);

        String decipher = reverseCaesarCypher.decriptCaesar(cipherText, key);
        System.out.println("Deciphered Text is "+decipher);
        scanner.close();

        HackCaesar myHack = new HackCaesar();
        myHack.hack(cipherText);
    }


}
