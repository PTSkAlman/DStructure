/**
 * Linked list to be used as a queue. Only needs addLast and removeFirst (enqueue and dequeue) together with
 * size() and isEmpty().
 * Created 2020-02-14
 *
 * @author Magnus Silverdal
 */
public class LinkedList {
    Node first;
    private int listCount;

    /**
     * Constructor to create an empty list.
     */
    public LinkedList() {
        first = null;
        listCount = 0;
    }

    /**
     * Adds a new Node to the list. The Node is always added last. There's a special case when the list is empty
     * (first=null). Make sure to solve that properly...
     * @param newNode
     */
    public void addLast(Node newNode) {
        if (first == null) {
            first = newNode;
            listCount++;
        } else {
            Node last = first;
            while (last.next != null) {
                last = last.next;
                listCount++;
            }
            last.next = newNode;
            listCount++;
        }
    }

    /**
     * Removes and returns the first element of the list. Check if the list is empty and return null in that case
     * (bad practice, should throw an Exception)
     * @return
     */
    public Node removeFirst() {
        first.next = first;
        listCount--;
        return first;
    }

    /**
     * Return the size of the queue. Either implement as a loop calculating at each call (go through the nodes,
     * counting as you go OR use an internal variable (private int size) to continuously keep track of the queue-size).
     * Could be used by isEmpty...
     * @return
     */
    public int size() {
        return listCount;
    }

    /**
     * returns true if the queue is empty.
     * @return
     */
    public boolean isEmpty() {
        return size()==0;
    }
}
