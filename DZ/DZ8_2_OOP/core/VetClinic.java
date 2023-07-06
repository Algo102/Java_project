package DZ.DZ8_2_OOP.core;

import java.util.ArrayList;
import java.util.List;

import DZ.DZ8_2_OOP.core.clients.Animal;
import DZ.DZ8_2_OOP.core.clients.Animals;
import DZ.DZ8_2_OOP.core.clients.Human;
import DZ.DZ8_2_OOP.core.clients.animal.home.impl.Cat;

public class VetClinic {
    private static List<Animals> animals = new ArrayList<>(); 
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
    private static void heal(Animals patients) {
        System.out.println(patients.getClassName() + " вылечен");
    }  
}

