import java.util.Arrays;

public class SearchingDriver {
    public static void main(String[] args) {
        Student[] students = new Student[5];
        Student target = new Student("David");

        students[0] = new Student("David", 97, 75);
        students[1] = new Student("Daniel", 80, 80);
        students[2] = new Student("Danielle", 75, 94);
        students[3] = new Student("Danica", 95, 85);
        students[4] = new Student("Darlene", 85, 75);
        // students[4] = new Student("David", 97, 75);
        // students[0] = new Student("Daniel", 80, 80);
        // students[1] = new Student("Danielle", 75, 94);
        // students[2] = new Student("Danica", 95, 85);
        // students[3] = new Student("Darlene", 85, 75);

        System.out.println("\nUnsorted...");
        for(Student student : students) {
            System.out.println(student);
        }

        Sorting.mergeSort(students);
        //Arrays.sort(students, new ExamComparator());
        //Arrays.sort(students, (first, second)  ->  ((Integer)(first.getExamAverage())).compareTo(second.getExamAverage()));
        // Arrays.sort(students, 
        //             (first, second) ->
        //                     first.getId().compareTo(second.getId()));

        System.out.println("\nSorted...");
        for(Student student : students) {
            System.out.println(student);
        }
        //Searching<Student> searching = new Searching<Student>();

        System.out.print("\nDid we find " + target.getId() + "? ");
        System.out.println(Searching.binarySearch(students, target) ? "Yes" : "No");

    }
}
