public class Main {

    public static void main(String[] args) throws Exception {
        for (Token token: Lexer.getTokenList("a = 0" +
                "value = 7" +
                "c = b * 2 - 1" +
                "d = (a + b) /15.5")) {
            System.out.println(token);
        }
    }

}
