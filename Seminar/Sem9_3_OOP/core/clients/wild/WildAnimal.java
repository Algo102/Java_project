package Seminar.Sem9_3_OOP.core.clients.wild;

import Seminar.Sem9_3_OOP.core.clients.Animal;
import Seminar.Sem9_3_OOP.core.clients.Animals;
import Seminar.Sem9_3_OOP.core.clients.owners.Owner;
import Seminar.Sem9_3_OOP.core.clients.supports.Record;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 Абстракция дикого животного
 */
public class WildAnimal extends Animal implements Animals {
    public WildAnimal() {
    }

// Зачем нам конструктор с параметром reсords, если в родительском классе в конструкторе этот параметр отсутствует?
//    private WildAnimal(int id, String name, int numberOfLimbs, LocalDate registrationDate, Owner owner, List<Record> records) {
//        super(id, name, numberOfLimbs, registrationDate, owner);
//    }

    public WildAnimal(int id, int numberOfLimbs, LocalDate registrationDate, Owner owner) {
        this.id = id;
        this.name = null;
        this.numberOfLimbs = numberOfLimbs;
        this.registrationDate = registrationDate;
        this.owner = owner;
        this.records = new ArrayList<>();
    }

}
