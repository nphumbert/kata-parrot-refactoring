package parrot;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class NorwegianParrotTest {

    @Test
    public void should_have_base_speed_when_not_nailed() {
        // given
        Parrot parrot = new NorwegianParrot(0, true);

        // when
        double speed = parrot.computeSpeed();

        // then
        assertEquals(speed, 0.0);
    }

    @Test
    public void should_have_speed_proportional_to_voltage_when_not_nailed() {
        // given
        Parrot parrot = new NorwegianParrot(1.5, false);

        // when
        double speed = parrot.computeSpeed();

        // then
        assertEquals(speed, 18.0);
    }

    @Test
    public void should_have_maximum_speed_when_high_voltage() {
        // given
        Parrot parrot = new NorwegianParrot(4, false);

        // when
        double speed = parrot.computeSpeed();

        // then
        assertEquals(speed, 24.0);
    }

}