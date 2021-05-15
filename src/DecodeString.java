import java.util.Stack;

public class DecodeString {

    public String decodeString(String s) {
        Stack<Integer> integerStack = new Stack<>();
        Stack<StringBuffer> bufferStack = new Stack<>();
        int tmp = 0;
        StringBuffer buffer = new StringBuffer();
        for (int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isDigit(c)) {
                tmp = tmp * 10 + (c - '0');
            }
            else if (Character.isLetter(c)) {
                buffer.append(c);
            }
            else if (c == '[') {
                integerStack.add(tmp);
                bufferStack.add(buffer);
                buffer = new StringBuffer();
                tmp = 0;
            }
            else if (c == ']') {
                StringBuffer b = bufferStack.pop();
                int count = integerStack.pop();
                for (int j=0; j<count; j++) {
                    b.append(buffer);
                }
                buffer = b;
            }
        }
        return buffer.toString();
    }

    public static void main(String[] args) {
        String s = "3[a2[c]]";
        DecodeString decodeString = new DecodeString();
        System.out.println(decodeString.decodeString(s));
    }

}
