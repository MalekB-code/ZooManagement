package tn.esprit.gestionzoo;

public interface Omnivore<T> extends Carnivore<T>, Herbivore<T> {
    public void eatPlantAndMeat(T food);
}

