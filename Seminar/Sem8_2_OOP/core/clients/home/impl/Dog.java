package Seminar.Sem8_2_OOP.core.clients.home.impl;

import Seminar.Sem8_2_OOP.core.clients.home.Pet;
import Seminar.Sem8_2_OOP.core.clients.owners.Owner;

import java.time.LocalDate;

/**
 Одна из реализаций домашнего животного
 */
public class Dog extends Pet {
    public Dog() {
    }

    public Dog(int id, String name, int numberOfLimbs, LocalDate registrationDate, Owner owner) {
        super(id, name, numberOfLimbs, registrationDate, owner);
    }
}