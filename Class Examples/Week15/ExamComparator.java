import java.util.Comparator;

public class ExamComparator implements Comparator<Student> {

    @Override
    public int compare(Student firstStudent, Student secondStudent) {
        Integer firstAverage = firstStudent.getExamAverage();
        Integer secondAverage = secondStudent.getExamAverage();

        return firstAverage.compareTo(secondAverage);
    }
    
}
