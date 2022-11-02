package Polymorphism;

class Movie{
    private String name;

    public Movie(String name) {
        this.name = name;
    }

    public String plot(){
        return "No plot here";
    }

    public String getName() {
        return name;
    }
}

class Titanic extends Movie{
    public Titanic(){
        super("Titanic");
    }

    public String plot(){
        return "Boat crashes iceberg";
    }
}

class Batman extends Movie{
    public Batman() {
        super("Batman");
    }

    @Override
    public String plot() {
        return "Man in black";
    }
}

class StarWars extends Movie{
    public StarWars() {
        super("Star Wars");
    }

    @Override
    public String plot() {
        return "Galactical war";
    }
}

class IronMan extends Movie{
    public IronMan() {
        super("IronMan");
    }

    @Override
    public String plot() {
        return "Genius man with money";
    }
}

class Forgetable extends Movie{
    public Forgetable() {
        super("Forgetable");
    }
    //No plot method
}


public class Main {

    public static void main(String[] args) {
        for (int i=0;i<11;i++){
            Movie movie=randomMovie();
            System.out.println("Movie #" +i+
                    ": " +movie.getName() +"\n"+
                    "Plot: "+ movie.plot() + "\n");
        }
    }
    public static Movie randomMovie(){
        int randomNumber=(int)(Math.random()*5)+1;
        System.out.println("Random number generated was: " + randomNumber);
        switch (randomNumber){
            case 1:
                return new Titanic();
            case 2:
                return new Batman();
            case 3:
                return new StarWars();
            case 4:
                return new IronMan();
            case 5:
                return new Forgetable();
//            default:
//                return null;
        }
        return null;
    }
}
