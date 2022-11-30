package scope;

public class ScopeCheckTwo {
    public int publicVar = 0;
    private int varOne = 1;

    public ScopeCheckTwo() {
        System.out.println("ScopeCheck created, publicVar = " + publicVar + ": varOne = " + varOne);
    }

    public int getVarOne() {
        return varOne;
    }

    public void timesTwo() {
        int varTwo = 2;
        for (int i=0; i<10; i++) {
        }
    }

    public void useInner() {
        InnerClassTwo innerClassTwo = new InnerClassTwo();
        System.out.println("varThree from outer class: " + innerClassTwo.varThree);
    }

    public class InnerClassTwo {
        private int varThree = 3;

        public InnerClassTwo() {
            System.out.println("InnerClass created, varOne is " + varOne + " and varThree is " + varThree);
        }

        public void timesTwo() {
            System.out.println("varOne is still available here " + varOne);
            for (int i=0; i<10; i++) {
                System.out.println(i + " times two is " + i * varThree);
            }
        }

    }
}
