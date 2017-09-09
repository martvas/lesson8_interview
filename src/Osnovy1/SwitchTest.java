package Osnovy1;

public class SwitchTest {
    public static void main(String[] args) {

        double d = Math.random()*4;
        int i = (int)d;
        System.out.println("True i: " + i);
        switch (i){
            case 0:
                System.out.println("i = 0");
                break;
            case 1:
                System.out.println("i = 2");
                break;
            case 2:
                System.out.println("i = 2");
                break;
            case 3:
                System.out.println("i = 3");
                break;
        }
    }
}
