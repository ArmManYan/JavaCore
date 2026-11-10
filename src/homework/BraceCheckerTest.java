package homework;

public class BraceCheckerTest {
    static void main(String[] args) {
        BraceChecker checker = new BraceChecker();

        System.out.println(checker.check("{}"));
        System.out.println(checker.check("({[]})"));
        System.out.println(checker.check("{[()]}"));
        System.out.println(checker.check("(]"));
        System.out.println(checker.check("(()"));
        System.out.println(checker.check("())"));
        System.out.println(checker.check(""));
        System.out.println(checker.check("a(b)c"));
    }
}
