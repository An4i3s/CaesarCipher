public class HackCaesar {

    //a class that decipher a caesar text without knowing the key
    // takes as input a Cyphered Text
    //make it a static method?
    //the key must be between 0 and 26
   // int unknownKey = 0;


    public HackCaesar() {
    }

   public void hack(String encryptedText) {
       // int unknownKey = 0;
       for (int i = 0; i < 26; i++) {
           ReverseCaesarCypher x = new ReverseCaesarCypher();
           System.out.println("For key = " + i + " the result is:");
           System.out.println(x.decriptCaesar(encryptedText, i));
       }


   }
}
