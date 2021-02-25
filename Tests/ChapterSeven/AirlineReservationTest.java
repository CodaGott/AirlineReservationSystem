package ChapterSeven;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AirlineReservationTest {
    AirlineReservation reservation;

    @BeforeEach
    void setUp() {
        reservation = new AirlineReservation();
    }

    @AfterEach
    void tearDown() {
    }
    @Test
    void aPassengerCanChooseFlightClass(){
        reservation.setFlightClass(1);
        assertEquals(reservation.firstClass(), reservation.getFlightClass());
    }


}