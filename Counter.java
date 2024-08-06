import java.util.LinkedList;
import java.util.Queue;

public class Counter {
    private final Queue<Customer> queue = new LinkedList<>();
    private final int id; // Unique ID for each counter
    private int customersProcessed; // Track the number of customers processed by this counter

    public Counter(int id) {
        this.id = id;
    }

    // Method to add a customer to the queue
    public void addCustomerToQueue(Customer customer) {
        queue.offer(customer);
    }

    // Method to get the number of customers in the queue
    public int getQueueLength() {
        return queue.size();
    }

    // Method to process a customer (simulate customer checkout)
    public void processCustomer() {
        if (!queue.isEmpty()) {
            queue.poll(); // Remove the customer from the queue
            customersProcessed++;
        }
    }

    public int getId() {
        return id;
    }

    public int getCustomersProcessed() {
        return customersProcessed;
    }
}
