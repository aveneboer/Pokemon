public abstract class Pokemon {
    private String name;
    private String food;
    public int hp;
    public String type;
    public String sound;


    public Pokemon(String type, String name, String food, int hp, String sound) {
        this.type = type;
        this.food = food;
        this.name = name;
        this.hp = hp;
        this.sound = sound;

    }

    public void printInfo() {
        System.out.println("Name: " + name);
        System.out.println("Food: " + food);
        System.out.println("HP: " + hp);
    }

    public void makesSound() {
        System.out.println("This Pokemon makes the following sound: " + sound);
    }

    public abstract void eat();

    public abstract void makeNoise();


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public String getFood() {
        return food;
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
}