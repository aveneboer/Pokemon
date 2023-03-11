public class Electric extends Pokemon {
    private String special;
    private int xp;

    public Electric(String type, String name, String food, int hp, String special, int xp, String sound) {
        super(type, name, food, hp, sound);
        this.special = special;
        this.xp = xp;

    }

    public String getSpecial() {
        return special;
    }

    public void setSpecial(String special) {
        this.special = special;
    }

    public int getXp() {
        return xp;
    }

    public void setXp(int xp) {
        this.xp = xp;
    }

    @Override
    public void eat() {
        System.out.println("This Pokemon loves to eat whatever crackles");
    }

    @Override
    public void makeNoise() {
        System.out.println("Het type Electric knettert");
    }
}