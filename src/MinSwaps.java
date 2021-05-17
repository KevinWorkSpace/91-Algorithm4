public class MinSwaps {

    public int minSwaps(String s) {
        int oddOne = 0;
        int oddZero = 0;
        int evenOne = 0;
        int evenZero = 0;
        for (int i=0; i<s.length(); i++) {
            if (i % 2 == 0) {
                if (s.charAt(i) == '0') oddZero ++;
                else oddOne ++;
            }
            else {
                if (s.charAt(i) == '0') evenZero ++;
                else evenOne ++;
            }
        }
        if (s.length() % 2 == 0) {
            if (oddOne + evenOne != evenZero + oddZero) return -1;
            return Math.min(oddOne, oddZero);
        }
        else {
            if (Math.abs(oddOne + evenOne - evenZero - oddZero) != 1) return -1;
            if (oddOne + evenOne > evenZero + oddZero) return oddZero;
            else return oddOne;
        }
    }
}
