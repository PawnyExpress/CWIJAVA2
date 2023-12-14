//import java.util.LinkedList;


public class TicketCounter {

    private final static int NUM_CUSTOMERS = 150;
    private final static int PROCESS_TIME = 120;
    private final static int ARRIVAL_INTERVAL = 15;
    private final static int MAX_CASHIERS = 10;
    public static void main(String[] args) {
        //Queue<Customer> customerQueue = new LinkedList<Customer>();
        //CircularArrayQueue<Customer> customerQueue = new CircularArrayQueue<Customer>();
        LinkedQueue<Customer> customerQueue = new LinkedQueue<Customer>();
        int startTime, departureTime, totalWaitTime, averageTime;
        int[] cashierTime = new int[MAX_CASHIERS];
        Customer customer;

        for (int cashiers = 1; cashiers <= MAX_CASHIERS; cashiers++) {

            for(int count = 1; count <= NUM_CUSTOMERS; count++) {
                //customerQueue.add(new Customer(count * ARRIVAL_INTERVAL));
                customerQueue.enqueue(new Customer(count * ARRIVAL_INTERVAL));
            }

            totalWaitTime = 0;

            for (int i = 0; i <cashiers; i++) {
                cashierTime[i] = 0; // is the time reckoning of the last customer serrved by the cashier
            }
        
                //single cashier
                while (!customerQueue.isEmpty()) {

                    for(int i = 0; i < cashiers; i++) {
                        if (!customerQueue.isEmpty()) {
                        //cashier1 takes a single customer
                        //customer = customerQueue.remove();
                        customer = customerQueue.dequeue();

                        //Two Options
                        if (customer.getArrivalTime() > cashierTime[i]) {
                        //First... no one in line...i.e cashier is free
                        startTime = customer.getArrivalTime();         
                        } else {
                        //Second... gets to cashier at the same time customer in front leaves the cashier
                        startTime = cashierTime[i];
                        }
                        departureTime = PROCESS_TIME + startTime;
                        customer.setDepartureTime(departureTime);
                        cashierTime[i] = departureTime;
                        totalWaitTime += customer.getWaitTime();
                        }
                
                    }
                }
                averageTime = totalWaitTime / NUM_CUSTOMERS;
                System.out.println("Number of cashiers: " + cashiers);
                System.out.println("Average Time: " + averageTime/60 + " minutes, " + averageTime%60 + " seconds (" + averageTime + ")\n");
        }
    }
}