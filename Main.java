import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the number of cash counters from the user
        System.out.println("Enter the number of cash counters:");
        int numCounters = scanner.nextInt();

        // Get the number of customers
        System.out.println("Enter the number of customers:");
        int numCustomers = scanner.nextInt();

        // Get the service time per customer
        System.out.println("Enter the service time per customer (in minutes):");
        int serviceTime = scanner.nextInt();

        // Get the customer arrival rate
        System.out.println("Enter the customer arrival rate (customers per minute):");
        int arrivalRate = scanner.nextInt();

        // After capturing user inputs in Main.java
        boolean useShortestQueue = true; // This could be set based on user input for strategy choice
        Simulation simulation = new Simulation(numCounters, serviceTime, arrivalRate, useShortestQueue, numCustomers);
        simulation.start();

        // Close the scanner
        scanner.close();

        // Placeholder for simulation start
        System.out.println("Starting simulation with the following settings:");
        System.out.println("Number of cash counters: " + numCounters);
        System.out.println("Number of customers: " + numCustomers);
        System.out.println("Service time per customer: " + serviceTime + " minutes");
        System.out.println("Customer arrival rate: " + arrivalRate + " customers per minute");

        // TODO: Implement the simulation logic based on the inputs
    }
}
