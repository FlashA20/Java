package entity;

public sealed class Animal permits Aquatic,Terrestrial {
        protected String family;
        protected  String name;
        protected	int age;
        protected	boolean isMammal;
        public Animal() {}
        public Animal(String family, String name, int age, boolean isMammal) {
            this.family = family;
            this.name = name;
            this.isMammal = isMammal;
            setAge(age);
        }
        public int getAge() {
            return age;
        }
        public void setAge(int age) {
            /*if(age<=0){
                System.out.println("Age can't be less than 0");
                return;
            }*/
            this.age = age;
        }


        public String getFamily() {
            return family;
        }

        public void setFamily(String family) {
            this.family = family;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public boolean isMammal() {
            return isMammal;
        }

        public void setMammal(boolean mammal) {
            isMammal = mammal;
        }

        public String toString(){
            return "entity.Animal [family=" + family + ", name=" + name + ", age=" + age + "]";
        }

}
