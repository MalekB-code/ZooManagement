package tn.esprit.gestionzoo.entities;

import tn.esprit.gestionzoo.Carnivore;
import tn.esprit.gestionzoo.Food;

public abstract non-sealed class Aquatic extends Animal implements Carnivore<Food> {
   public String habitat;
   public Aquatic(){

   }
    public Aquatic (String family, String name, int age, boolean isMammal, String habitat){
        super(family, name, age, isMammal);
        this.habitat = habitat;
    }
    @Override
    public void eatMeat(Food food) {
        if (food == Food.MEAT) {
            System.out.println("This aquatic animal is eating meat.");
        } else {
            System.out.println("This aquatic animal cannot eat this type of food.");
        }
    }
    public String getHabitat(){
            return habitat;
        }
        public void setHabitat(String habitat){
        this.habitat = habitat;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null) return false;
        if (obj instanceof Aquatic aquatic) {
            return aquatic.habitat.equals(habitat) && aquatic.getName().equals(super.getName()) && aquatic.getAge() == super.getAge();
        }
        return false;
    }

    @Override
    public String toString() {
        return "Aquatic{" +
                " habitat= " + habitat +
                " family= "+getFamily()+
                " name= "+getName()+
                " age= "+getAge()+
                " isMammal= "+isMammal()+ " }";
    }
    public abstract void swim();






}

