import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;



class SalesCommissionTest {

    SalesCommission salesCommission;

    @BeforeEach
    void setUp() {
        salesCommission = new SalesCommission();

    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void getSalesCommissionDistribution(){

        int[] salesAmount = {4000, 5000, 500, 100000, 5500};
        int [] frequency = new int[9];

        SalesCommission.getSalesCommissionDistribution(salesAmount,frequency);
        assertEquals(2, frequency[4]);
    }
}