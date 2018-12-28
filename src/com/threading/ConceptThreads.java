package com.threading;

/**
 * Created by nadimchouglay on 28/12/2018.
 */
public class ConceptThreads {
    public static void main(String[] args) {
        System.out.println("Staring thread 1 ");
        Task task1 = new Task("Thread-A");
        task1.start();


        System.out.println("Starting thread 2");
        Task task2 = new Task("Thread-B");
        task2.start();


    }

    static class Task extends Thread {

        String name;

        public Task(String name) {
            this.name = name;
        }

        public void run() {
            Thread.currentThread().setName(this.name);
            for (int i = 0; i < 1000; i++) {
                System.out.println("number :" + i + " -" + Thread.currentThread().getName());
            }
        }

    }
}






