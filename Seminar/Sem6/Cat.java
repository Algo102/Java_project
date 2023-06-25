package Seminar.Sem6;

// Реализовать класс Cat для вет. клиники
// Добавить в него поля:
// Имя, возраст, Привит ли кот (boolean), дефолт - false, пол
// Добавить методы:
// Кот Имя мяукнул n раз
// Прививка кота, если был привит - сообщить об этом
// Так же придумать 1-2 своих метода

public class Cat {
  String name = "";
  Integer age;
  Boolean vaccin = false;
  String sex = "";  
  Integer legs = 4;
  Integer live = 3;
  Integer count = 0;
  String res1 = "";


  public void makePrivika() {
    if(this.vaccin){
      System.out.println(this.name + " Уже привит, прививать второй раз не будем");
    }
    else{
      vaccin = true;
      System.out.println(this.name + " привили");
    }
    
  }

  public void CheckPrivika() {
    System.out.println(this.vaccin ? this.name + " привит" : this.name + " пока нет");
  }



  public void Vaccina() {
    if(!vaccin){ // vaccin != true
      System.out.println("Ваш питомец " + this.name + " не вакцинирован, сейчас сделаем прививку ");
      this.vaccin = true;
    }
    else{
      System.out.println("Ваш питомец " + this.name + " уже вакцинирован, adios ");
    }
  }

  
  public void Myau(Integer myau) {       
    this.count += myau;
    System.out.println("Ваш питомец " + this.name + " сейчас мяукнул " + myau + " раз. А всего " + this.count + " раз");
  }

  public void Trable() {
    if(legs > 1){
      legs --;
      System.out.println("У вашего питомца " + name + " осталось " + legs + " лапки/а ");
    } 
    else{
      System.out.println("Вашего питомец " + name + " потерял все ножки " );
    } 
  }

  public Integer MenosLive() {
    if(live > 1){
      live --; 
      System.out.println("Вашего питомец " + name + " потерял жизнь, осталось " + live+ " жизней");     
    }
    else{
      System.out.println("Ваш птомец больше совсем не живой ");
    }
    return live;
  }





  
}
