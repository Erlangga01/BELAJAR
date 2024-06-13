package lipo;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class lipo {
    public static void main(String[] args) {
       Stack<String> lifo = new Stack<>();
       //menambah elemenet ke stack
       lifo.push("satu");
       lifo.push("dua");
       lifo.push("tiga");
       lifo.push("empat");
       System.out.println(lifo);
       //menghapus element dari stack
       String removedElement = lifo.pop();
        System.out.println("element yang dihapus: " + removedElement);
        System.out.println(lifo);
       //melihat element teratas tanpa menghapus
       String headElement = lifo.peek();
        System.out.println("element teratas: " + headElement);
        System.out.println(lifo);
        
        lifo.pop();
        System.out.println(lifo);
        lifo.pop();
        System.out.println(lifo);
        lifo.pop();
        System.out.println(lifo);
        
        if(lifo.isEmpty())
            lifo.pop();
            
        if(lifo.isEmpty())
            lifo.peek();
        
        Deque<String> lifo2 = new ArrayDeque<>();
        
    }
    
}
