package SingletonPattern;

public class Singleton_Eager_init {
    private static Singleton_Eager_init instance = new Singleton_Eager_init();

    private Singleton_Eager_init(){}

    public static Singleton_Eager_init getInstance(){
        return instance;
    }
}