package com.mycompany.belajar;

import java.util.ArrayList;

public class TestList {
    public static void main(String [] args){
    ArrayList list = new ArrayList();
    list.add("Erlangga");
    list.add("rendika");
    list.add("arin");
    System.out.println(list);
    
    for (Object element : list){
        System.out.println(element);
        }
    list.add(1,"fidelis");
        System.out.println("list");
        
    list.add("Erlangga");
        System.out.println(list);
        
    list.remove(0);
        System.out.println(list);
        
    System.out.println(list.remove("rendika"));
        System.out.println(list);
        
    System.out.println(list.remove("bobby"));
        System.out.println(list);
        System.out.println(list.isEmpty());
        System.out.println(list.size()); 
        list.clear();
        System.out.println(list.isEmpty());
        System.out.println(list.size());
        list.add(new Object());
        
    String [] daftarNama;
    
    //generic
    ArrayList<String> list2 = new ArrayList<>();
//       list2.add(new Object());
//       list2.add(new Person());
        list2.add("satu");
        list2.add("dua");
        System.out.println(list2);
    }

}