package tn.esprit.gestionzoo.main;
import tn.esprit.gestionzoo.Food;
import tn.esprit.gestionzoo.InvalidAgeException;
import tn.esprit.gestionzoo.ZooFullException;
import tn.esprit.gestionzoo.entities.*;

    public class ZooManagement {
        public static void main(String[] args) {
            // Création d'un objet Aquatic
            Aquatic dolphin = new Aquatic() {
                @Override
                public void swim() {

                }
            };
            dolphin.eatMeat(Food.MEAT);    // Affiche : "This aquatic animal is eating meat."
            dolphin.eatMeat(Food.PLANT);  // Affiche : "This aquatic animal cannot eat this type of food."

            // Création d'un objet Terrestrial
            Terrestrial bear = new Terrestrial();
            bear.eatMeat(Food.MEAT);           // Affiche : "This terrestrial animal is eating meat."
            bear.eatPlant(Food.PLANT);         // Affiche : "This terrestrial animal is eating plants."
            bear.eatPlantAndMeat(Food.BOTH);   // Affiche : "This terrestrial animal is eating both plants and meat."
        }
    }





//        public static void main(String[] args) {
//
//                    Zoo zoo = new Zoo("belvedere","tunis"); // Nombre de cages réduit à 3
//
//                    try {
//                        Animal lion = new Animal();
//                        lion.setName("Simba");
//                        lion.setAge(-3); // Cela va lever une InvalidAgeException
//                        lion.setFamily("Cats");
//                        lion.setMammal(true);
//                    } catch (InvalidAgeException e) {
//                        System.out.println("Erreur : " + e.getMessage());
//                    }
//
//
//
//
//            try {
//                        // Ajouter des animaux
//                        zoo.addAnimal(new Animal("dnvnjdj","ffff",88,false));
//                        System.out.println("Nombre d'animaux dans le zoo : " + zoo.getNombre_animals());
//
//                        zoo.addAnimal(new Animal("Elephant", "dddd",10,true));
//                        System.out.println("Nombre d'animaux dans le zoo : " + zoo.getNombre_animals());
//
//                        zoo.addAnimal(new Animal("Tiger","fff",45,true));
//                        System.out.println("Nombre d'animaux dans le zoo : " + zoo.getNombre_animals());
//
//                        zoo.addAnimal(new Animal("Zebra", "ffsszf",475,true));
//                    } catch (ZooFullException e) {
//                        System.err.println(e.getMessage());
//                    }
//
//                }




            //
//        System.out.println(myZoo.addAnimal(lion));
//        System.out.println(myZoo.addAnimal(dog));
//
//        myZoo.displayAnimals();
//
//        System.out.println(myZoo.searchAnimal(dog));
//        Animal dog2 = new Animal("Canine", "lll", 2, true);
//        System.out.println(myZoo.searchAnimal(dog2));
//
////           System.out.println(myZoo.removeAnimal(dog));
//        myZoo.displayAnimals();
//
//
//        System.out.println(myZoo);
//
//        myZoo.addAnimal(lion);
//        myZoo.addAnimal(dog);
//        myZoo.addAnimal(dog2);
//        myZoo.displayAnimals();

//            Dolphin d = new Dolphin();
//            d.setSwimmingSpeed(24.5f);
//            Dolphin d1 = new Dolphin();
//            d1.setSwimmingSpeed(21.8f);
//            Dolphin d2 = new Dolphin();
//            d2.setSwimmingSpeed(20.3f);
//            Dolphin d3 = new Dolphin();
//            d3.setSwimmingSpeed(22.6f);
//
//
//            myZoo.addAquaticAnimal(d);
//            myZoo.addAquaticAnimal(d1);
//            myZoo.addAquaticAnimal(d2);
//            myZoo.addAquaticAnimal(d3);
//            Penguin p = new Penguin();
//            p.setSwimmingDepth(24.6f);
//            Penguin p1 = new Penguin();
//            p1.setSwimmingDepth(29.6f);
//            Penguin p2 = new Penguin();
//            p2.setSwimmingDepth(219.6f);
//            Penguin p3 = new Penguin();
//            p1.setSwimmingDepth(2.6f);
//            myZoo.addAquaticAnimal(p);
//            myZoo.addAquaticAnimal(p1);
//            myZoo.addAquaticAnimal(p2);
//            myZoo.addAquaticAnimal(p3);
//            myZoo.addAquaticAnimal(new Penguin());

//            for (int i = 0; i < myZoo.getNombre_aquatics(); i++) {
//                Aquatic[] aquatics = myZoo.getAquaticAnimals();
//                aquatics[i].swim();
//            }
//
//            myZoo.displayNumberOfAquaticsByType();
//
//            System.out.println(myZoo.maxPenguinSwimmingDepth());




