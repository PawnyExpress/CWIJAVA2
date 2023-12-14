public class TowersOfHanoi {

    private int numberOfDisks;

    public void solve() {
        // One Disk solution
        moveOneDisk(1, 3);
        System.out.println();
        moveTwoDisks(1, 3, 2);
        System.out.println();
        moveThreeDisks(1, 3, 2);
        System.out.println();
        moveFourdisks(1, 3, 2);
        System.out.println();
        moveTower(, numberOfDisks, numberOfDisks, numberOfDisks);
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
        //moveOneDisk(start, end);
        //moveOneDisk(start, temp);
        //moveOneDisk(end, temp);
        moveTwoDisks(start, temp, end);

        moveOneDisk(start, end);

      /*moveOneDisk(temp, start);
        moveOneDisk(temp, end);
        moveOneDisk(start, end); */
        moveTwoDisks(temp, end, start);
    }

    private void moveFourdisks(int start, int end, int temp) {
        /* moveTwoDisks(start, end, temp);
        moveOneDisk(start, temp);
        moveTwoDisks(end, temp, start); */
        moveThreeDisks(start, temp, end);
        moveOneDisk(start, end);
        moveThreeDisks(temp, end, start);
    }

    private void moveTower(int numberOfDisks, int start, int end, int temp) {
        if(numberOfDisks == 1) {
            moveOneDisk(start, end);
        } else {
            moveTower(numberOfDisks - 1, start, end, temp);
            moveOneDisk(start, end);
            moveTower(numberOfDisks - 1, temp, end, start);
        }
        
    }
}
