package Lecture.Lec3;

public class L2_Massiv {

    // Метод который добавляет элемент к текущему массиву
    static int[] AddItemInArray(int[] array, int item) {
        int length = array.length;
        
        int[] temp = new int[length + 1];
        System.arraycopy(array, 0, temp, 0, length);
        temp[length] = item;
        return temp;
    } 

    public static void main(String[] args) {
        int[] a = new int[] { 0, 9 };
        for (int i : a) { System.out.printf("%d ", i); }
        a = AddItemInArray(a, 11);
        a = AddItemInArray(a, 111);
        a = AddItemInArray(a, 1111);
        System.out.println();
        for (int j : a) { System.out.printf("%d ", j); }
        System.out.println();


        // Добовляем элемент к массиву без метода
        int[] old = new int[] {1, 9}; // Исходный массив
        int[] nw = new int[3]; // Новый массив, в который скопируем старый + новый элемент
        // старый с нуля, новый с нуля и весь старый
        System.arraycopy(old, 0, nw, 0, old.length);

        for (int i : old) {
            System.out.printf("%d", i); // 19
        }

        for (int j : nw) {
            System.out.printf("%d", j); // 190
        }
    }
}