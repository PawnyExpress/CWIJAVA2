public class Duck {
    private String firstName, lastName;
    //private Duck next;

    public Duck(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        //this.next = null;
    }

    /* public void setNext(Duck next) {
        this.next = next;
    }

    public Duck getNext() {
        return this.next;
    } */

    public String toString() {
        return firstName + " " + lastName;
    }
}