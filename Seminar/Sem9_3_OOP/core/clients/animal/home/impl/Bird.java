package Seminar.Sem9_3_OOP.core.clients.animal.home.impl;

import java.time.LocalDate;

import Seminar.Sem9_3_OOP.core.clients.actionsAnimal.Flyable;
import Seminar.Sem9_3_OOP.core.clients.actionsAnimal.specifics.Sings;
import Seminar.Sem9_3_OOP.core.clients.animal.home.Pet;
import Seminar.Sem9_3_OOP.core.clients.owners.Owner;

public class Bird extends Pet implements Flyable, Sings {
  public Bird() {
    }

  public Bird(int id, String name, int numberOfLimbs, LocalDate registrationDate, Owner owner) {
    super(id, name, numberOfLimbs, registrationDate, owner);
  }

  @Override
  public int fly() {
    System.out.println(CLASS_NAME + "летит со скоростью: 12 км/ч");
        return 12;
  }

  @Override
  public int sound() {
    System.out.println(CLASS_NAME + "щебечет: 2 раза");
        return 2;
  }

  @Override
  public int sing() {
    System.out.println(CLASS_NAME + "поет: 1 раза");
        return 1;
  }




}
