package DZ.DZ8_2_OOP.core;

import java.util.ArrayList;
import java.util.List;

import DZ.DZ8_2_OOP.core.clients.Animal;
import DZ.DZ8_2_OOP.core.clients.Animals;
import DZ.DZ8_2_OOP.core.clients.Human;
import DZ.DZ8_2_OOP.core.clients.actionsAnimal.Flyable;
import DZ.DZ8_2_OOP.core.clients.actionsAnimal.Runnable;
import DZ.DZ8_2_OOP.core.clients.actionsAnimal.Soundable;
import DZ.DZ8_2_OOP.core.clients.actionsAnimal.Swimable;
import DZ.DZ8_2_OOP.core.clients.animal.home.impl.Cat;

public class VetClinic {
    private static List<Animals> animals = new ArrayList<>(); 

    private static void heal(Animals patients) {
        System.out.println(patients.getClassName() + " вылечен");
    } 

    
    public static void runnableAllAnimals(List<Animal> allAnimals){
        List<Animal> curentList = new ArrayList<>();
        for (int i = 0; i < allAnimals.size(); i++) {
            if (allAnimals.get(i) instanceof Runnable) {
                curentList.add(allAnimals.get(i)); 
            } 
        }
        System.out.println(curentList);
    }

    public static void flyableAllAnimals(List<Animal> allAnimals){
        List<Animal> curentList = new ArrayList<>();
        for (int i = 0; i < allAnimals.size(); i++) {
            if (allAnimals.get(i) instanceof Flyable) {
                curentList.add(allAnimals.get(i)); 
            } 
        }
        System.out.println(curentList);
    }

    public static void soundableAllAnimals(List<Animal> allAnimals){
        List<Animal> curentList = new ArrayList<>();
        for (int i = 0; i < allAnimals.size(); i++) {
            if (allAnimals.get(i) instanceof Soundable) {
                curentList.add(allAnimals.get(i)); 
            } 
        }
        System.out.println(curentList);
    }

     public static void swimableAllAnimals(List<Animal> allAnimals){
        List<Animal> curentList = new ArrayList<>();
        for (int i = 0; i < allAnimals.size(); i++) {
            if (allAnimals.get(i) instanceof Swimable) {
                curentList.add(allAnimals.get(i)); 
            } 
        }
        System.out.println(curentList);
    }
  
    public static void main(String[] args) {
        Human human = new Human("Пайтон");
        Cat cat = new Cat(0, null, 0, null, null);
        // Так создали интерфейс Анималс и имплементировали в WildAnimals и Pet, для того чтоб только их можно было лечить, соответственно лечить людей больше не можем
        //animals.add(human);
        animals.add(cat);
        for (Animals element: animals) {
            heal(element);
        } 

        

        
        

        
    }
 
}

