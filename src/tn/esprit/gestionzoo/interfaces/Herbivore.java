package tn.esprit.gestionzoo.interfaces;

import tn.esprit.gestionzoo.enums.Food;

public interface Herbivore<T> {
    void eatPlant(T plant);
}
