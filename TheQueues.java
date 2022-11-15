package org.spck;

import java.util.LinkedList;
import java.util.Queue;

public class TheQueues {
    public static void main(String[] args) {

        Queue<Person> queue = new LinkedList<>();
        queue.add(new Person("Valentin", 21));
        queue.add(new Person("Alex", 18));
        queue.add(new Person("Alina", 34));

        System.out.println(queue.size());
        System.out.println(queue.peek()); // take the first added
        System.out.println(queue.poll()); // remove the first added
        System.out.println(queue.size());
        System.out.println(queue.peek());
    }

    static record Person(String name, int age){}
}
