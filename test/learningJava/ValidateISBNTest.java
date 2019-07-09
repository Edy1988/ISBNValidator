package learningJava;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ValidateISBNTest {

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
