package Seminar.Sem9_3_OOP.core.clients.animal.home.impl;

import Seminar.Sem9_3_OOP.core.clients.actionsAnimal.Swimable;
import Seminar.Sem9_3_OOP.core.clients.actionsAnimal.specifics.Growls;
import Seminar.Sem9_3_OOP.core.clients.actionsAnimal.specifics.Jumping;
import Seminar.Sem9_3_OOP.core.clients.animal.home.Pet;
import Seminar.Sem9_3_OOP.core.clients.owners.Owner;

import java.time.LocalDate;

/**
 Одна из реализаций домашнего животного
 */
public class Dog extends Pet implements Growls, Jumping, Swimable{
    public Dog() {
    }

    public Dog(int id, String name, int numberOfLimbs, LocalDate registrationDate, Owner owner) {
        super(id, name, numberOfLimbs, registrationDate, owner);
    }

    @Override
    public int sound() {
        System.out.println(CLASS_NAME + "гавкает: 2 раза");
        return 2;
    }

    @Override
    public int growl() {
        System.out.println(CLASS_NAME + "рычит: 1 раз");
        return 1;
    }

    @Override
    public int run() {
        System.out.println(CLASS_NAME + "Бегает со скоростью 20 км/ч");
        return 20;
    }

    @Override
    public int jump() {
        System.out.println(CLASS_NAME + "прыгает: 3 раз");
        return 3;
    }

    @Override
    public int swim() {
        System.out.println(CLASS_NAME + "плывет со скоростью: 1 км/ч");
        return 1;
    }
}
