package entity;

public final class  Terrestrial extends Animal {
    int nbrLegs;
    public Terrestrial() {}
    public Terrestrial(String family, String name, int age, boolean isMammal, int nbrLegs) {
        this.family=family;
        this.name=name;
        this.age=age;
        this.isMammal=isMammal;
        this.nbrLegs = nbrLegs;
    }
}
