import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import tdd.PasswordTool;

/**
 * Test a password is valid or not. A valid password must match these below conditions:
 * - Contain at least 8 characters
 * - Contain at least 1 number
 * - Contain at least 1 upper-case character
 */
public class PasswordToolTest {

    @Test
    public void shouldBeValidIfContain8Characters(){
        //Chuan bi du lieu
        String password = "myPassword1";

        //Chay phuong thuc can test
        boolean isValid = PasswordTool.isPasswordValid(password);

        //Doi chieu ket qua
        Assertions.assertEquals(true, isValid);
    }

    @Test
    public void shouldBeNotValidIfDoesNotContainAtleast1Number(){
        //Chuan bi du lieu
        String password = "myPassword";

        //Chay phuong thuc can test
        boolean isValid = PasswordTool.isPasswordValid(password);

        //Doi chieu ket qua
        Assertions.assertEquals(false, isValid);
    }
}
