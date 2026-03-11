package Ex72plus;

public class Monster {
    private String name;
    private int level;
    private int attack;
    private int defense;
    private int hp;
    private int id;
    private static int count = 0;
    private static Monster[] monsters = new Monster[10];

    Monster(String name) {
        this.name = name;
        level = 1;
        attack = 10;
        defense = 5;
        hp = 50;
        count++;
        id = count;
        monsters[id - 1] = this;
    }

    Monster(String name, int attack, int defense, int hp) {
        this.name = name;
        level = 1;
        this.attack = attack;
        this.defense = defense;
        this.hp = hp;
        count++;
        id = count;
        monsters[id - 1] = this;
    }

    double upgrade() {
        printLevel();
        level++;
        attack = (int) (1.2 * attack);
        defense = (int) (1.2 * defense);
        hp = (int) (1.2 * hp);
        return calcPower();
    }

    double calcPower() {
        return attack * 2 + defense + hp * 0.5;
    }

    static String topMonster() {
        Monster top = monsters[0];
        for (int i = 1; i < count; i++) {
            if (monsters[i].calcPower() > top.calcPower()) {
                top = monsters[i];
            }
        }
        return top.getName();
    }

    void printData() {
        System.out.println("#" + this.id + " " + this.name + "Lv." + this.level + "| ATK:" + this.attack + "DEF:"
                + this.defense + "HP:" + this.hp + "| Power: " + calcPower());
    }

    void printLevel() {
        System.out.println(this.name + "はレベルアップした！");
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

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public static int getCount() {
        return count;
    }

    public int getId() {
        return id;
    }

}
