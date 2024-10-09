//seance 2
public class Zoo {
    Animal [] animals;
    String name;
    String city;
    int nbrCages;

    public Zoo(String name, String city, int nbrCages){
        this.animals = new Animal[25];
        this.city = city;
        this.name = name;
        this.nbrCages = nbrCages;
    }
    /*public displayZoo(Zoo z) {
        System.out.println("Nom : " + z.name);
        System.out.println("Ville : " + z.city);
        System.out.println("Nombre de cages: " + z.nbrCages);
    }*/

    //seance 3
    // Instruction 10
    public boolean addAnimal(Animal animal) {
        if (currentAnimalCount >= MAX_ANIMALS || containsAnimal(animal)) {
            return false;
        }
        animals[currentAnimalCount++] = animal;
        return true;
    }

    private boolean containsAnimal(Animal animal) {
        for (int i = 0; i < currentAnimalCount; i++) {
            if (animals[i].equals(animal)) {
                return true;
            }
        }
        return false;
    }

    // Instruction 11
    public void displayAnimals() {
        for (int i = 0; i < currentAnimalCount; i++) {
            System.out.println(animals[i]);
        }
    }

    public int searchAnimal(String name) {
        for (int i = 0; i < currentAnimalCount; i++) {
            if (animals[i].name.equals(name)) {
                return i;
            }
        }
        return -1;
    }

    public void displayZoo() {
        System.out.println("Nom : " + this.name);
        System.out.println("Ville : " + this.city);
        System.out.println("Nombre d'animaux: " + this.currentAnimalCount);
        System.out.println("Animaux dans le zoo:");
        displayAnimals();
    }

    // Instruction 13
    public boolean removeAnimal(Animal animal) {
        for (int i = 0; i < currentAnimalCount; i++) {
            if (animals[i].equals(animal)) {
                animals[i] = animals[--currentAnimalCount]; // Swap with last and reduce count
                return true;
            }
        }
        return false;
    }

    // Instruction 15
    public boolean isZooFull() {
        return currentAnimalCount >= MAX_ANIMALS;
    }

    // Instruction 16
    public static Zoo compareZoo(Zoo z1, Zoo z2) {
        return z1.currentAnimalCount >= z2.currentAnimalCount ? z1 : z2;
    }

}
