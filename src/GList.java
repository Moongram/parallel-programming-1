import java.util.ArrayList;
import java.util.List;

public interface GList<T> {
    default GList<T> prepend(T o){
        return new Cons<>(o, this);
    }
    boolean contains(T o);
    int length();
    T head();
    GList<T> tail();
    boolean isEmpty();

    //Create a new empty list of the given parameter type
    @SuppressWarnings("unchecked")
    static <T> GList<T> empty(){
        return (GList<T>) Empty.SINGLETON;
    }

}