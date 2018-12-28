package SingletonPattern;

public class Singleton_Holder {
    private Singleton_Holder(){}

    private static class SingletonHolder {
            private static final Singleton_Holder INSTANCE = new Singleton_Holder();
    }

    public static Singleton_Holder getInstance() {
            return SingletonHolder.INSTANCE;
    }
}