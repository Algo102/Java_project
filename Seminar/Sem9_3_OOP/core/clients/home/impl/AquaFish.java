package Seminar.Sem9_3_OOP.core.clients.home.impl;

import Seminar.Sem9_3_OOP.core.clients.Swimable;
import Seminar.Sem9_3_OOP.core.clients.home.Pet;
import Seminar.Sem9_3_OOP.core.clients.owners.Owner;

import java.time.LocalDate;

public class AquaFish extends Pet implements Swimable {
    public AquaFish() {

    }
    public AquaFish (int id, String name, int numberOfLimbs, LocalDate registrationDate, Owner owner){
        super (id, name, numberOfLimbs, registrationDate, owner);
    }

    @Override
    public int swims() {
        return 4;
    }
}
