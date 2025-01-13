package Testing1;

import org.junit.Test;

import static org.junit.Assert.*;

public class RettangoloTest {

    @Test
    public void calcolaAreaTest() {
        Rettangolo rettangolo = new Rettangolo();
        assertEquals(20, rettangolo.calcolaArea(4.0, 5.0),0.0);
    }
}