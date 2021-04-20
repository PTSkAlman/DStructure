import org.junit.Test;

import static org.junit.Assert.*;

/**
 * This is a class
 * Created 2020-02-19
 *
 * @author Magnus Silverdal
 */
public class LinkedListTest {
    @Test
    public void shouldBeAbleToCreateLinkedList() {
        new LinkedList();
    }

    @Test
    public void createdLinkedListShouldBeEmpty() {
        LinkedList l = new LinkedList();
        assertEquals(true, l.isEmpty());
    }

    @Test
    public void createdLinkedListShouldHaveSizeZero() {
        LinkedList l = new LinkedList();
        assertEquals(0, l.size());
    }

    @Test
    public void addLastShouldWork() {
        LinkedList l = new LinkedList();
        l.addLast(new Node("Test",null));
    }

    @Test
    public void addLastShouldWorkProperly() {
        LinkedList l = new LinkedList();
        l.addLast(new Node("Test",null));
        l.addLast(new Node("Another test",null));
        assertEquals("Test", l.first.getData());
    }

    @Test
    public void addLastShouldReallyWorkProperly() {
        LinkedList l = new LinkedList();
        l.addLast(new Node("Test",null));
        l.addLast(new Node("Another test",null));
        assertEquals("Another test", l.first.getNext().getData());
    }

    @Test
    public void addLastShouldIncreaseSize() {
        LinkedList l = new LinkedList();
        l.addLast(new Node("Test",null));
        l.addLast(new Node("Another test",null));
        assertEquals(2,l.size());
    }

    @Test
    public void removeFirstShouldWork() {
        LinkedList l = new LinkedList();
        l.addLast(new Node("Test",null));
        l.removeFirst();
    }

    @Test
    public void removeFirstShouldDecreaseSize() {
        LinkedList l = new LinkedList();
        l.addLast(new Node("Test",null));
        l.addLast(new Node("Another Test",null));
        l.removeFirst();
        assertEquals(1,l.size());
    }

    @Test
    public void removeFirstShouldReturnTheFirstInTheList() {
        LinkedList l = new LinkedList();
        l.addLast(new Node("Test",null));
        l.addLast(new Node("Another Test",null));
        assertEquals("Test",l.removeFirst().getData());
    }
}
