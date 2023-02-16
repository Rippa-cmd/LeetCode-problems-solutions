package easy;

public class ValidParentheses {
    public static void main(String[] args) {
        String s = "([([]({}))})";
        char[] leftBracket = {'(', '[', '{'};
        char[] rightBracket = {')', ']', '}'};

        StringBuilder stringBuilder = new StringBuilder(s);

        if ((s.length() < 2) || (stringBuilder.length() % 2 != 0))
            System.out.println("false");
        //return false; // TODO
        for (int i = 0; i < stringBuilder.length(); i++) {
            char brace = stringBuilder.charAt(i);
            for (int bracketCounter = 0; bracketCounter < 3; bracketCounter++) {
                if (brace == rightBracket[bracketCounter]) {
                    if (i > 0) {
                        if (stringBuilder.charAt(i - 1) == leftBracket[bracketCounter]) {
                            stringBuilder.deleteCharAt(i - 1).deleteCharAt(i - 1);
                            i -= 2;
                            break;
                        }
                    }
                    System.out.println("false");
                    //return false; // TODO

                }
            }
            //stringBuilder.charAt(i)
        }
        if (stringBuilder.length() == 0)
            System.out.println("true");
        else
            System.out.println("false");
        //return true; // TODO
    }
}
