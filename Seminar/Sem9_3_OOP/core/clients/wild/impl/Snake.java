package Seminar.Sem9_3_OOP.core.clients.wild.impl;

import Seminar.Sem9_3_OOP.core.clients.owners.Owner;
import Seminar.Sem9_3_OOP.core.clients.supports.Record;
import Seminar.Sem9_3_OOP.core.clients.wild.WildAnimal;

import java.time.LocalDate;
import java.util.List;

public class Snake extends WildAnimal {
    public Snake() {

    }
    public Snake (int id, int numberOfLimbs, LocalDate registrationDate, Owner owner) {
        super(id, numberOfLimbs, registrationDate, owner);
    }
}
