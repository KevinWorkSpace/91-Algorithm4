public class ShortestToChar {

    public int[] shortestToChar(String s, char c) {
        int[] res = new int[s.length()];
        int index = Integer.MIN_VALUE / 2;
        for (int i=0; i<res.length; i++) {
            if (s.charAt(i) == c) {
                index = i;
            }
            else res[i] = i - index;
        }
        index = Integer.MAX_VALUE / 2;
        for (int i=res.length-1; i>=0; i--) {
            if (s.charAt(i) == c) {
                index = i;
            }
            else res[i] = Math.min(index - i, res[i]);
        }
        return res;
    }
}
