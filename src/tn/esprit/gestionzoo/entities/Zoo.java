package tn.esprit.gestionzoo.entities;

import tn.esprit.gestionzoo.exceptions.ZooFullException;

public class Zoo {
    private Animal[] animals;
    private Aquatic[] aquaticAnimals;
    private String name;
    private String city;
    private final int nbrCages = 3;
    private int animalCount = 0;
    private int aquaticCount = 0;

    public Zoo(String name, String city) {
        this.name = name.isEmpty() ? "Unnamed Zoo" : name;
        this.city = city;
        this.animals = new Animal[nbrCages];
        this.aquaticAnimals = new Aquatic[10];
    }

    public void addAnimal(Animal animal) throws ZooFullException {
        if (isZooFull()) {
            throw new ZooFullException("Cannot add more animals. Zoo is full.");
        }
        animals[animalCount++] = animal;
        System.out.println("Animal added. Total animals: " + animalCount);
    }

    public void addAquaticAnimal(Aquatic aquatic) {
        if (aquaticCount < aquaticAnimals.length) {
            aquaticAnimals[aquaticCount++] = aquatic;
        } else {
            System.out.println("Cannot add more aquatic animals.");
        }
    }

    public void swimAllAquatics() {
        for (int i = 0; i < aquaticCount; i++) {
            aquaticAnimals[i].swim();
        }
    }

    public float maxPenguinSwimmingDepth() {
        float maxDepth = 0;
        for (int i = 0; i < aquaticCount; i++) {
            if (aquaticAnimals[i] instanceof Penguin) {
                maxDepth = Math.max(maxDepth, ((Penguin) aquaticAnimals[i]).getSwimmingDepth());
            }
        }
        return maxDepth;
    }

    public void displayNumberOfAquaticsByType() {
        int dolphinCount = 0, penguinCount = 0;
        for (int i = 0; i < aquaticCount; i++) {
            if (aquaticAnimals[i] instanceof Dolphin) dolphinCount++;
            else if (aquaticAnimals[i] instanceof Penguin) penguinCount++;
        }
        System.out.println("Dolphins: " + dolphinCount + ", Penguins: " + penguinCount);
    }

    public boolean isZooFull() {
        return animalCount >= nbrCages;
    }
}
