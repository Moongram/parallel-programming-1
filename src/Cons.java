public class Cons<T> implements GList<T> {
    private final T headVal;
    private final GList<T> tailVal;
    public Cons(T value, GList<T> tailList){
        this.headVal = value;
        this.tailVal = tailList;
    }


    @Override
    public boolean contains(T o) {
        if (this.isEmpty()){
            return false;
        }
        else{
            if(this.headVal.equals(o)){
                return true;
            }
            return this.tailVal.contains(o);
        }
    }

    @Override
    public int length() {
        return 1 + tailVal.length();
    }

    @Override
    public T head() {
        return this.headVal;
    }

    @Override
    public GList<T> tail() {
        return this.tailVal;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }
}
