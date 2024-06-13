
package tes.map;

import java.util.HashMap;

public class testmap {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1,"one");
        map.put(2,"two");
        map.put(3,"three");
        map.put(4,"four");
        
        System.out.println(map.keySet()); //key saja
        System.out.println(map.values()); //value saja
        System.out.println(map.entrySet()); //key dan value
        
        map.put(3,"tiga");
        System.out.println(map.entrySet());
        
        map.remove(3);
        System.out.println(map.entrySet());
        System.out.println(map.get(4));
    }
    
}
