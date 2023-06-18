// Функционал коллекций

// add(args) – добавляет элемент в список ( в т.ч. на нужную позицию)
// get(pos) – возвращает элемент из списка по указанной позиции
// indexOf(item) – первое вхождение или -1
// lastIndexOf(item) – последнее вхождение или -1
// remove(pos) – удаление элемента на указанной позиции и его возвращение
// set(int pos, T item) – помещает значение item элементу, который находится на позиции pos
// void sort(Comparator) – сортирует набор данных по правилу
// subList(int start, int end) – получение набора данных от позиции start до end
// clear() – очистка списка
// toString() – «конвертация» списка в строку
// Arrays.asList – преобразует массив в список
// containsAll(col) – проверяет включение всех элементов из col
// removeAll(col) – удаляет элементы, имеющиеся в col
// retainAll(col) – оставляет элементы, имеющиеся в col
// toArray() – конвертация списка в массив Object’ов
// toArray(type array) – конвертация списка в массив type
// List.copyOf(col) – возвращает копию списка на основе имеющегося
// List.of(item1, item2,...) – возвращает неизменяемый список


// Интерфейс Iterator<E>.

// hasNext() - Пока есть следующий элемент
// next() - Следующий элемент 
// remove() - Удаление елемента
// hasPrevious() 
// E previous() 
// nextIndex() 
// previousIndex() 
// set(E e) 
// add(E e)


// ListIterator<E> - можно гонять данные в оба направления и не обязательно попорядку, можно пройти 1 2 3 4, потом вернуться к 3.

// void add(int index, E obj): добавляет в список по индексу index объект obj

// boolean addAll(int index, Collection<? extends E> col): добавляет в список по индексу index все элементы коллекции col. Если в результате добавления список был изменен, то возвращается true, иначе возвращается false

// E get(int index): возвращает объект из списка по индексу index

// int indexOf(Object obj): возвращает индекс первого вхождения объекта obj в список. Если объект не найден, то возвращается -1

// int lastIndexOf(Object obj): возвращает индекс последнего вхождения объекта obj в список. Если объект не найден, то возвращается -1

// ListIterator<E> listIterator (): возвращает объект ListIterator для обхода элементов списка

// static <E> List<E> of(элементы): создает из набора элементов объект List

// E remove(int index): удаляет объект из списка по индексу index, возвращая при этом удаленный объект

// E set(int index, E obj): присваивает значение объекта obj элементу, который находится по индексу index

// void sort(Comparator<? super E> comp): сортирует список с помощью компаратора comp

// List<E> subList(int start, int end): получает набор элементов, которые находятся в списке между индексами start и end