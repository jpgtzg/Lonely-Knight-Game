public class Player {

    String name;
    int level;
    int exp;
    int hp;
    int maxHp;

    public Player(String name, int level, int exp, int hp, int maxHp) {
        this.name = name;
        this.level = level;
        this.exp = exp;
        this.hp = hp;
        this.maxHp = maxHp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
        this.exp = 0;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void levelUp() {
        this.level++;
        this.exp = 0;
    }

    //show status
    public void status() {
        System.out.println("Name: " + this.name);
        System.out.println("Level: " + this.level);
        System.out.println("Exp: " + this.exp);
        System.out.println("HP: " + this.hp);
        System.out.println("Max HP: " + this.maxHp);
    }
}
