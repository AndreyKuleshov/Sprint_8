import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class PraktikumTests {
    private final String name;
    private final boolean expected;

    public PraktikumTests (String name, boolean expected) {
        this.name = name;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Object[][] getData() {
        return new Object[][]{
                {"Sid Vicious", true},
                {"S V", true},
                {"Sid  Vicious", false},
                {" Sid Vicious", false},
                {"Sid Vicious ", false},
                {"SidVicious", false},
                {"SV", false},
                {"Sid Viciousqweqweqw", true},
                {"Sid Viciousqweqweqwxxx", false},
                {"", false}
        };
    }

    @Test
    public void checkNameToEmbossTestTrue() {
        Account account = new Account(name);
        Assert.assertEquals(account.checkNameToEmboss(), expected);
    }
}
