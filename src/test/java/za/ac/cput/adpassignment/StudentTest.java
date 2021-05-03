package za.ac.cput.adpassignment;

//Ratidzai Makondo 218187289



import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {
    private Student stat1;
    private Student stat2;
    private Student stat4;

    @BeforeEach
    void setUp() {
        stat1 = new Student();
        stat2 = new Student();
        stat1 = stat4;

    }


    @Test
    void testIdentity() {
        assertEquals(stat1,stat1);
    }

    @Test
    void testEquality() {
        assertEquals(stat1,stat1);
    }

    @Test
    void testFailing(){
     fail("It will fail");
    }

    @Test
    void testTimeout() {
        new Student();
    }
    @Test
    @Disabled
    void testDisable() {
        fail("it wont fail");
    }
}
