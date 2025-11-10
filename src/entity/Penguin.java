package entity;

public non-sealed class Penguin extends Aquatic{
    private float swimmingDepth;
    public Penguin(){}
    public Penguin(String family, String name, int age, boolean isMammal, String habitat, float swimmingDepth) {
        super(family, name, age, isMammal, habitat);
        this.swimmingDepth = swimmingDepth;
    }
    public void swim(){
        System.out.println(name + "Penguin is swimming");
    }
    public float getSwimmingDepth() {
        return swimmingDepth;
    }
    @Override
    public String toString() {
        return super.toString()+" Penguin [swimmingDepth= " + swimmingDepth + "]";
    }
}
