package tn.esprit.gestionzoo.interfaces;

import tn.esprit.gestionzoo.enums.Food;

public interface Carnivore<T> {
    void eatMeat(T meat);
}
