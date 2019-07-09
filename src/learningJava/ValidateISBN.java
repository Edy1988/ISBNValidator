package learningJava;

public class ValidateISBN  {

    public boolean checkISBN(String ISBN ) {

        if (ISBN.length() != 10) throw new NumberFormatException("ISBN numbers must be 10 digits long");

        int total = 0;

        for (int i = 0; i < 10; i++) {

            if(!Character.isDigit(ISBN.charAt(i))) throw new NumberFormatException("ISBN must contain digits only");

            total += ISBN.charAt(i) * (10 - i);
        }

        if(total % 11 == 0){
            return true;
        }
        else {
            return false;
        }
    }
}
