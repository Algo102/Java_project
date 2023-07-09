package Seminar.Sem9_3_OOP.core.clients.animal.wild.impl;

import Seminar.Sem9_3_OOP.core.clients.actionsAnimal.Runnable;
import Seminar.Sem9_3_OOP.core.clients.actionsAnimal.Soundable;
import Seminar.Sem9_3_OOP.core.clients.actionsAnimal.specifics.Jumping;
import Seminar.Sem9_3_OOP.core.clients.animal.wild.WildAnimal;
import Seminar.Sem9_3_OOP.core.clients.owners.Owner;

import java.time.LocalDate;

/**
 Одна из реализаций дикого животного
 */
public class WildCat extends WildAnimal implements Soundable, Jumping {
    public WildCat() {
    }

    public WildCat(int id, int numberOfLimbs, LocalDate registrationDate, Owner owner) {
        super(id, numberOfLimbs, registrationDate, owner);
    }

    @Override
    public int run() {
        System.out.println(CLASS_NAME + "Бегает со скоростью 15 км/ч");
        return 15;
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
}
