import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Random;

public class QueueManager {
    private final List<Counter> counters = new ArrayList<>();
    private final Random random = new Random();

    public QueueManager(int numCounters) {
        for (int i = 0; i < numCounters; i++) {
            counters.add(new Counter(i));
        }
    }

    // Assigns a customer to a counter based on the chosen strategy
public void assignCustomerToCounter(Customer customer, boolean useShortestQueue) {
    if (useShortestQueue) {
        Counter shortest = counters.stream()
                                   .min((c1, c2) -> c1.getQueueLength() - c2.getQueueLength())
                                   .orElseThrow(() -> new NoSuchElementException("No counters available"));
        shortest.addCustomerToQueue(customer);
    } else {
        int randomIndex = random.nextInt(counters.size());
        counters.get(randomIndex).addCustomerToQueue(customer);
    }
}


    public List<Counter> getCounters() {
        return counters;
    }
}
