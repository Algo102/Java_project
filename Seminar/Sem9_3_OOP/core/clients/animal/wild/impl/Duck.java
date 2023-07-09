package Seminar.Sem9_3_OOP.core.clients.animal.wild.impl;

import java.time.LocalDate;

import Seminar.Sem9_3_OOP.core.clients.actionsAnimal.Flyable;
import Seminar.Sem9_3_OOP.core.clients.actionsAnimal.Runnable;
import Seminar.Sem9_3_OOP.core.clients.actionsAnimal.Soundable;
import Seminar.Sem9_3_OOP.core.clients.actionsAnimal.Swimable;
import Seminar.Sem9_3_OOP.core.clients.actionsAnimal.specifics.Dives;
import Seminar.Sem9_3_OOP.core.clients.actionsAnimal.specifics.OnTheWater;
import Seminar.Sem9_3_OOP.core.clients.animal.wild.WildAnimal;
import Seminar.Sem9_3_OOP.core.clients.owners.Owner;

public class Duck extends WildAnimal implements Flyable, Runnable, Soundable, Dives {
    public Duck() {
    }

    public Duck(int id, int numberOfLimbs, LocalDate registrationDate, Owner owner) {
        super(id, numberOfLimbs, registrationDate, owner);
    }

    @Override
    public int fly() {
        System.out.println(CLASS_NAME + "летит со скоростью: 5 км/ч");
        return 5;
    }

    @Override
    public int run() {
        System.out.println(CLASS_NAME + "ходит со скоростью: 3 км/ч");
        return 3;
    }

    @Override
    public int sound() {
        System.out.println(CLASS_NAME + "крякает: 2 раза");
        return 2;
    }

    @Override
    public int swim() {
        System.out.println(CLASS_NAME + "плывет со скоростью: 2 км/ч");
        return 2;
    }

    @Override
    public int dive() {
        System.out.println(CLASS_NAME + "ныряет: 1 раза");
        return 1;
    }

}
