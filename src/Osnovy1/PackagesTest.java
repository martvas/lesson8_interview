package Osnovy1;

//import konkretnogo klassa
import java.util.Scanner;

//LEgche importitj vesj paket s pomoshju *
import java.lang.*;
//No pri importe paketa importirujutsja toljko klassy iz etogo paketa. Klassy iz podpaketa ne importirujutsja

public class PackagesTest {
    //Chtoby ispoljzovatj takoe napisanie nuzhno importirovatj Paket
    Scanner sc = new Scanner(System.in);


    //Mozhno pisatj i takim obrazom no eto dolgo, legche cherez import
    static java.math.BigDecimal bigDecimal = new java.math.BigDecimal(5000);

    public static void main(String[] args) {
        System.out.println(bigDecimal);

    }
}
