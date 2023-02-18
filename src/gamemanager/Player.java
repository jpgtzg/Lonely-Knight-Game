package gamemanager;
public class Player {

    private String name;
    private int hp;
    private int maxHp;
    private Inventory inventory;

    public Player(String name , int hp, int maxHp) {
        this.name = name;
        this.hp = hp;
        this.maxHp = maxHp;
        this.inventory = new Inventory();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    //show status
    public void status() {
        System.out.println("Name: " + this.name);
        System.out.println("HP: " + this.hp);
        System.out.println("Max HP: " + this.maxHp);
    }
}
