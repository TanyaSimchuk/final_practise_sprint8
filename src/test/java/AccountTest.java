import edu.praktikum.Account;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class AccountTest {
    @Test
    public void checkPositiveName() {
        Account account = new Account("Test Testov");
        assertTrue(account.checkNameToEmboss());
    }
    @Test
    public void testNameLength2Chars() {
        Account account = new Account("Or");
        assertFalse(account.checkNameToEmboss());
    }
    @Test
    public void testNameLength20Chars() {
        Account account = new Account("Konstantin Konstantinopolsky");
        assertFalse(account.checkNameToEmboss());
    }
    @Test
    public void testWithoutSpace() {
        Account account = new Account("OrOr");
        assertFalse(account.checkNameToEmboss());
    }
    @Test
    public void test2Spaces() {
        Account account = new Account("Or  or");
        assertFalse(account.checkNameToEmboss());
    }
    @Test
    public void testStartsWithSpace() {
        Account account = new Account(" Or Or");
        assertFalse(account.checkNameToEmboss());
    }
    @Test
    public void testEndsWithSpace() {
        Account account = new Account("Or Or ");
        assertFalse(account.checkNameToEmboss());
    }
}
