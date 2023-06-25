package Seminar.Sem6;



public class T2_Cat {
  public static void main(String[] args) {
    Cat cat1 = new Cat();
    cat1.name = "Барсик";
    cat1.sex = "Мужской";
    cat1.age = 12;
    System.out.println("Нашего питомца зовут " + cat1.name + " имеет " + cat1.sex + " род, и " + cat1.age + " месяцев ");
    System.out.println("При рождении получил/а " + cat1.live + " жизни ");
    System.out.println();

    Cat cat2 = new Cat();
    cat2.name = "Дуся";
    cat2.sex = "Женский";
    cat2.age = 6;
    cat2.live = 4;
    System.out.println("Нашего питомца зовут " + cat2.name + " имеет " + cat2.sex + " род, и " + cat2.age + " месяцев ");
    System.out.println("При рождении получил/а " + cat2.live + " жизни ");
    System.out.println();

    cat1.CheckPrivika();

    cat2.makePrivika();
    cat1.makePrivika();
    cat1.makePrivika();

    // cat1.Vaccina(); // Ваш питомец Макс не вакцинирован, сейчас сделаем прививку
    // cat2.Vaccina(); 
    // cat2.Vaccina(); 
    // cat1.Vaccina(); // Ваш питомец Макс уже вакцинирован, adios
    // System.out.println();

    // cat1.Myau(5);    
    // cat2.Myau(6);
    // cat1.Myau(5);
    // cat2.Myau(6);
    // System.out.println();

    // System.out.printf("У вашего питомца %s сейчас %d лапки/а\n", cat1.name, cat1.legs);
    // cat1.Trable();
    // cat2.Trable();
    // cat2.Trable();
    // cat1.Trable();
    // cat1.Trable();
    // cat1.Trable();
    // cat2.Trable();
    // cat2.Trable();
    // System.out.println();

    // cat1.MenosLive();cat2.MenosLive();cat2.MenosLive();cat1.MenosLive();
    // cat1.MenosLive();cat2.MenosLive();cat2.MenosLive();
  }
  
}
