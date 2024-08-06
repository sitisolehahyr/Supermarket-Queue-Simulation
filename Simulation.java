import java.util.ArrayList;
import java.util.List;

public class Simulation {
    private QueueManager queueManager;
    private int serviceTime; // in minutes
    private int arrivalRate; // customers per minute
    private boolean useShortestQueue;
    private int numCustomers;


    public Simulation(int numCounters, int serviceTime, int arrivalRate, boolean useShortestQueue, int numCustomers) {
        this.queueManager = new QueueManager(numCounters);
        this.serviceTime = serviceTime;
        this.arrivalRate = arrivalRate;
        this.useShortestQueue = useShortestQueue;
        this.numCustomers = numCustomers; 
    }
    

    // Placeholder for starting the simulation
    public void start() {
        int customerId = 1;
        int totalCustomers = 0;
        List<Integer> waitTimes = new ArrayList<>();

        // Assuming the simulation runs for a fixed duration (e.g., 120 minutes)
        int simulationDuration = 120;

        for (int currentTime = 0; currentTime < simulationDuration; currentTime++) {
            // Simulate customer arrivals based on the arrival rate
            for (int i = 0; i < arrivalRate; i++) {
                Customer customer = new Customer(customerId++);
                queueManager.assignCustomerToCounter(customer, useShortestQueue);
                totalCustomers++;
            }

            // Process customers at each counter
            for (Counter counter : queueManager.getCounters()) {
                if (currentTime % serviceTime == 0) { // Simulate service time
                    counter.processCustomer();
                }
                // Update wait times for calculating average later
                waitTimes.add(counter.getQueueLength() * serviceTime);
            }

            displayStatus(currentTime);
        }

        // Calculate and display the results
        displayResults(totalCustomers, waitTimes);
    }

    private void displayResults(int totalCustomers, List<Integer> waitTimes) {
        System.out.println("Simulation Ended. Results:");
        System.out.println("Total Customers: " + totalCustomers);
        int totalWaitTime = waitTimes.stream().mapToInt(Integer::intValue).sum();
        double averageWaitTime = totalWaitTime / (double) totalCustomers;
        System.out.println("Average Waiting Time: " + averageWaitTime + " minutes");

        // Display the number of customers processed by each counter
        for (Counter counter : queueManager.getCounters()) {
            // This part needs additional logic to track the number of customers processed per counter,
            // which could be implemented by extending the Counter class functionality.
        }
    }

    private void displayStatus(int currentTime) {
        System.out.println("Simulation Time: " + currentTime + " minutes");
        for (Counter counter : queueManager.getCounters()) {
            // Assuming each counter can serve one customer at a time and others are waiting.
            int beingServed = counter.getQueueLength() > 0 ? 1 : 0; // 1 customer being served if queue is not empty.
            int waiting = Math.max(counter.getQueueLength() - beingServed, 0); // Waiting customers are total in queue minus the one being served (if any).

            System.out.println("Counter " + counter.getId() + ": " + beingServed + " being served, " + waiting + " waiting");
        }
    }
}
