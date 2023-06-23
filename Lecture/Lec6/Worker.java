package Lecture.Lec6;

public class Worker {
    int id;
    int salary;
    String firstName;
    String lastName;

    // начинаем набирать to, иобразец кода сам вылезет
    @Override // Синтаксическая конструкция Java
    public String toString() {
        // изменяем базовое поведение на свое поведение, пишем свой шаблон
        // String set = String.format("id:%d FN:%s LN:%s SL:%d", id, firstName, lastName, salary);
        // return set;

        return String.format("id:%d FN:%s LN:%s SL:%d", id, firstName, lastName, salary);    
    }

    
    // Изменяем базовое поведение для equals, объясняем что значит сравнить как в примере w1 и w4. Переопределили стандартные механизмы сравнивания
    // начинаем набирать eq, иобразец кода сам вылезет
    @Override
    public boolean equals(Object o) { // В метод приходит какой-то Object, то есть сравнивается текущий объект с тем что пришел
        Worker t = (Worker) o; // этот приходящий 'о' кастуем в Worker и сохраняем в t
        // если текущий id совпадает с тем что пришел и текущий firstName совпадает с тем что к нам пришел, то считаем этих двух сотрудников равными
        return id == t.id && firstName == t.firstName;
    }

    // Изменяем базовое поведение для HashCod-а. Переопределили стандартные механизмы сравнивания
    // Делаем в качестве примера, т.к. в жизни не могут быть два разных сотрудника, тем более с одним id, находится в одном HashCod-е
    // начинаем набирать ha, иобразец кода сам вылезет
    @Override
    public int hashCode() {
        // В качестве Хеша используем только id, пример только для обучения 
        return id;
    }
}
