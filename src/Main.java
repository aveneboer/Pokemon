public class Main {

    public static void main(String[] args) {
        Electric E1 = new Electric("Electric", "Pickachu", "Ketchup", 20, "Hij is jarig", 50, "Pika Pika");
        Grass G1 = new Grass("Grass", "Bulbasaur", "Grass", 100, 170, 10, "Clips");
        Water W1 = new Water("Water", "Squirtle", "Water", 200, 0.6, 170, "Cries");
        Fire F1 = new Fire("Fire", "Charmander", "Wood", 500, 154, 2, "Char");

        Pokemon[] pokemonArray = {E1, G1, W1, F1};


        for (Pokemon pokemon : pokemonArray) {
            pokemon.printInfo();
            pokemon.makesSound();
            pokemon.makeNoise();
            pokemon.eat();
            if (pokemon instanceof Electric) {
                Electric electric = (Electric) pokemon;
                System.out.println("Special: " + electric.getSpecial());
                System.out.println("XP: " + electric.getXp());
            } else if (pokemon instanceof Water) {
                Water water = (Water) pokemon;
                System.out.println("Accuracy: " + water.getAccuracy());
                System.out.println("Height: " + water.getHeight());

            } else if (pokemon instanceof Grass) {
                Grass grass = (Grass) pokemon;
                System.out.println("Attack: " + grass.getAttack());
                System.out.println("Level: " + grass.getLevel());
            } else if (pokemon instanceof Fire) {
                Fire fire = (Fire) pokemon;
                System.out.println("Defends: " + fire.getDefends());
                System.out.println("Weight: " + fire.getWeight());
            }
            System.out.println("-------------------");
        }
    }
}
