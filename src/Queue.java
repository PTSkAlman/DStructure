/**
 * This should be a queue
 * Created 2020-02-14
 *
 * @author Magnus Silverdal
 */
public class Queue {
    String firstData;
    int size;

    public Queue() {
        size = 0;
    }

    public void enqueue(String text) {
        if (size() == 0) {
            firstData = text;
            size++;
        } else {

        }
    }

    public String dequeue() {
        size--;
        return firstData;
    }

    public boolean isEmpty() {
        return size()==0;
    }

    public int size() {
        return size;
    }
}
