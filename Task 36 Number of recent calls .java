import java.util.*;

class RecentCounter {

    Queue<Integer> q;

    public RecentCounter() {
        q = new LinkedList<>();
    }

    public int ping(int t) {

        // Add the current time
        q.offer(t);

        // Remove requests older than 3000 milliseconds
        while (q.peek() < t - 3000) {
            q.poll();
        }

        // Return number of requests in the last 3000 ms
        return q.size();
    }
}