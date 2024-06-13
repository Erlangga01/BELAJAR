package tes.pipo;

import java.util.LinkedList;
//import java.util.Queue;

public class TestFIFO {
    public static void main(String[] args) {
        //Queue<Integer> fifo = new LinkedList<>();
        LinkedList<Integer> fifo = new LinkedList<>();
    //menambahkan element ke queue/antriam:
    fifo.offer(1);
    fifo.offer(2);
    fifo.offer(3);
    fifo.offer(4);
        System.out.println(fifo);
        //menghapus element dari antrian/dequeue
    int removedElement = fifo.poll();
        System.out.println("element yang dihapus : " + removedElement);
        System.out.println(fifo);
        //melihat element terdepan tanpa menghapus
    int headElement = fifo.peek();
        System.out.println("element pertama: " + headElement);
        System.out.println(fifo);
    }
    
}
