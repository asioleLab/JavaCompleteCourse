package encapsulation;

public class EnhancedPlayer {

    private String name;
    private int health = 100;
    private String weapon;

    public EnhancedPlayer(String name, int health, String weapon) {
        this.name = name;
        if (health >0 && health <=200){
            this.health = health;
        }
        this.weapon = weapon;
    }

    public void loseHealth(int demage){
        this.health = this.health - demage;
        if (this.health <=0){
            System.out.println("Player knocked out");
        }
    }

    public int getHealth() {
        return health;
    }
}
