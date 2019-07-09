package learningJava;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ValidateISBNTest {

    @Test
    public void nineDigitsISBNareNotAllowed(){
       ValidateISBN validatator = new ValidateISBN();

       assertThrows(NumberFormatException.class,
               () ->{validatator.checkISBN("123456789");}
               );
    }

    @Test
    public void elevenDigitsISBNareNotAllowed(){
        ValidateISBN validatator = new ValidateISBN();

        assertThrows(NumberFormatException.class,
                () ->{validatator.checkISBN("12345678910");}
        );
    }

    @Test
    public void onlyDigitsAreAllowed(){
        ValidateISBN validatator = new ValidateISBN();

        assertThrows(NumberFormatException.class,
                () -> { validatator.checkISBN("helloworld"); }
        );
    }

    @Test
    public void checkAValidISBNfor10digitNumber(){
        ValidateISBN validator = new ValidateISBN();

        boolean result = validator.checkISBN("0140449116");

        assertTrue(result);
    }

    @Test
    public void checkAnInValidISBNfor10digitNumber(){
        ValidateISBN validator = new ValidateISBN();

        boolean result = validator.checkISBN("0140449117");

        assertFalse(result);
    }

    @Test
     public void valisdISBNthatendsWithAnX(){
        ValidateISBN validator = new ValidateISBN();

        boolean result = validator.checkISBN("012000030X");

        assertTrue(result);
    }
}
