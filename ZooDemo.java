
import java.util.ArrayList;
import java.util.List;

// Base Class: Animal
abstract class Animal {
    private String _name;
    private String _species;
    private int _age;

    public Animal(String name, String species, int age) {
        this._name = name;
        this._species = species;
        this._age = age;
    }

    public String GetName() {
        return _name;
    }

    public String GetSpecies() {
        return _species;
    }

    public int GetAge() {
        return _age;
    }

    public abstract String GetDetails();
}

// Main Class 
public class ZooDemo {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();

        zoo.AddAnimal(new Lion("Simba", 5, 25.0));
        zoo.AddAnimal(new Elephant("Dumbo", 10, 2.5));
        zoo.AddAnimal(new Penguin("Pingu", 3, 10.0));
        zoo.AddAnimal(new Monkey("George", 4, 75.0));

        zoo.DisplayAllAnimals();
    }
}
