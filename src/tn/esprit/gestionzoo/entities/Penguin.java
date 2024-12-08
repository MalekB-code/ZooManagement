package tn.esprit.gestionzoo.entities;

public class Penguin extends Aquatic {
 protected float swimmingDepth;

public Penguin(String family, String name, int age, boolean isMammal, String habitat,float swimmingDepth){
    super(family, name, age, isMammal, habitat);
    this.swimmingDepth = swimmingDepth;
}
public  Penguin(){

}
public void swim(){
    System.out.println("Penguin is swimming");
}


    public float getSwimmingDepth() {
        return swimmingDepth;
    }

    public void setSwimmingDepth(float swimmingDepth) {
        this.swimmingDepth = swimmingDepth;
    }

    @Override
    public String toString() {
        return "Penguin{" +
                " habitat= " + getHabitat() +
                " family= "+getFamily()+
                " name= "+getName()+
                " age= "+getAge()+
                " isMammal= "+isMammal()+
                " swimmingDepth= "+swimmingDepth+ " }";
    }
}
