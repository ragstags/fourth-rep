package com.com.Collections;

import java.util.LinkedHashSet;

/**
 * Created by nadimchouglay on 26/12/2018.
 */
public class Applications {

    public static void main(String[] args) {
        LinkedHashSet<Animals > values = new LinkedHashSet<>();
       Animals animal1 = new Animals("Dog",12);
        Animals animal2 = new Animals("Cat",11);
        Animals animal3 = new Animals("bird",8);
        Animals animal4 = new Animals("Dog",12);
        Animals animal5 = new Animals("frog",2);
        Animals animal6 = new Animals("parrot",1);
        values.add(animal1);
        values.add(animal2);
        values.add(animal3);
        values.add(animal4);
        values.add(animal5);
        values.add(animal6);

        System.out.println(animal1.hashCode());
        System.out.println(animal4.hashCode());
        for (Animals  value :values){
            System.out.println(value);
        }

    }
}
