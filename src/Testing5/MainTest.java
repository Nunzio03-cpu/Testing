package Testing5;

import org.junit.Test;

import java.time.OffsetDateTime;

import static org.junit.Assert.*;
public class MainTest {
    @Test
    public void testNuovaData(){
        OffsetDateTime data = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        OffsetDateTime nuovaData = data.plusYears(1)
                    .minusMonths(1)
                    .plusDays(7);

        OffsetDateTime expected = OffsetDateTime.parse("2024-02-08T13:00:00Z");
        assertEquals(expected, nuovaData);
    }
}
