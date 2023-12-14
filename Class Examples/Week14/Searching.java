public class Searching {
    
    public static<E extends Comparable<E>> boolean linearSearch(E[] data, E target) {
        //boolean result = false;
        return linearSearch(data, 0, data.length-1, target);
        /* for (int i = 0; i < data.length; i++) {
            if(data[i].compareTo(target) == 0) {
                return true;
            }
        } */
        //return result;
        //return false;
    }

    public static<E extends Comparable<E>> boolean linearSearch(E[] data,int min, int max, E target) {
        if(min < 0 || max > data.length || min > max) { return false; }

        for(int i = min; i < max; i++) {
            if (data[i].compareTo(target) == 0) {
                return true;
            }
        }
        return false;
    }

    public static<E extends Comparable<E>> boolean binarySearch(E[] data, E target) {
        return binarySearch(data, 0, data.length-1, target);
    }

    public static<E extends Comparable<E>> boolean binarySearch(E[] data,int min, int max, E target) {
        if(min < 0 || max > data.length || min > max) { return false; } // Fail! base case. All your base are not belong to us!!

        int midPoint = (min + max) / 2;

        if (data[midPoint].compareTo(target) == 0) { // Found it!!!!! All your base are belong to us!!!
            return true;
        } else if(data[midPoint].compareTo(target) > 0) { // When target should be in the left partition
            return binarySearch(data, min, midPoint - 1, target);
        } else { // when target should be in the right partition
            return binarySearch(data, midPoint + 1, max, target);
        }
    }
}
