import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by Şeyma Yılmaz on 4.6.2017.
 */
public class Main {

    public static void main(String[] args) {

        Queue queue = new LinkedList();

        queue.add("Şeyma");
        queue.add("Burak");
        queue.add("Berkan");

        String nextElement = (String) queue.peek();
        nextElement = (String) queue.poll();
    }
}
