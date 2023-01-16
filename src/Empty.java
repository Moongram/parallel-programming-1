import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class Empty<T> implements GList{
    private Empty(){}

    public static final GList<?> SINGLETON = new Empty<>();


    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public int length() {
        return 0;
    }

    @Override
    public Object head() {
        throw new NoSuchElementException("can't take head() of an empty list");
    }

    @Override
    public GList tail() {
        throw new NoSuchElementException("can't take tail() of an empty list");
    }

    @Override
    public boolean isEmpty() {
        return true;
    }

    public List<T> toRep(){
        return new ArrayList<>();
    }
}