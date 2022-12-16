package junit_test;

import static junit.framework.TestCase.*;

 public class BankAccountTest {

    private BankAccount bankAccount;
    private static int count;

    @org.junit.BeforeClass
    public static void beforeClass(){
        System.out.println("This executes before any test cases. Count = " + count++);
    }

    @org.junit.Before
    public void setup(){
        bankAccount = new BankAccount("Tim", "John", 1000.00, BankAccount.CHECKING);
        System.out.println("Running a test..");
    }

    @org.junit.Test
    public void deposit() throws Exception{
//        fail("This test has yet to be implemented");
//        BankAccount bankAccount = new BankAccount("Bob", "Minus", 1000.00, BankAccount.CHECKING);
        double balance = bankAccount.deposit(200.00,true);
        assertEquals(1200,balance,0);
//        assertEquals(1200,bankAccount.getBalance(),0);
    }

    @org.junit.Test
//    public void withdraw() throws Exception{
    public void withdraw_branch() throws Exception{
//        fail("This test has yet to be implemented");
        double balance = bankAccount.withdraw(600.00,true);
        assertEquals(400.00,balance,0);
    }

    @org.junit.Test(expected = IllegalArgumentException.class)
    public void withdraw_notBranch() throws Exception{
        double balance = bankAccount.withdraw(600.00,false);
        assertEquals(400.00,balance,0);
        fail("Should have thrown an IllegalArgumentException");
    }

/*     @org.junit.Test
     public void withdraw_notBranch() throws Exception{
         try{
             bankAccount.withdraw(600.00,true);
             fail("Should have thrown an IllegalArgumentException");
         }catch (IllegalArgumentException e){
             System.out.println("error "+e);
         }
     }*/



    @org.junit.Test
    public void getBalance_deposit() throws Exception{
//        fail("This test has yet to be implemented");
//        BankAccount bankAccount = new BankAccount("Bob", "Minus", 1000.00, BankAccount.CHECKING);
        bankAccount.deposit(200.00,true);
        assertEquals(1200.00,bankAccount.getBalance(),0);
    }

    @org.junit.Test
    public void getBalance_withdraw() throws Exception{
//        fail("This test has yet to be implemented");
//        BankAccount bankAccount = new BankAccount("Bob", "Minus", 1000.00, BankAccount.CHECKING);
        bankAccount.withdraw(200.00,true);
        assertEquals(800.00,bankAccount.getBalance(),0);
    }

    @org.junit.Test
    public void dummyTest(){
        assertEquals(20,21);
    }

    @org.junit.Test
    public void isChecking_true(){
//        BankAccount bankAccount = new BankAccount("Bob", "Minus", 1000.00, BankAccount.CHECKING);
//        assertEquals(true, bankAccount.isChecking());
//        assertTrue(bankAccount.isChecking());
        assertTrue("The account is not a checking account",bankAccount.isChecking());
//        BankAccount bankAccount2 = new BankAccount("Bob", "Minus", 1000.00, BankAccount.SAVINGS);
//        assertFalse(bankAccount2.isChecking(), "The account is not a checking account");

    }

    @org.junit.AfterClass
    public static void afterClass(){
        System.out.println("This executes after any test cases. Count = " + count++);
    }

    @org.junit.After
    public void tearDown(){
        System.out.println("Count = " + count++);
    }
}