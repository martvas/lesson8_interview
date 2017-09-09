package Osnovy1;

public class ContinueTest {
    public static void main(String[] args) {
        for (int i = 0; i < 10 ; i++) {
            if (i == 2 || i == 3) continue;
            System.out.println(i);
        }
    }
}
