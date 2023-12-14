public class Sorting {
    
    public static <E extends Comparable<E>> void selectionSort(E[] data) {
        int min;
        for (int i = 0; i < data.length; i++) {
            min = i;
            for (int j = i+1; j < data.length; j++) {
                if (data[j].compareTo(data[min]) < 0) {
                    min = j;
                }
            }
            swap(data, min, i);
        }
    }

    private static <E extends Comparable<E>> void swap(E[] data, int firstIndex, int secondIndex) {
        E temp = data[secondIndex];
        data[secondIndex] = data[firstIndex];
        data[firstIndex] = temp;
    }

    public static <E extends Comparable<E>> void insertionSort(E[] data) {
        // In the beginning... the sorted partition is the single item at index 0
        for (int i = 1; i < data.length; i++) {

            E key = data[i];// this is the next item in the unsorted partition
            int position = i;
            while (position > 0 && data[position-1].compareTo(key) > 0) {

                data[position] = data[position -1];
                position--;// decrement the position
            }
            // when the loop ends, position holds the index where key need to be
            data[position] = key;
        }
    }

    public static <E extends Comparable<E>> void bubbleSort(E[] data) {
        //Loop over items as the "water line" drops from the largest index to 0
        for (int waterLine = data.length-1; waterLine >= 0; waterLine--) {
            for (int net=0; net< waterLine; net++) {
                //if two adjacent items are out of sorts, swap 'em
                if(data[net].compareTo(data[net+1]) > 0) {
                    swap(data, net, net+1);
                }
            }
        }
    }

    public static <E extends Comparable<E>> void quickSort(E[] data) {
        if (data == null || data.length <= 1) { return; }
        quickSort(data, 0, data.length-1);
    }

    private static <E extends Comparable<E>> void quickSort(E[] data, int min, int max) {
        if (max <= min) { return; } // Base Case!
        //pick a partition element, place the rest of the elements into a left partition and a right partition
        //determining the partition index
        int indexOfPartition = partition(data, min, max);

        //quickSort the left partition: min -> indexOfPartition-1
        quickSort(data, min, indexOfPartition - 1);

        //quickSort the right partition: indexOfPartition+1 -> max
        quickSort(data, indexOfPartition + 1, max);
    }

    private static <E extends Comparable<E>> int partition(E[] data, int min, int max) {
        int midPoint = (min + max) / 2;
        E partitionElement = data[midPoint];
        int left, right;

        //move the partition element out of the way
        swap(data, min, midPoint);

        left = min;
        right = max;

        while (left < right) {
            while (left < max && data[left].compareTo(partitionElement) <= 0) {
            left++;
            } 
            //Eureka!!! We found an element that needs to go to the right
            while (right > min && data[right].compareTo(partitionElement) > 0) {
            right--;
            }
            //Eureka!!! We found an element that needs to go to the left

            if (left < right) {
            swap(data, left, right);
            }
        }
        //The index pointed to by right... IS the new location for the partition element
        swap(data, min, right);

        return right;
    }

    public static <E extends Comparable<E>> void mergeSort(E[] data) {
        mergeSort(data, 0, data.length-1);
    }

    private static <E extends Comparable<E>> void mergeSort(E[] data, int min, int max) {
        if (max <= min) { return; }

        int midPoint = (min + max) / 2;

        // left bucket
        // data from index min to midPoint
        //mergeSort the left bucket
        mergeSort(data, min, midPoint);

        // right bucket
        //data from midPoint + 1 to max
        //mergeSort the right bucket
        mergeSort(data, midPoint + 1, max);

        // --- left bucket has been ordered 
        // --- right bucket has been ordered
        // merge the two buckets
        merge(data, min, midPoint, max);
    }

    @SuppressWarnings("unchecked")
    private static <E extends Comparable<E>> void merge(E[] data, int first, int midPoint, int last) {
        // temporary array to merge into
        E[] playground = (E[])(new Comparable[data.length]);

        int firstLeft = first, lastLeft = midPoint; // Defining the borders of the left bucket
        int firstRight = midPoint + 1, lastRight = last; // Defining the borders of the right bucket
        int index = first;

        while (firstLeft <= lastLeft && firstRight <= lastRight) {
            if (data[firstLeft].compareTo(data[firstRight]) < 0) {
                playground[index] = data[firstLeft];
                firstLeft++;
            } else {
                playground[index] = data[firstRight];
                firstRight++;
            }
            index++;
        }
        while (firstLeft <= lastLeft ) {
            playground[index] = data[firstLeft];
            firstLeft++;
            index++;
        }
        while (firstRight <= lastRight) {
            playground[index] = data[firstRight];
            firstRight++;
            index++;
        }

        // Copy the playground values into the data
        for (int i = first; i <= last; i++) {
            data[i] = playground[i];
        }
    }
}
