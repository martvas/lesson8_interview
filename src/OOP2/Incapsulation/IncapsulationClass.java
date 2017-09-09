package OOP2.Incapsulation;

public class IncapsulationClass {
    private int a;
    private int b;
    private int c;

    public IncapsulationClass(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    private int sumAB() {
        return a + b;
    }

    private int sumAC(){
        return a + c;
    }

    private int sumBC(){
        return b + c;
    }

    public int sumOfPrivateSum(){
        return sumAB() + sumAC() + sumBC();
    }
}
