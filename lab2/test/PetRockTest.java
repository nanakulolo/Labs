import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

public class PetRockTest {
    private PetRock rocky = new PetRock("Rocky");
    @Test
    public void getName() {
        assertEquals("Rocky", rocky.getName());
    }

    @Test
    public void isHappy() {
        assertFalse(rocky.isHappy());
    }

    @Test
    public void playWithRock() {
        rocky.playWithRock();
        assertTrue(rocky.isHappy());
    }

    @Test (expected = IllegalStateException.class)
    public void testForException() {
        assertEquals("I am Happy!", rocky.getHappyMessage());
    }

    @Test
    public void testForNull() {
        assertNull(rocky.getObj());
    }

    @Test
    public void testForToString() {
        assertEquals("PetRock{name='Rocky', happy=false}",rocky.toString());
    }
}