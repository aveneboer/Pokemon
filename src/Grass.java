public class Grass extends Pokemon {
    private int attack;
    private int level;


    public Grass(String type, String name, String food, int hp, int attack, int level, String sound) {
        super(type, name, food, hp, sound);
        this.attack = attack;
        this.level = level;

    }

    public int getAttack() {
        return attack;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    @Override
    public void eat() {
        System.out.println("This Pokemon only eats grass");
    }

    @Override
    public void makeNoise() {
        System.out.println("Het type Grass is groen");
    }
}



