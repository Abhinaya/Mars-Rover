package main;


public class Plateau {
    private static Plateau instance;
    private static int xLimit;
    private static int yLimit;

    public Plateau(int xLimit, int yLimit) {
        this.xLimit = xLimit;
        this.yLimit = yLimit;
    }

    public static Plateau getInstance(int xLimit,int yLimit)
	{
		if (instance == null)
			instance = new Plateau(xLimit,yLimit);

		return instance;
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
