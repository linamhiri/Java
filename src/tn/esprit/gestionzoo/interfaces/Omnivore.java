package tn.esprit.gestionzoo.interfaces;

import tn.esprit.gestionzoo.enums.Food;

public interface Omnivore<T> extends Carnivore<T>, Herbivore<T> {
    void eatPlantAndMeat(T food);
}
