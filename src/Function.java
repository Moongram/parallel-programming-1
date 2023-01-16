import java.util.ArrayList;
import java.util.List;

public class Function {
    public static List<Integer> evens(GList<Integer> gList){
        List<Integer> result = new ArrayList<>();
        if (!gList.isEmpty()) {
            if (gList.head() % 2 == 0) {
                result.add(gList.head());
            }
            result.addAll(evens(gList.tail()));
        }
        return result;
    }
}
