package org.spck;

import java.util.LinkedList;
import java.util.ListIterator;

public class TheLinkedList {
    public static void main(String[] args) {

        LinkedList<TheQueues.Person> linkedList = new LinkedList<>(); // its one implemententation of the queue interface
        linkedList.add(new TheQueues.Person("Alex", 21));
        linkedList.add(new TheQueues.Person("Alexa", 21));
        linkedList.addLast(new TheQueues.Person("Nacho", 13));
        linkedList.addFirst(new TheQueues.Person("Carli", 63));

        ListIterator<TheQueues.Person> personListIterator = linkedList.listIterator();
        while (personListIterator.hasNext()) {
            System.out.println(personListIterator.next());
        }

        System.out.println("");

        while (personListIterator.hasPrevious()) {
            System.out.println(personListIterator.previous());
        }
    }
}
