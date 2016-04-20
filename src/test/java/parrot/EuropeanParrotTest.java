package parrot;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class EuropeanParrotTest {

    @Test
    public void should_have_speed_equal_to_base_speed() {
        // given
        Parrot parrot = new EuropeanParrot();

        // when
        double speed = parrot.computeSpeed();

        // then
        assertEquals(speed, 12.0);
    }
}
