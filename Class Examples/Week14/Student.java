public class Student implements Comparable<Student>  {

    private String id;
    private int examAverage, assignmentAverage, overallAverage;

    public Student(String id) {
        this(id,0,0);
    }
    public Student(String id, int examAverage, int assignmentAverage) {
        this.id = id;
        this.examAverage = examAverage;
        this.assignmentAverage = assignmentAverage;
        this.overallAverage = (examAverage + assignmentAverage)/2;
    }

    public String getId() {
        return id;
    }

    public int getExamAverage() {
        return examAverage;
    }

    public int getAssignmentAverage() {
        return assignmentAverage;
    }

    public int getOverallAverage() {
        return overallAverage;
    }

    public String toString() {
        String result = id + " -";
        result+= " exam average: " + examAverage;
        result+= " assignment average: " + assignmentAverage;
        result+= " overall average: " + overallAverage;
        return result;
    }

    @Override
    public int compareTo(Student student) {
        return this.id.compareTo(student.getId());
    }
}