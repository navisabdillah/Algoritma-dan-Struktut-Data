/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doublelinkedlists;

/**
 *
 * @author ASUS
 */
/**...4 lines */
public class DoubleLinkedListsMain {
    public static void main(String[] args) throws Exception  {
         DoubleLinkedLists dl1 = new  DoubleLinkedLists();
         dl1.print();
         System.out.println("size : " + dl1.size());
         System.out.println("=========================================");
         dl1.addFirst(3);
         dl1.addLast(4);
         dl1.addFirst(7);
         dl1.print();
         System.out.println("size : " +dl1.size());
         System.out.println("=========================================");
         dl1.add(40, 1);
         dl1.print();
         System.out.println("Size : " + dl1.size());
         System.out.println("=========================================");
         dl1.clear();
         dl1.print();
         System.out.println("Size : " + dl1.size());
         System.out.println();
         dl1.addLast(50);
         dl1.addLast(40);
         dl1.addLast(10);
         dl1.addLast(20);
         System.out.println("Size : " + dl1.size());
         System.out.println("=========================================");
         dl1.removeFirst();
         dl1.print();
         System.out.println("Size : " +dl1.size());
         System.out.println("=========================================");
         dl1.remove(1);
         dl1.print();
         System.out.println("Size : " + dl1.size());
         
         System.out.println();
         dl1.print();
         System.out.println("Size : " + dl1.size());
         System.out.println("=========================================");
         dl1.addFirst(3);
         dl1.addLast(4);
         dl1.addFirst(7);
         dl1.print();
         System.out.println("Size : " + dl1.size());
         System.out.println("=========================================");
         dl1.add(40, 1);
         dl1.print();
         System.out.println("Size : " +dl1.size());
        System.out.println("=========================");
        System.out.println("Data awal pada Linked Lists adalah: " +dl1.getFirst());
        System.out.println("Data akhir pada Linked Lists adalah: " +dl1.getLast());
        System.out.println("Data indeks ke-1 pada Linked Lists adalah: " +dl1.get(1));
        
    }
}
