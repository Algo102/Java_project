package DZ.DZ8_2_OOP.core.personal;

import java.time.LocalDate;
import java.util.ArrayList;

import DZ.DZ8_2_OOP.core.clients.owners.Owner;

public abstract class Worker {
  protected final String CLASS_NAME = "The " + getClass().getSimpleName();
  protected int idMed;     
  protected String firstName;
  protected String lastName;    
  
  public Worker() {
  }
  
  public Worker(int idMed, String firstName, String lastName) {
      this.idMed = idMed;
      this.firstName = firstName;
      this.lastName = lastName;        
  }

}
