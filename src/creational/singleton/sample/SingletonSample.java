package creational.singleton.sample;

/**
 * @author Nazerpanahi
 * This class is a sample of the singleton model.
 * It is not thread-safe.
 * It has only one constructor and also only on method.
 * The constructor is private.
 * Because of the lazy loading the single object instantiate in the getInstance method.
 */
public class SingletonSample {
    // single object
    private Object o=null;

    private SingletonSample(){
    }

    /**
     * @return the single object
     */
    public Object getInstance(){
        // because of the lazy loading, the object instantiate here when this method call by user.
        if (o == null){
            o=new Object();
        }
        return o;
    }
}
