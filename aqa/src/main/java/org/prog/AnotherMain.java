package org.prog;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class AnotherMain {

    public static void main(String... args) {
//        ArrayList<String> aList = new ArrayList<>();
//        ArrayList<String> bList = new ArrayList<>();
//        aList.add("1");//0
//        aList.add("2");//1
//        aList.add("3");//2
//        aList.add("4");//3
//
//        bList.add("5");//4
//        bList.add("6");
//        bList.add("aaaaaa");
//
//        System.out.println(aList.size());
//
//        aList.addAll(bList);
//        System.out.println(aList.size());

//        BMW blueCar = new BMW();
//        blueCar.color = "blue";
//        BMW redCar = new BMW();
//        redCar.color = "red";
//
//        List<BMW> bmwListOne = new ArrayList<>();
//        List<BMW> bmwListTwo = new ArrayList<>();
//
//        bmwListOne.add(blueCar);
//        bmwListTwo.add(redCar);
//
//        System.out.println(bmwListOne.get(0).color);
//        System.out.println(bmwListTwo.get(0).color);
//
//        bmwListTwo.get(0).color = "green";
//
//        System.out.println(bmwListOne.get(0).color);
//        System.out.println(bmwListTwo.get(0).color);
//
//        bmwListOne.addAll(bmwListTwo);// 2 cars in list One
//        bmwListOne.get(1).color = "yellow";
//
//        System.out.println(bmwListOne.get(0).color);
//        System.out.println(bmwListOne.get(1).color);
//        System.out.println(bmwListTwo.get(0).color);

//        LinkedList<String> linkedList;
//        ArrayList<String> arrayList;

        HashMap<String, String> map = new HashMap<>();
        map.put(null, "valueA");
        map.put("surName", "valueA");
        map.put("secondName", "valueA");
        map.put("firstName", "valueB");
        System.out.println(map.get("firstName"));
        map.put("firstName", "valueC");
        map.put(null, "NullKey");
        System.out.println(map.get("firstName"));
        System.out.println(map.get(null));

        ArrayList<String> aList = new ArrayList<>();
        aList.add("a");
        aList.add("a");
        aList.add("a");
        aList.add("a");
        aList.add("a");
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("a");
        hashSet.add("a");
        hashSet.add("a");
        hashSet.add("a");
        hashSet.add("a");
        System.out.println(hashSet.size());
        System.out.println(aList.size());
    }
}
