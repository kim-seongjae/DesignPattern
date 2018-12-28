package SingletonPattern;

public class Singleton {
    private static Singleton instance;

    private Singleton(){}

    public static Singleton getInstance(){
        if( instance == null ){ // (1)
            instance = new Singleton(); // (2)
        }
        return instance;
    }
    // But, 문제가 많음 -> 멀티쓰레드시 여러개 켜질 위험이 있음
}