package Person;

public class MainAccount {

    public static void main(String[] args) {
        //PRE CONSTRUCT
//        Account bobsAccount = new Account();
//        bobsAccount.setNumber("12345");
//        bobsAccount.setBalance(0.00);
//        bobsAccount.setCustomerName("Bob Brown");
//        bobsAccount.setCustomerEmailAddess("bob@email.com");
//        bobsAccount.setCustomerPhoneNumber("12345678951");

        //POST CONSTRUCT
        Account bobsAccount = new Account("12345", 0.00, "Bob Brown", "bob@email.com", "12345678951") ;
        System.out.println("Number is "+ bobsAccount.getNumber());

        bobsAccount.withdrawal(100.0);

        bobsAccount.deposit(50.0);
        bobsAccount.withdrawal(100.0);

        bobsAccount.deposit(51.0);
        bobsAccount.withdrawal(100.0);

        VipCustomer vipCustomer1 = new VipCustomer();
        System.out.println(vipCustomer1.getName());

        VipCustomer vipCustomer2 = new VipCustomer("UncleDonald", 100000);
        System.out.println(vipCustomer2.getName());

        VipCustomer vipCustomer3 = new VipCustomer("Tim", 500000, "mail@mail.com");
        System.out.println(vipCustomer3.getName());


    }
}
