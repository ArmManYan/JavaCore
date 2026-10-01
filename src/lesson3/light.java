package lesson3;

public class light {
    static void main(String[] args) {
        int lightspeed;
        long days;
        long seconds;
        long distance;

        lightspeed = 186000;

        days = 1000;

        seconds = days * 24 * 60 * 60;

        distance = lightspeed * seconds;

        System.out.println("for " +  days);
        System.out.println(" days, the light will travel about ");
        System.out.println(distance + " mile. ");
    }
}
