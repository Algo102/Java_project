package Seminar.Sem9_3_OOP.core.clients.home.impl;

import Seminar.Sem9_3_OOP.core.clients.Flyable;
import Seminar.Sem9_3_OOP.core.clients.Soundable;
import Seminar.Sem9_3_OOP.core.clients.Runnable;
import Seminar.Sem9_3_OOP.core.clients.home.Pet;
import Seminar.Sem9_3_OOP.core.clients.owners.Owner;

import java.time.LocalDate;

public class Parrot extends Pet implements Flyable, Runnable, Soundable {
    public Parrot(){

    }
    public Parrot (int id, String name, int numberOfLimbs, LocalDate registrationDate, Owner owner) {
        super(id, name, numberOfLimbs, registrationDate, owner);
    }

    @Override
    public int runs() {
        return 4;
    }
    @Override
    public int flies() {
        return 20;
    }
    @Override
    public void sounds() {
        System.out.println("- Попка дур-р-рак!!!");
    }

}
