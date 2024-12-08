package tn.esprit.gestionzoo.entities;
import tn.esprit.gestionzoo.*;
import tn.esprit.gestionzoo.ZooFullException;
public class Zoo {
    public static final int NUMBER_OF_CAGES=3;
    private Animal [] animals;
    private Aquatic[] aquaticAnimals;
    private String name;
	private String city;
    private int nombre_animals;
    private int nombre_aquatics;
    public Animal[] getAnimals() {
        return animals;
    }

    public void setAnimals(Animal[] animals) {
        this.animals = animals;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if ( name.isBlank())
            System.out.println(" ne peut être vide");
        else
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getNombre_animals() {
        return nombre_animals;
    }

    public void setNombre_animals(int nombre_animals) {
        this.nombre_animals = nombre_animals;
    }

    public Aquatic[] getAquaticAnimals() {
        return aquaticAnimals;
    }

    public int getNombre_aquatics() {
        return nombre_aquatics;
    }

    public void setAquaticAnimals(Aquatic[] aquaticAnimals) {
        this.aquaticAnimals = aquaticAnimals;
    }

    public void setNombre_aquatics(int nombre_aquatics) {
        this.nombre_aquatics = nombre_aquatics;
    }

    public Zoo(String name, String city) {
        animals = new Animal[NUMBER_OF_CAGES];
        aquaticAnimals = new Aquatic[10];
        this.name = name;
        this.city = city;
    }
    public float maxPenguinSwimmingDepth() {
        float maxDepth = 0f;
        for (int i = 0; i < nombre_aquatics; i++) {
            if (aquaticAnimals[i] instanceof Penguin penguin) {
                if (maxDepth < penguin.getSwimmingDepth())
                    maxDepth = penguin.getSwimmingDepth();
            }
        }
        return maxDepth;
    }

    public void displayNumberOfAquaticsByType() {
        int nbrPenguins = 0;
        int nbrDolphins = 0;
        for (int i = 0; i < nombre_aquatics; i++) {
            if (aquaticAnimals[i] instanceof Dolphin) {
                nbrDolphins++;
            }
            if (aquaticAnimals[i] instanceof Penguin) {
                nbrPenguins++;
            }
        }
        System.out.println("Le Zoo " + name + " contient " + nbrDolphins + " dauphins et " + nbrPenguins + " pingouins");
    }


  String DisplayZoo(){
        return name + " " + city + " " ;
 }
 @Override
 public String toString(){
        return "Name: "+name + " et City: " + city + " et Nombre de cages: " + NUMBER_OF_CAGES;
    }
    public void addAquaticAnimal(Aquatic aquatic){

            aquaticAnimals[nombre_aquatics] = aquatic;
            nombre_aquatics++;

    }
    public void addAnimal(Animal animal) throws ZooFullException {
        if (nombre_animals >= NUMBER_OF_CAGES) {
            throw new ZooFullException("Le zoo est plein ! Impossible d'ajouter un nouvel animal.");
        }

        {
                animals[nombre_animals] = animal;
                System.out.println("added successfully");
                nombre_animals++;
        }
    }

    public void displayAnimals(){
        for(int i = 0; i< Zoo.NUMBER_OF_CAGES; i++){
            System.out.println(animals[i]);
        }
    }



    public int searchAnimal(Animal animal){
        for(int i=1;i<nombre_animals;i++){
            if (animals[i].equals(animal) )
                return i ;

        }
        return -1;
    }

    public boolean removeAnimal(Animal animal){
        if (this.searchAnimal(animal) != -1){
            animals[this.searchAnimal(animal)] = null;
            nombre_animals--;
            System.out.println("removed animal");
            return true;
        }
        return false;
    }
    public boolean isZooFull(){

            if (nombre_animals == NUMBER_OF_CAGES) {
                return true;
            }
        return false;
    }

    public static Zoo comparerZoo(Zoo z1, Zoo z2){
        if (z1.nombre_animals == z2.nombre_animals) {
            return z1;
        }
        else if (z1.nombre_animals < z2.nombre_animals) {
            return z2;
        }
        return z1;

    }


}

