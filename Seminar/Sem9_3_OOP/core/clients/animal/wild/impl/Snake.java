package Seminar.Sem9_3_OOP.core.clients.animal.wild.impl;

import java.time.LocalDate;

import Seminar.Sem9_3_OOP.core.clients.actionsAnimal.specifics.Crawling;
import Seminar.Sem9_3_OOP.core.clients.animal.wild.WildAnimal;
import Seminar.Sem9_3_OOP.core.clients.owners.Owner;

public class Snake extends WildAnimal implements Crawling {
  public Snake() {
    }

    public Snake(int id, int numberOfLimbs, LocalDate registrationDate, Owner owner) {
        super(id, numberOfLimbs, registrationDate, owner);
    }

    @Override
    public int run() {
      System.out.println(CLASS_NAME + "Не умею бегать, зато умею ползать");
        return 0;
    }

    @Override
    public int crawl() {
      System.out.println(CLASS_NAME + "ползает со скоростью 1 км/ч");
        return 1;
    }

}
