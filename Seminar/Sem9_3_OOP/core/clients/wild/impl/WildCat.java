package Seminar.Sem9_3_OOP.core.clients.wild.impl;

import Seminar.Sem9_3_OOP.core.clients.Runnable;
import Seminar.Sem9_3_OOP.core.clients.Soundable;
import Seminar.Sem9_3_OOP.core.clients.Swimable;
import Seminar.Sem9_3_OOP.core.clients.owners.Owner;
import Seminar.Sem9_3_OOP.core.clients.wild.WildAnimal;

import java.time.LocalDate;

/**
 Одна из реализаций дикого животного
 */
public class WildCat extends WildAnimal implements Runnable, Swimable, Soundable {
    public WildCat() {
    }
    public WildCat(int id, int numberOfLimbs, LocalDate registrationDate, Owner owner) {
        super(id, numberOfLimbs, registrationDate, owner);
    }

    public int runs(){
        System.out.println("Бегает со скоростью 15 км/ч");
        return 50;
    }

    @Override
    public void sounds() {
        System.out.println("- Мя-я-я-я-у! Ш-ш-ш-ш-ш... \n- Мя-я-я-я-у! Ш-ш-ш-ш-ш... ");
    }

    @Override
    public int swims() {
        return 3;
    }
}
