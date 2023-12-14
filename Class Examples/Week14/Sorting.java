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
}
