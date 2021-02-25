package ChapterSeven;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AirlineReservation {

    private int flightClass;


    boolean [] airlineSeats = new boolean[10];

    Scanner userInput = new Scanner(System.in);

    public void setFlightClass(int flightClass) {

        System.out.println("Welcome to Don Dozie Airline");

        System.out.println("What class are you flying with us today?\n" +
                " Choose 1 for first class or 2 for Economy");

        flightClass = userInput.nextInt();

        if (flightClass < 1 && flightClass > 2){
            throw new InputMismatchException("You can't choose number below 1 or greater than 2");
        }

        if (flightClass == 1) {
            firstClass();
        } else {
            economyClass();
        }
        this.flightClass = flightClass;
    }

    public int firstClass() {
        return flightClass;
    }

    public int economyClass(){
        return flightClass;
    }
    public int getFlightClass() {
        return flightClass;
    }
}
