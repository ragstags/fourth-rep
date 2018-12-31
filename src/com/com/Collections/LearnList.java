package com.com.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

/**
 * Created by nadimchouglay on 30/12/2018.
 */
public class LearnList {
    public static void main(String[] args) {
//        ArrayList< Integer> list1 = new ArrayList<>();
//        list1.add(12);
//        list1.add(20);
//        list1.add(30);
//        list1.add(45);
//        list1.add(76);
//        list1.add(10);
//
//        ArrayList<Integer> newList = new ArrayList<>();
//        newList.add(10);
//        newList.add(10);
//        list1.removeAll(newList);
//        System.out.println(list1);

        HashSet<Employees> hashSet = new HashSet<>();
        hashSet.add(new Employees("Mike","Accounts",2400));
        hashSet.add(new Employees("Perl","Accts",1400));
        hashSet.add(new Employees("Lemo","IR",1400));
        hashSet.add(new Employees("Chris","rep",4500));
        hashSet.add(new Employees("Mike","Accounts",2400));
        ArrayList<Employees> myList = new ArrayList<>(hashSet);
        Collections.sort(myList);
        System.out.println(myList);

    }
}
