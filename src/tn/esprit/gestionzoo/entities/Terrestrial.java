package tn.esprit.gestionzoo.entities;

import tn.esprit.gestionzoo.Food;
import tn.esprit.gestionzoo.Omnivore;

public non-sealed class Terrestrial extends Animal implements Omnivore<Food> {
int nbrLegs;
    @Override
    public void eatMeat(Food food) {
        if (food == Food.MEAT) {
            System.out.println("This terrestrial animal is eating meat.");
        } else {
            System.out.println("This terrestrial animal cannot eat this type of food.");
        }
    }

    @Override
    public void eatPlant(Food food) {
        if (food == Food.PLANT) {
            System.out.println("This terrestrial animal is eating plants.");
        } else {
            System.out.println("This terrestrial animal cannot eat this type of food.");
        }
    }

    @Override
    public void eatPlantAndMeat(Food food) {
        if (food == Food.BOTH) {
            System.out.println("This terrestrial animal is eating both plants and meat.");
        } else {
            System.out.println("This terrestrial animal cannot eat this type of food.");
        }
    }
}



