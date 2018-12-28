package com.com.Collections;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by nadimchouglay on 26/12/2018.
 */
public class Application {
    public static void main(String[] args) {
        ArrayList<String> animals = new ArrayList<>();
        animals.add("lion");
        animals.add("monkey");
        animals.add("cat");
        animals.add("dog");
        animals.add("cat");
//        for (int i =0 ;i<animals.size();i++){
//            System.out.println(animals.get(i));
//        }
//        for (String animal :animals){
//            System.out.println(animal);
//        }

        ArrayList<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new Vehicle("Honda ","accord",false,12000));
        vehicles.add(new Vehicle("fiat","punto",true,4000));
        vehicles.add(new Vehicle("Suzuki","splash",false,3000));
//
//        for (Vehicle vehicle :vehicles){
//            System.out.println(vehicle);
//        }
        printElements(animals);
        printElements(vehicles);

    }
    public static void printElements(List somelist){
        for (int i =0;i<somelist.size();i++){
            System.out.println(somelist.get(i));
        }
    }
}
