import entity.*;
import Exception.InvalidAgeException;
import Exception.ZooFullException;
void main() {

   /* ZooManagement zooManagement ;
    zooManagement = new ZooManagement();
    System.out.println(zooManagement);
    Scanner scanner = new Scanner(System.in);
    System.out.println("zoo name:  ");
    String name =scanner.nextLine();

    zooManagement.zooName = name;
    System.out.println("nbr cages : ");
    int nbr =scanner.nextInt();
    zooManagement.nbrCage = nbr;
    System.out.println(zooManagement);
    nbr =100;
    ZooManagement zooManagement2 = new ZooManagement(name,nbr);
    System.out.println(zooManagement2);*/
    Animal chat = new Animal();
    Animal chien = new Animal();
    Zoo frigya = new Zoo();
    chien.setFamily("chien");
    chien.setName("boby");
    chien.setAge(2);
    chien.setMammal(true);
    System.out.println("chien : "+chien);
    chat.setFamily("chat");
    chat.setName("michou");
    chat.setAge(-1);
    chat.setMammal(true);
    System.out.println("michou : "+chat);
    frigya.setName("frigya");
    System.out.println("frigya : "+frigya);
    Zoo zoo = new Zoo("my Zoo","tunisie",20);
    Animal animal = new Animal("Chat","katis",-1,true);
    Animal animal2 = new Animal("Chien","loulou",1,true);
    zoo.displayZoo();

    Animal chien1 = new Animal();

    Animal chat1 = new Animal("chat","michou",2,true);
    System.out.println(chat.getName());
    System.out.println(chat.getAge());
    System.out.println(chien);
    System.out.println(chat);
    Zoo zoo1 = new Zoo();
    System.out.println(zoo.getAnimals().length);
    Zoo zoo2 = new Zoo("My zoo","Nabeul",3);
    System.out.println(zoo2.getAnimals().length);
    Zoo zoo3 = new Zoo("My zoo","Nabeul",20);
    System.out.println(zoo3.getAnimals().length);

    // System.out.println(zoo2.addAnimal(chien));
    //System.out.println(zoo2.searchAnimal(new Animal()));
    //zoo2.afficherAnimals();
    try {

        //zoo2.addAnimal1(animal);
        zoo2.addAnimal1(animal2);
        zoo2.addAnimal1(animal2);
        zoo2.addAnimal1(animal2);
        zoo2.addAnimal1(animal2);


    } catch (ZooFullException e) {
        System.out.println("Erreur : " + e.getMessage());
    } catch (InvalidAgeException i) {
        System.out.println("Erreur : " + i.getMessage());
    }

    zoo2.afficherAnimals();
//System.out.println(zoo2.removeAnimal(chien));
//System.out.println(zoo2.removeAnimal(chat));
    //zoo2.afficherAnimals();
    //System.out.println(zoo2.isZooFull());
    /*System.out.println("Zoo is full : "+ Zoo.comparerZoo(zoo, zoo2));*/
    Terrestrial lion = new Terrestrial("Lion","leo",3,true,4);
    Dolphin dolphin = new Dolphin("Dolphin","dofdof",1,true,"habitat",1);
    //System.out.println("dolphin : "+dolphin);
    //dolphin.swim();
    //System.out.println(zoo.addAquaticAnimal(dolphin));
    Penguin penguin = new Penguin("Penguin","pengi",2,true,"antarctica",2);
    //System.out.println(zoo.addAquaticAnimal(penguin));
    //zoo.DisplayNumberOfAquaticsByType();
    //penguin.swim();
    dolphin.eatMeat(Food.MEAT);
    penguin.eatMeat(Food.MEAT);
    lion.eatPlant(Food.PLANT);
    lion.eatMeat(Food.MEAT);
    lion.eatPlantAndMeat(Food.BOTH);
}

