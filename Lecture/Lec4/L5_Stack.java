package Lecture.Lec4;

import java.util.*;

//  Stack - принцип работа называется LIFO — "last in — first out" (“последним пришел — первым вышел”).
// Коллекции Stack и Vector уже устарели и лучше использвать Deque

public class L5_Stack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(12);
        stack.push(123);
        System.out.println(stack.pop()); // 123
        System.out.println(stack.pop()); // 12
        System.out.println(stack.pop()); // 1
    }
}

// push() — добавляет элемент на верх стека. Когда мы отправляем карту в сброс, она ложится поверх сброшенных ранее карт;
// pop() — удаляет верхний элемент из стека и возвращает его. Этот метод идеально подходит для реализации механики “игрок берет карту”
// peek() — возвращает верхний элемент стека, но не удаляет его из стека