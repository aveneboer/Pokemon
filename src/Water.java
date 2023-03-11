public class Water extends Pokemon {
    private double accuracy;
    private int height;


    public Water(String type, String name, String food, int hp, double accuracy, int height, String sound) {
        super(type, name, food, hp, sound);
        this.accuracy = accuracy;
        this.height = height;

    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double getAccuracy() {
        return accuracy;
    }

    public void setAccuracy(double accuracy) {
        this.accuracy = accuracy;
    }

    @Override
    public void eat() {
        System.out.println("This Pokemon eats drops of water");
    }

    @Override
    public void makeNoise() {
        System.out.println("Het type Water bubbelt");
    }
}