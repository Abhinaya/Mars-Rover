package main;


public class Plateau {
    private static int xLimit;
    private static int yLimit;

    public Plateau(int xLimit, int yLimit) {
        this.xLimit = xLimit;
        this.yLimit = yLimit;
    }


    public static boolean checkYLimit(int y) {
        if (y>=0 && y<=yLimit)
            return true;
        return false;
    }

    public static boolean checkXLimit(int x) {
        if(x>=0 && x<=xLimit)
            return true;
        return false;
    }
}
