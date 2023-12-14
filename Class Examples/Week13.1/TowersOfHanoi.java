public class TowersOfHanoi {
    public void solve() {
        // One Disk solution
        moveOneDisk(1, 3);
        System.out.println();
        moveTwoDisks(1, 3, 2);
        System.out.println();
        moveThreeDisks(1, 3, 2);
    }

    private void moveOneDisk(int start, int end) {
        System.out.println("Move one disk from " + start + " to " + end);
    }

    private void moveTwoDisks(int start, int end, int temp) {
        moveOneDisk(start, temp);
        moveOneDisk(start, end);
        moveOneDisk(temp, end);
    }

    private void moveThreeDisks(int start, int end, int temp) {

    }
}
