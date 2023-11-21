public class ReverseCaesarCypher {



    public ReverseCaesarCypher() {
    }

    public  String decriptCaesar(String text, int key){

        String decriptCaesar = "";
        char[] strToChar = text.toCharArray();
        for (int i = 0; i < text.length(); i++){

            if(Character.isLowerCase(strToChar[i])){
                int letterValue = (((strToChar[i]-key)-97));
                char asciiToChar = (char) letterValue;
                //formula for decription Dn (x) = (xi - n) mod 26
                //If any case (Dn) value becomes negative (-ve), in this case, we will add 26 in the negative value.
                if (letterValue<0){
                    letterValue += 26;
                    asciiToChar = (char) ((letterValue%26)+97);
                }  else {
                    asciiToChar = (char) ((letterValue%26)+97);
                }
                decriptCaesar += asciiToChar;

            } else if (Character.isUpperCase(strToChar[i])) {
                int letterValue = (((strToChar[i]-key)-65));
                char asciiToChar = (char) letterValue;
                //if letter value is negative
                if (letterValue<0){
                    letterValue += 26;
                     asciiToChar = (char) ((letterValue%26)+65);
                }else {
                     asciiToChar = (char) ((letterValue%26)+65);
                }

                decriptCaesar += asciiToChar;

            }else {
                decriptCaesar += strToChar[i];
            }
        }
        return decriptCaesar;
    }


}
