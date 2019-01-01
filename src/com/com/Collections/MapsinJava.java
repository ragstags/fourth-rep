package com.com.Collections;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by nadimchouglay on 01/01/2019.
 */
public class MapsinJava {
    public static void main(String[] args) {


        HashMap<String, String> dictionary = new HashMap<>();

        dictionary.put("random","any thing in any order");
        dictionary.put("brave","courageous");
        dictionary.put("brilliant","nvng");
        dictionary.put("joy","happiness");
        dictionary.put("brave","nvng");

        for (Map.Entry<String,String> entry :dictionary.entrySet()){
            System.out.println(entry.getKey() + " :"+ entry.getValue());


        }

    }
}