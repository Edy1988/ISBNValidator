package learningJava;

public class ValidateISBN  {

    public boolean checkISBN(String ISBN ) {

        int total = 0;

        for (int i = 0; i < 10; i++) {
            total += ISBN.charAt(i) * (1 - i);
        }
        if(total % 11 == 0){
            return true;
        }
        else {
            return false;
        }
    }
}
