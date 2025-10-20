package entity;

public abstract sealed class Aquatic extends Animal permits Dolphin,Penguin{
    private String habitat;
    public Aquatic() {}
    public Aquatic(String family, String name, int age, boolean isMammal, String habitat){
    super(family, name, age, isMammal);
    this.habitat = habitat;
    }

    public String getHabitat() {
        return habitat;
    }
    void setHabitat(String habitat) {
        this.habitat = habitat;
    }
    public abstract void swim();
    @Override
    public String toString() {
        return super.toString()+ "Aquatic [habitat=" + habitat + "]";
    }
    @Override
    public boolean equals(Object obj) {
        if (this ==obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Aquatic aq=(Aquatic) obj;
        return this.getName().equals(aq.getName())
                && this.getAge()==(aq.getAge())
                && this.getHabitat().equals(aq.getHabitat());
    }
}
