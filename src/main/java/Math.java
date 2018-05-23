public class Math {

    public static int sum(int a, int b) {
        return a+b;
    }

    public static int sumPositive(int a, int b) {
        if (a<0) a=0;
        if (b<0) b=0;
        return a+b;
    }

}
