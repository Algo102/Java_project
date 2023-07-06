package DZ.DZ8_2_OOP.core.clients.animal.wild.impl;

import java.time.LocalDate;

import DZ.DZ8_2_OOP.core.clients.actionsAnimal.Flyable;
import DZ.DZ8_2_OOP.core.clients.actionsAnimal.Runnable;
import DZ.DZ8_2_OOP.core.clients.actionsAnimal.Soundable;
import DZ.DZ8_2_OOP.core.clients.actionsAnimal.Swimable;
import DZ.DZ8_2_OOP.core.clients.actionsAnimal.specifics.Dives;
import DZ.DZ8_2_OOP.core.clients.actionsAnimal.specifics.OnTheWater;
import DZ.DZ8_2_OOP.core.clients.animal.wild.WildAnimal;
import DZ.DZ8_2_OOP.core.clients.owners.Owner;

public class Duck extends WildAnimal implements Flyable, Runnable, Soundable, OnTheWater, Dives {
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
    public int swimOnWater() {
        System.out.println(CLASS_NAME + "плывет со скоростью: 2 км/ч");
        return 2;
    }

    // Не знаю как отключить главный интерфейс
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
