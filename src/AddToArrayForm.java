import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AddToArrayForm {

    public List<Integer> addToArrayForm(int[] A, int K) {
        List<Integer> res = new ArrayList<>();
        int index = A.length - 1;
        int add = 0;
        while (index >= 0 || K > 0 || add > 0) {
            int a = 0;
            if (index >= 0) a = A[index];
            int b = K % 10;
            int tmp = (a + b + add) % 10;
            add = (a + b + add) / 10;
            res.add(tmp);
            K /= 10;
            index --;
        }
        Collections.reverse(res);
        return res;
    }
}
