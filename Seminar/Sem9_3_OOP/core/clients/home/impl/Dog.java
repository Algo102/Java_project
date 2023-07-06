package Seminar.Sem9_3_OOP.core.clients.home.impl;

import Seminar.Sem9_3_OOP.core.clients.Soundable;
import Seminar.Sem9_3_OOP.core.clients.Swimable;
import Seminar.Sem9_3_OOP.core.clients.Runnable;
import Seminar.Sem9_3_OOP.core.clients.home.Pet;
import Seminar.Sem9_3_OOP.core.clients.owners.Owner;

import java.time.LocalDate;

/**
 Одна из реализаций домашнего животного
 */
public class Dog extends Pet implements Runnable, Swimable, Soundable {
    public Dog() {
    }

    public Dog(int id, String name, int numberOfLimbs, LocalDate registrationDate, Owner owner) {
        super(id, name, numberOfLimbs, registrationDate, owner);
    }


    @Override
    public int runs() {
        return 30;
    }

    @Override
    public void sounds() {
        System.out.println("- Гав! Гав! Гав!");
    }

    @Override
    public int swims() {
        return 3;
    }
}
