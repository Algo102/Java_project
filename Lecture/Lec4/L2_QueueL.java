package Lecture.Lec4;

import java.util.LinkedList;
import java.util.Queue;

// Queue - принцип FIFO, кто первый пришел, тот и будет первый обрабтан. Как в магазине.
// Построена на LinkedList. Queue<Integer> queue = new LinkedList<Integer>();

public class L2_QueueL {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.add(1); // Добавление элемента
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        System.out.println(queue); // [1, 2, 3, 4, 5]
        int item = queue.remove(); // удаляется элемент, который был добавлен первым
        System.out.println(queue); // [2, 3, 4, 5]
        queue.offer(2809); // Вставляет элемент в конец очереди
        item = queue.remove();
        System.out.println(queue); // [3, 4, 5, 2809]
        item = queue.remove();
        System.out.println(queue); // [4, 5, 2809]
        item = queue.remove();
        System.out.println(queue); // [5, 2809]
        item = queue.poll(); // возвращает с удалением (верхний) элемент из начала очереди . Если очередь пуста, возвращает значение null
        System.out.println(queue.peek()); // возвращает-показывает без удаления элемент из начала очереди Если очередь пуста, возвращает значение null
        queue.remove(2809); // зачем очередь?? Но будет работать очень долго, так как пока переберет все ссылки, чтоб найти значение
        queue.element(); // возвращает, но не удаляет, элемент из начала очереди. Если очередь пуста, генерирует исключение NoSuchElementException
        queue.peek(); // peek() и element() - показывают верхний элемент очереди        
    }
}
// E element(): возвращает, но не удаляет, элемент из начала очереди. Если очередь пуста, генерирует исключение NoSuchElementException
// E peek(): возвращает без удаления элемент из начала очереди. Если очередь пуста, возвращает значение null
// peek() и element() - показывают верхний элемент очереди

// E poll(): возвращает с удалением элемент из начала очереди. Если очередь пуста, возвращает значение null
// int item = queue.remove(); возвращает с удалением элемент из начала очереди. Если очередь пуста, генерирует исключение NoSuchElementException
// remove() и poll() - удаляет верхний элемент из очереди.

// add() - добавляет элемент в конец очереди.
// Поправка: если очередь с приоритетом - т.е. PriorityQueue - элемент ставится не обязательно в конец, а в соответствии со своим приоритетом

// offer() - пытается вставить элемент в конец очереди.

// boolean offer(E obj): добавляет элемент obj в конец очереди. Если элемент удачно добавлен, возвращает true, иначе - false