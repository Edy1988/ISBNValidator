package learningJava;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ValidateISBNTest {

    @Test
    public void checkAValidISBNhas10digitsNumberThe10digitCase(){
        String isbn = "0140449116";
        assertEquals(10, isbn.length());

    }


    @Test
    public void checkAValidISBNfor10digitNumber(){
        ValidateISBN validator = new ValidateISBN();
        boolean result = validator.checkISBN("0140449116");
        assertTrue(result, "First value ");

        result = validator.checkISBN("0140449116");
        assertTrue(result, "Second value");

    }

    @Test
    public void checkAnInValidISBNfor10digitNumber(){
        ValidateISBN validator = new ValidateISBN();

        boolean result = validator.checkISBN("0140449117");

        assertFalse(result);
    }
}
