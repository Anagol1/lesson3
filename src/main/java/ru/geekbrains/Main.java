package ru.geekbrains;

public class Main {

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.addFirst(1);
        linkedList.addFirst(3);
        linkedList.addFirst(4);
        linkedList.printList();

        linkedList.addLast(7);
        linkedList.addLast(77);
        linkedList.addLast(758);
        linkedList.printList();
        linkedList.reverse();
        linkedList.printList();

//
//
//        System.out.println(linkedList);
//        System.out.println("linkedList.contains(55) = " + linkedList.contains(55));
//        System.out.println("linkedList.contains(55) = " + linkedList.contains(77));
//        linkedList.removeLast();
//        linkedList.printList();
//        linkedList.remove();
//        linkedList.printList();

        DoubleList doubleList = new DoubleList();
        doubleList.addFirst(1);
        doubleList.addFirst(12);
        doubleList.addFirst(1123);
        doubleList.addFirst(444);
        doubleList.addLast(25);
        doubleList.addLast(35);
        doubleList.addLast(555);
        doubleList.printList();

        doubleList.reverse();
        doubleList.printList();
    }
}