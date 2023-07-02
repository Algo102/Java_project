package Seminar.Sem8_2_OOP.core.clients.wild.impl;

import Seminar.Sem8_2_OOP.core.clients.Runnable;
import Seminar.Sem8_2_OOP.core.clients.owners.Owner;
import Seminar.Sem8_2_OOP.core.clients.wild.WildAnimal;

import java.time.LocalDate;

/**
 Одна из реализаций дикого животного
 */
public class WildCat extends WildAnimal implements Runnable {
    public WildCat() {
    }

    public WildCat(int id, int numberOfLimbs, LocalDate registrationDate, Owner owner) {
        super(id, numberOfLimbs, registrationDate, owner);
    }

    @Override
    public int run() {
        System.out.println("Бегает со скоростью 15 км/ч");
        return 15;
    }
}
