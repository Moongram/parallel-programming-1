import java.util.List;

public class Main {
    public static void main(String[] args) {
        GList<Integer> numbers = GList.<Integer>empty().prepend(1).prepend(2).prepend(3);
        GList<Integer> x = GList.evens(numbers);
        System.out.println(x.toRep());
        GList<Integer> numbers2 = GList.<Integer>empty().prepend(5).prepend(6).prepend(7).prepend(8);
        GList<Integer> y = GList.evens(numbers2);
        System.out.println(y.toRep());
    }}