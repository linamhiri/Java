package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.*;
import tn.esprit.gestionzoo.exceptions.*;
import tn.esprit.gestionzoo.enums.Food;

public class Main {
    public static void main(String[] args) {
        Zoo myZoo = new Zoo("Safari Zoo", "Tunis");

        try {
            myZoo.addAnimal(new Terrestrial("Felidae", "Lion", 5, true, 4));
            myZoo.addAnimal(new Terrestrial("Canidae", "Wolf", 3, true, 4));
            myZoo.addAnimal(new Terrestrial("Canidae", "Fox", 4, true, 4));
            myZoo.addAnimal(new Terrestrial("Canidae", "Coyote", 2, true, 4));  // This should throw ZooFullException
        } catch (ZooFullException e) {
            System.out.println(e.getMessage());
        }

        Aquatic fish = new Aquatic("Fish", "Goldfish", 1, false, "Freshwater") {
            @Override
            public void swim() {
                System.out.println("Goldfish is swimming.");
            }
        };
        Penguin penguin = new Penguin("Spheniscidae", "Penguin", 4, false, "Arctic", 15.0f);
        Dolphin dolphin = new Dolphin("Cetacea", "Dolphin", 8, true, "Ocean", 20.5f);

        myZoo.addAquaticAnimal(fish);
        myZoo.addAquaticAnimal(dolphin);
        myZoo.addAquaticAnimal(penguin);

        System.out.println("Maximum swimming depth of penguins: " + myZoo.maxPenguinSwimmingDepth());
        myZoo.displayNumberOfAquaticsByType();

        System.out.println("\nAquatic animals swimming:");
        myZoo.swimAllAquatics();

        // Test eating methods
        dolphin.eatMeat(Food.MEAT);
        penguin.eatMeat(Food.MEAT);
    }
}
