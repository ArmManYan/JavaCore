package static1;

public class Friend {

     static int numOfFriends;
     static String name;

    Friend(String name) {
        this.name = name;
        numOfFriends++;
    }

    static void showFriends() {
        System.out.println("you have " + numOfFriends + " total friends");
    }
}
