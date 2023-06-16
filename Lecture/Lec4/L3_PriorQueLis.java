package Lecture.Lec4;

import java.util.PriorityQueue;


public class L3_PriorQueLis {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        pq.add(123); // Добавление элемента
        pq.add(3);
        pq.add(13);
        pq.add(1);
        System.out.println(pq); // [1, 3, 13, 123]
        System.out.println(pq.poll()); // 1  // возвращает(показывает) с удалением (извлекает)(верхний) элемент из начала очереди . Если очередь пуста, возвращает значение null
        System.out.println(pq.poll()); // 3
        System.out.println(pq.poll()); // 13
        System.out.println(pq.poll()); // 123
        System.out.println(pq.poll()); // null
    }
}

