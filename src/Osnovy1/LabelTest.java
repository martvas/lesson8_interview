package Osnovy1;

public class LabelTest {
    private static final int SIZE = 7;

    public static void main(String[] args) {

        int count = 0;

        startCycle:
        for (int i = 1; i < 7; i++) {
            System.out.println("hREN" + i);
            for (int j = 0; j < 7; j++) {
                count++;
                if (count == 25) break;
                if (count == 18) continue;
                if (count == 8) continue startCycle;
                System.out.print(count + " ");
            }
        }

    }
}
