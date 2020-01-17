import org.junit.Test;

import static org.junit.Assert.*;

public class ItemTest {

    Item saw = new Item("4343", "Circular Saw", 122.50);
    Item hammer = new Item("9876", "Hammer", 19.75);
    Item level = new Item("1239", "Level", 12.99);
    Item zero = new Item("45466", "testing", -3.14);

    @Test
    public void getTotalPrice() {
        assertEquals(245.0, saw.getTotalPrice(2), 0.0);
        assertEquals(98.75, hammer.getTotalPrice(5), 0.0);
        assertEquals(155.88, level.getTotalPrice(12), 0.0);
        assertEquals(0.0, saw.getTotalPrice(-5), 0.0);

    }

    @Test
    public void toString1() {
        String s = "Item: 4343\nPrice: $122.5\nDescription: Circular Saw";
        String h = "Item: 9876\nPrice: $19.75\nDescription: Hammer";
        String l = "Item: 1239\nPrice: $12.99\nDescription: Level";
        String z = "Item: 45466\nPrice: $0.0\nDescription: testing";

        assertEquals(s, saw.toString());
        assertEquals(h, hammer.toString());
        assertEquals(l, level.toString());
        assertEquals(z, zero.toString());
    }
}