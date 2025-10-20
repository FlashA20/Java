package entity;

public class Zoo {
        private   Animal[] animals;
        private  String name;
        private  String city;
        private  int nbrCages;
        private int nbAnimals = 0;
        private Aquatic[] aquaticAnimals= new Aquatic[10];


        public Zoo() {}
        public Zoo(String name, String city, int nbrCages) {
            setName(name);
            this.city = city;
            this.nbrCages = nbrCages;
            animals = new Animal[nbrCages];
        }

        public void displayZoo(){
            System.out.println("entity.Zoo name: " + name + ", city: " + city + ", nbrCages: " + nbrCages);
        }


        public boolean addAnimal(Animal animal){
            if (searchAnimal(animal)!=-1)
                return true;
            for (int i = 0; i < animals.length; i++) {
                if(animals[i] == null){
                    animals[i] = animal;
                    return true;

                }

            }
            return false;
        }

        public boolean addAnimal1(Animal animal){
            if (searchAnimal(animal)!=-1)
                return true;
            if (isZooFull())
                return false;
            if (animals.length >= nbAnimals) {
                if (animals[nbAnimals] != null) {
                    nbAnimals++;
                }
                System.out.println(nbAnimals);
                animals[nbAnimals] = animal;
                return true;
            }
            return false;

        }

        boolean addAnimal2(Animal animal) {

            if (nbAnimals == animals.length)
                return false;
            animals[nbAnimals] = animal;
            nbAnimals++;
            return true;
        }


        public int searchAnimal(Animal animal){
            for (int i = 0; i < animals.length; i++) {
                if(animals[i] == null)return -1;
                if(animals[i].getName() == animal.getName())
                    return i;
            }
            return -1;
        }

        public void afficherAnimals(){
            for (int i = 0; i < animals.length; i++) {
                if(animals[i] != null) {
                    System.out.println(animals[i]);
                }
            }
        }

        public boolean removeAnimal(Animal animal){
            int index = searchAnimal(animal);
            if (index == -1) return false;
            if(index == animals.length){
                animals[index] = null;
                return true;
            }
            for (int i = index; i < animals.length-1; i++) {
                animals[i] = animals[i+1];
            }
            return true;
        }

        public  boolean removeAnimal1(Animal animal){
            while (animals[animals.length-1] != null ) {
                int index = searchAnimal(animal);
                if(index !=-1){
                    animals[index] = animals[index+1];
                }
                nbAnimals--;

                return true;
            }
            return false;
        }
        public boolean isZooFull(){
            for (int i = 0; i < animals.length; i++) {
                if(animals[i] == null)return false;
            }
            return true;
        }
        public static   Zoo comparerZoo(Zoo z1, Zoo z2){
            if (z1.nbAnimals>z2.nbAnimals)
                return z1;
            return z2;
        }
        public String getName(){
            return name;
        }
        public void setName(String name){
            if (name == null){
                System.out.println("Erreur: name null");
                return;
            }
            this.name = name;
        }

        public Animal[] getAnimals() {
            return animals;
        }

        public void setAnimals(Animal[] animals) {
            this.animals = animals;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public int getNbrCages() {
            return nbrCages;
        }

        public void setNbrCages(int nbrCages) {
            this.nbrCages = nbrCages;
        }

        public int getNbAnimals() {
            return nbAnimals;
        }

        public void setNbAnimals(int nbAnimals) {
            this.nbAnimals = nbAnimals;
        }

        @Override
        public String toString() {
            return "entity.Zoo name: " + name + ", city: " + city + ", nbrCages: " + nbrCages;
        }
        public int searchAquaticAnimal(Aquatic aq){
            for(int i=0;i<aquaticAnimals.length;i++){
                if(aquaticAnimals[i]!=null && (aquaticAnimals[i].equals(aq)))
                   return i;
            }
            return -1;
        }
        public boolean addAquaticAnimal(Aquatic aq){
            if(searchAquaticAnimal(aq)!=-1){
                return false;
            }else{
                for(int i=0;i<aquaticAnimals.length;i++){
                    if(aquaticAnimals[i]==null){
                        aquaticAnimals[i]=aq;
                        return true;
                    }
                }
            }
        return false;
        }
        public void displayAquaticAnimals(){
            for(int i=0;i<aquaticAnimals.length;i++){
                if(aquaticAnimals[i]!=null){
                    System.out.println(aquaticAnimals[i]);
                }
            }
        }
       public float maxPenguinSwimmingDepth(){
            float maxDepth=0;
            for(int i=0;i<aquaticAnimals.length;i++){
                if(aquaticAnimals[i] instanceof Penguin){
                    Penguin p=(Penguin) aquaticAnimals[i];
                    if(p.getSwimmingDepth()>maxDepth){
                        maxDepth=p.getSwimmingDepth();
                    }
                }
            }
            return maxDepth;
        }
        public void DisplayNumberOfAquaticsByType() {
            int dolphins = 0;
            int penguins = 0;
            for (int i = 0; i < aquaticAnimals.length; i++) {
                if (aquaticAnimals[i] instanceof Dolphin) {
                    dolphins++;
                } else if (aquaticAnimals[i] instanceof Penguin) {
                    penguins++;
                }
            }
            System.out.println("Number of Dolphins: " + dolphins);
            System.out.println("Number of Penguins: " + penguins);
        }
}

