package tes;

import java.util.ArrayList;
import java.util.HashSet;

public class TestSet {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("satu");
        System.out.println(set.add("satu"));
        set.add("dua");
        set.add("tiga");
        System.out.println(set.add("satu"));
        set.add("tiga");
        System.out.println(set.add("satu"));
        System.out.println(set);
        System.out.println(set.size());
        
//        ArrayList<int> list = new ArrayList<>()
        ArrayList<Integer> list = new ArrayList<>();
        list.add(100);
        list.add(200);
        list.add(50);
        list.add(60);
        list.add(300);
        list.add(150);
        list.add(200);
        list.add(100);
        System.out.println(list);
        
        HashSet<Integer> set2 = new HashSet<>(list);
        System.out.println(set2);
        set2.remove(200);
        set2.remove(50);
        set2.remove(50);
        System.out.println(set2);       
    } 
}
