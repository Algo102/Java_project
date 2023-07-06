package DZ.DZ8_2_OOP.core.clients.animal.home;

import DZ.DZ8_2_OOP.core.clients.Animal;
import DZ.DZ8_2_OOP.core.clients.Animals;
import DZ.DZ8_2_OOP.core.clients.owners.Owner;

import java.time.LocalDate;

/**
 Абстракция домашнего животного
 */
public class Pet extends Animal implements Animals {
    public Pet() {
    }

    public Pet(int id, String name, int numberOfLimbs, LocalDate registrationDate, Owner owner) {
        super(id, name, numberOfLimbs, registrationDate, owner);
    }
}
