import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArraysTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {

            int[] studentScores;
            int[] scores = {25, 3, 12, 21, 19};
            int[] testScores = new int[4];


            testScores[0] = 17;
            testScores[1] = 25;
            testScores[2] = 7;
            testScores[3] = 23;


            String[] names = {"Ibukun", "Onyi", "Akokites"};

            for (int i = 0; i < scores.length; i++) {
                System.out.println(names[i]);
            }
        }

    }
