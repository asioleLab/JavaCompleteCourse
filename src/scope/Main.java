package scope;

public class Main {

    public static void main(String[] args) {
        String privateVar = "this is private to main()";

        ScopeCheck scopeInstance = new ScopeCheck();
        System.out.println("scopeInstance privateVar is " + scopeInstance.getPrivateVar());
        System.out.println(privateVar);

        scopeInstance.timesTwo();
        System.out.println("***********************************");
        ScopeCheck.InnerClass innerClass = scopeInstance.new InnerClass();
        innerClass.timesTwo();


        String varFour = "this is private to main()";

        ScopeCheckTwo scopeInstanceTwo = new ScopeCheckTwo();
        scopeInstanceTwo.useInner();

        ScopeCheckTwo.InnerClassTwo innerClassTwo = scopeInstanceTwo.new InnerClassTwo();
//        System.out.println("varThree is not accessible here " + innerClassTwo.varThree);
    }
}

