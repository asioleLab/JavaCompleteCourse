package polymorphism.exercise2;

public class Hamburger {

    private String name;
    private String meat;
    private double price;
    private String breadRollType;
    private String addition1Name;
    private String addition2Name;
    private String addition3Name;
    private String addition4Name;

    private double addition1Price;
    private double addition2Price;
    private double addition3Price;
    private double addition4Price;

    public Hamburger(String name, String meat, double price, String breadRollType) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRollType = breadRollType;
    }

//    addHamburgerAddition1, addHamburgerAddition2, addHamburgerAddition3, addHamburgerAddition4, and itemizehamburger.
    public void addHamburgerAddition1(String name, double price){
        this.addition1Name=name;
        this.addition1Price=price;
    }

    public void addHamburgerAddition2(String name, double price){
        this.addition2Name=name;
        this.addition2Price=price;
    }

    public void addHamburgerAddition3(String name, double price){
        this.addition3Name=name;
        this.addition3Price=price;
    }

    public void addHamburgerAddition4(String name, double price){
        this.addition4Name=name;
        this.addition4Price=price;
    }

    public double itemizeHamburger(){
        double hambugerPrice =this.price;
        System.out.println(this.name + " hamburger on a " +this.breadRollType+ " roll price is " + this.price);
        if(this.addition1Name!=null){
            hambugerPrice+=this.addition1Price;
            System.out.println("Added " +this.addition1Name +" for an extra "+ this.addition1Price);
        }
        if(this.addition2Name!=null){
            hambugerPrice+=this.addition2Price;
            System.out.println("Added " +this.addition2Name +" for an extra "+ this.addition2Price);
        }
        if(this.addition3Name!=null){
            hambugerPrice+=this.addition3Price;
            System.out.println("Added " +this.addition3Name +" for an extra "+ this.addition3Price);
        }
        if(this.addition4Name!=null){
            hambugerPrice+=this.addition4Price;
            System.out.println("Added " +this.addition4Name +" for an extra "+ this.addition4Price);
        }
        return hambugerPrice;
    }
}
