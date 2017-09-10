package Collections.ArrayOrLinkedList;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayOrLinkedList {

    public static void main(String[] args) {
        Timer timer = new Timer();

        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        timer.start();
        for (int i = 0; i < 100_000; i++) {
            Integer rand = (int) Math.random() * 1000;
            linkedList.add(rand);
        }
        System.out.print("Добавляем в LinkedList 100 000 значeний: ");
        timer.stopAndPrint();

        timer.start();
        for (int i = 0; i < 100_000; i++) {
            Integer rand = (int) Math.random() * 1000;
            arrayList.add(rand);
        }
        System.out.print("Добавляем в Аррайлист 100 000 значeний: ");
        timer.stopAndPrint();

        System.out.println();

        timer.start();
        for (int i = 0; i < 100_000; i++) {
            arrayList.get(i);
        }
        System.out.print("Аррайлист get 100 000 значений: ");
        timer.stopAndPrint();

        timer.start();
        for (int i = 0; i < 100_000; i++) {
            linkedList.get(i);
        }
        System.out.print("Linkedlist get 100 000 значений: ");
        timer.stopAndPrint();





    }
}
