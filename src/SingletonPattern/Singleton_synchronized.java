package SingletonPattern;

	public class Singleton_synchronized {
	    private static Singleton_synchronized instance;

	    private Singleton_synchronized(){}

	    public static synchronized Singleton_synchronized getInstance(){
	        if( instance == null ){
	            instance = new Singleton_synchronized();
	        }
	        return instance;
	    }
	}