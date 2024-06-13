package test.list;

import java.util.HashSet;

public class TestSet {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        System.out.println(set.add("satu"));
        set.add("dua");
        set.add("tiga");
        System.out.println(set.add("satu"));;
        set.add("tiga");
        System.out.println(set.add("satu"));
        System.out.println(set);
        System.out.println(set.size());
    } 
}
