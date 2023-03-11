public class Fire extends Pokemon {
    private int defends;
    private int weight;


    public Fire(String type, String name, String food, int hp, int defends, int weight, String sound) {
        super(type, name, food, hp, sound);
        this.defends = defends;
        this.weight = weight;

    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getDefends() {
        return defends;
    }

    public void setDefends(int defends) {
        this.defends = defends;
    }

    @Override
    public void eat() {
        System.out.println("This Pokemon burns wood and eats the ashes");
    }

    @Override
    public void makeNoise() {
        System.out.println("Het type Fire brandt");
    }
}