public class Singleton {
    private static Singleton s = new Singleton();
    public int test = 0;
    public static Singleton getInstance(){
        return s;
    }

    private Singleton(){
        test++;
    }
}
