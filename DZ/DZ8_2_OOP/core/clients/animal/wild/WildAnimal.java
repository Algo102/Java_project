package DZ.DZ8_2_OOP.core.clients.animal.wild;

import DZ.DZ8_2_OOP.core.clients.Animal;
import DZ.DZ8_2_OOP.core.clients.Animals;
import DZ.DZ8_2_OOP.core.clients.owners.Owner;
import DZ.DZ8_2_OOP.core.clients.supports.Record;

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

    protected WildAnimal(int id, String name, int numberOfLimbs, LocalDate registrationDate, Owner owner, List<Record> records) {
        super(id, name, numberOfLimbs, registrationDate, owner);
    }

    public WildAnimal(int id, int numberOfLimbs, LocalDate registrationDate, Owner owner) {
        this.id = id;
        this.name = null;
        this.numberOfLimbs = numberOfLimbs;
        this.registrationDate = registrationDate;
        this.owner = owner;
        this.records = new ArrayList<>();
    }

}
