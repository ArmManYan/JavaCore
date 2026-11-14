package super1;

public class Person {
    String firstN;
    String lastN;

    Person(String lastN, String firstN) {
        this.firstN = firstN;
        this.lastN = lastN;
    }

    void showName() {
        System.out.println(this.firstN + " " + lastN);
        
    }
}
