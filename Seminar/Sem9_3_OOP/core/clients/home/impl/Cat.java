package Seminar.Sem9_3_OOP.core.clients.home.impl;

import Seminar.Sem9_3_OOP.core.clients.Soundable;
import Seminar.Sem9_3_OOP.core.clients.Runnable;
import Seminar.Sem9_3_OOP.core.clients.Swimable;
import Seminar.Sem9_3_OOP.core.clients.home.Pet;
import Seminar.Sem9_3_OOP.core.clients.owners.Owner;

import java.time.LocalDate;

/**
 Одна из реализаций домашнего животного
 */
public class Cat extends Pet implements Runnable, Swimable, Soundable {

    public Cat(int id, String name, int numberOfLimbs, LocalDate registrationDate, Owner owner) {
        super(id, name, numberOfLimbs, registrationDate, owner);
    }
    public Cat() {
    }

    @Override
    public int runs() {
        return 10;
    }

    @Override
    public int swims() {
        return 2;
    }

    @Override
    public void sounds() {
        System.out.println("- Мяу! Мяу!");
    }
}
