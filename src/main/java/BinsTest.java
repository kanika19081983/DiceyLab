import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BinsTest {
    @Test
    public void testIncrementBin() {
        Bins bins = new Bins (2, 12);
        bins.incrementBin(10);
        assertEquals(1, bins.getBin(10));
    }







}