public class Customer {
    private int arrivalTime, departureTime;

    public Customer(int arrivalTime) {
        this.arrivalTime = arrivalTime;
        this.departureTime = arrivalTime;
    }

    public int getArrivalTime() {
        return arrivalTime;
    }

    public int getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(int departureTime) {
        this.departureTime = departureTime;
    }

    public int getWaitTime() {
        return departureTime - arrivalTime;
    }

    public String toString() {
        return Integer.toString(arrivalTime);
    }
}
