package junit_test;

import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static junit.framework.TestCase.*;

@RunWith(Parameterized.class)
public class BankAccountTestParametrized {

    private BankAccount bankAccount;

    private double amount;
    private boolean branch;
    private double expected;

    public BankAccountTestParametrized(double amount, boolean branch, double expected) {
        this.amount = amount;
        this.branch = branch;
        this.expected = expected;
    }

    @org.junit.Before
    public void setup(){
        bankAccount = new BankAccount("Tim", "Bob", 1000.00,BankAccount.CHECKING);
        System.out.println("Running a test...");
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testConditions() {
        return Arrays.asList(new Object[][] {
                {100.00, true, 1100.00},
                {200.00, true, 1200.00},
                {325.14, true, 1325.14},
                {489.33, true, 1489.33},
                {1000.00, true, 2000.00}
        });
    }

    @org.junit.Test
    public void getBalance_deposit() throws Exception{
        bankAccount.deposit(amount,branch);
//        assertEquals(expected,bankAccount.getBalance(),0);
        assertEquals(expected,bankAccount.getBalance(),.01);
    }
}
