# Supermarket-Queue-Simulation
The Supermarket Queue Simulation project aims to address the challenges faced by large supermarkets in efficiently managing customer queues at cash counters. The importance of this simulation lies in providing supermarkets with a tool to optimize their operational processes, reduce customer waiting times, and enhance overall customer satisfaction. 
# Introduction
The Supermarket Queue Simulation project aims to address the challenges faced by large supermarkets in efficiently managing customer queues at cash counters. The importance of this simulation lies in providing supermarkets with a tool to optimize their operational processes, reduce customer waiting times, and enhance overall customer satisfaction. In the context of service-oriented industries like supermarkets, long queues can lead to customer dissatisfaction, affecting the overall shopping experience. This project builds upon prior work in queue management systems and simulation techniques, leveraging Java programming to create a dynamic and interactive simulation.
To tackle this problem, the simulation considers essential factors such as the number of cash counters, the rate of customer arrivals, and the constant service time each customer requires at the counter. The project allows users to input these parameters interactively, providing flexibility to adapt to varying scenarios. Additionally, the simulation offers two queue assignment strategies: random queueing and queueing at the shortest queue. This provides a comparative analysis of different approaches to queue management, catering to the diverse needs of supermarkets.
The real-time display of detailed status during the simulation runtime is a key feature, allowing users to monitor the number of customers waiting, being served, and other relevant information. This real-time feedback is crucial for understanding the dynamics of the supermarket queues and assessing the effectiveness of the chosen queue assignment strategy.
At the conclusion of the simulation, the program generates comprehensive outputs, including the total number of customers processed by each counter and the average waiting time for customers at each counter. These results provide valuable insights into the performance of individual cash counters and contribute to data-driven decision-making for supermarket management. In summary, the Supermarket Queue Simulation project not only addresses a practical problem faced by supermarkets but also contributes to the existing body of knowledge in queue management systems. The use of Java, interactive user inputs, and real-time feedback make this simulation a versatile and impactful tool for optimizing supermarket operations.
# System Architecture Overview
In the following section, we provide detailed explanations for each class within the simulation system. Each class is meticulously designed to fulfill specific roles, contributing to the seamless operation of the simulation. Together, these classes create a robust framework that captures the intricacies of a real-world service environment.
1. Counter.java:
● Purpose: Represents an individual cash counter in the simulation.
● Key Responsibilities: Maintains a queue of customers waiting to be served,
provides methods to add a customer to the queue, get the queue length, and
simulate processing a customer.
2. Customer.java:
● Purpose: The Customer class plays a crucial role in simulating individual
customers within the service environment. Its primary objective is to represent
the characteristics and behavior of customers during the simulation.
● Key Responsibilities: Each customer is assigned a unique identifier, facilitating the distinction between individual customers within the simulation and serves as the entity that interacts with the simulation, moving through different stages
such as arrival, waiting in queues, and being processed at cash counters.
3. Main.java:
● Purpose: Serves as the entry point for the simulation.
● Key Responsibilities: Takes user inputs for essential parameters like the
number of cash counters, service time, arrival rate, and Initializes the simulation
with user inputs.
4. QueueManager.java:
● Purpose: Manages the list of counters and customer assignment strategies.
● Key Responsibilities: Maintains a list of counters available in the simulation
and assigns customers to counters based on the chosen strategy (shortest queue
or random) also can be configured through a boolean parameter.
5. Simulation.java:
● Purpose: Orchestrates the entire simulation by managing time, interactions, and
overall flow.
 
● Key Responsibilities: Utilizes a QueueManager to handle customer-counter assignments, simulates customer arrivals and processes them at each time step, updates wait times and displays real-time counter status during the simulation. Simulation class also can calculates and displays comprehensive results at the end of the simulation.
