package OOP2.StaticBlockTest;

public class Sasha {
    private static String hairColor;
    private static boolean beauty;
    static {
        hairColor = "Blond";
        beauty = true;
    }

    public static String getHairColor() {
        return hairColor;
    }

    public boolean isBeauty() {
        return beauty;
    }
}
