package Encapsulation;

public class Main {

    public static void main(String[] args) {
       /* Player player = new Player();
        player.name = "Bob";
        player.health=20;
        player.weapon="Sword";

        int demage=5;
        player.loseHealth(demage);
        System.out.println("Remaining health points: " + player.healthRemaining());

        demage=25;
        player.loseHealth(demage);
        System.out.println("Remaining health points: " + player.healthRemaining());*/
        EnhancedPlayer player = new EnhancedPlayer("Bob", 50, "Sword");
        System.out.println("Initial health is: "+ player.getHealth());
    }
}
