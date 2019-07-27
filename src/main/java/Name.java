public class Name {

    public Name() {
    }


    public int moduloFromName (String name){
        int result = 0;

        //given string to lower case
        name = name.toLowerCase();
        //remove space from given string
        name = removeSpace(name);

        //for loop to obtain sum from characters
        for (int i = 0; i < name.length(); i++){
            result = result + intFromChar(name.charAt(i));
        }

        //modulo from sum
        return result % 2;

    }

    public int intFromChar (char character){
        int numberFromChar;

        // -96 to have a = 1, b = 2 ...
        numberFromChar = character - 96;

        return numberFromChar;
    }

    public String removeSpace (String input){
        return input.replaceAll(" ", "");
    }

}
