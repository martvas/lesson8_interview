package Osnovy1;

public class DataTypes {
    public static void main(String[] args) {
        byte bit = 0; //-128, 127
        int cnt = 0;
        for (int i = 0; i < 255; i++) {
            System.out.print((bit += 1)+ " ");
            cnt++;
            if (cnt == 30) {
                System.out.println();
                cnt = 0;
            }
        }


        System.out.println();
        byte overByte = (byte) 258;
        System.out.println(overByte);
        System.out.println();

        char charTest = (char) 2764;
        System.out.println(charTest);

        int chislo = 10;
        methodObertka(chislo);

    }

    public static void methodObertka(Integer i){
        System.out.println(i*10);
    }


}
