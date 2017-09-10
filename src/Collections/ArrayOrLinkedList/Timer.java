package Collections.ArrayOrLinkedList;

public class Timer {
    long time;

    void start(){
        time = System.currentTimeMillis();
    }

    void stopAndPrint() {
        System.out.println((System.currentTimeMillis() - time) + " miliseconds");
    }
}
