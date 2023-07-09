package Seminar.Sem9_3_OOP.core.clients.animal.home.impl;

import Seminar.Sem9_3_OOP.core.clients.actionsAnimal.Runnable;
import Seminar.Sem9_3_OOP.core.clients.actionsAnimal.Soundable;
import Seminar.Sem9_3_OOP.core.clients.actionsAnimal.specifics.Jumping;
import Seminar.Sem9_3_OOP.core.clients.animal.home.Pet;
import Seminar.Sem9_3_OOP.core.clients.owners.Owner;

import java.time.LocalDate;

/**
 Одна из реализаций домашнего животного
 */
public class Cat extends Pet implements Soundable, Jumping {
    public Cat() {
    }

    public Cat(int id, String name, int numberOfLimbs, LocalDate registrationDate, Owner owner) {
        super(id, name, numberOfLimbs, registrationDate, owner);
    }

    @Override
    public int sound() {
        System.out.println(CLASS_NAME + "мяукает: 2 раза");
        return 2;
    }

    @Override
    public int jump() {
        System.out.println(CLASS_NAME + "прыгает: 1 раз");
        return 1;
    }

    @Override
    public int run() {
        System.out.println(CLASS_NAME + "Бегает со скоростью 15 км/ч");
        return 15;
    }
}
