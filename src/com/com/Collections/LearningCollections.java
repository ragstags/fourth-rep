package com.com.Collections;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Created by nadimchouglay on 25/12/2018.
 */
public class LearningCollections {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<String>();
        words.add("hello");
        words.add("there");
        words.add("10");
        words.remove(2);
        for (String val:words){
            System.out.println(val);
        }

        String item1 = (String) words .get(0);
        System.out.println(item1);
        LinkedList<Integer> numbers = new LinkedList<>();
        numbers.add(100);
        numbers.add(15);
        numbers.add(160);
        numbers.add(200);
        numbers.remove();

        for (int number : numbers){
            System.out.println(number);
        }


    }
}
