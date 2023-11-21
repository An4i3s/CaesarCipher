public class CaesarCypher {

    public CaesarCypher() {
    }


    public  String caesarCypher(String text, int key){

        String cypherString = "";
        char[] strToChar = text.toCharArray();
        // How to circle through the alphabet
        for (int i = 0; i < text.length(); i++){
           if(Character.isLowerCase(strToChar[i])){
               int letterValue = ((((strToChar[i]+key)-97)%26)+97);
               char asciiToChar = (char) letterValue;
               cypherString += asciiToChar;
               //System.out.print("Value of Ascii toChar is ");
               //System.out.println(asciiToChar);
           } else if (Character.isUpperCase(strToChar[i])) {
               int letterValue = ((((strToChar[i]+key)-65)%26)+65);
               char asciiToChar = (char) letterValue;
               cypherString += asciiToChar;
               //System.out.print("Value of Ascii toChar is ");
               //System.out.println(asciiToChar);

           }else {
               cypherString += strToChar[i];
               //System.out.println("not a letter");
           }

        }
        return cypherString;
    }
}
