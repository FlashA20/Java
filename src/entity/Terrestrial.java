package entity;

public final class  Terrestrial extends Animal implements Omnivore<Food> {
    int nbrLegs;
    public Terrestrial() {}
    public Terrestrial(String family, String name, int age, boolean isMammal, int nbrLegs) {
        this.family=family;
        this.name=name;
        this.age=age;
        this.isMammal=isMammal;
        this.nbrLegs = nbrLegs;
    }
    Food type= Food.BOTH;
    Food typePlant= Food.PLANT;
    Food typeMeat= Food.MEAT;
   @Override
    public void eatPlant(Food food){
        System.out.println(name + " is eating " + typePlant);
    }
    @Override
    public void eatMeat(Food food){
        System.out.println(name + " is eating " + typeMeat);
    }
    @Override
    public void eatPlantAndMeat(Food food){
        System.out.println(name + " is eating " + type);
    }
}
