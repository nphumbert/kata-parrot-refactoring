package parrot;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class AfricanParrotTest {

    @Test
    public void should_have_speed_reduced_by_the_load_factor_when_one_coconut() {
        // given
        Parrot parrot = new AfricanParrot(1);

        // when
        double speed = parrot.getSpeed();

        // then
        assertEquals(speed, 3.0);
    }

    @Test
    public void should_have_null_speed_when_too_much_loaded() {
        // given
        Parrot parrot = new AfricanParrot(2);

        // when
        double speed = parrot.getSpeed();

        // then
        assertEquals(speed, 0.0);
    }

    @Test
    public void should_have_base_speed_when_no_coconut() {
        // given
        Parrot parrot = new AfricanParrot(0);

        // when
        double speed = parrot.getSpeed();

        // then
        assertEquals(speed, 12.0);
    }

}