import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;

public class ProgramOfStudy implements Serializable {

    private List<Course> list;

    public ProgramOfStudy() {
        list = new LinkedList<Course>();
    }

    public void addCourse(Course course) {
        if (course == null) {return;}  // Guard Statement
        list.add(course);
    }

    public void replace(Course target, Course newCourse) {
        if (target == null || newCourse == null) {return;} // Guard Statement
        if (!list.contains(target) || list.contains(newCourse)) {return;}
        list.remove(target);
        list.add(newCourse);
    }

    public String toString() {
        String result = "";
        for (Course course: list) {
            result += course + "\n";
        }
        return result;
    }

    public void save(String fileName) throws IOException {
        FileOutputStream fos = new FileOutputStream(fileName);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        //Write the serialized object to the stream buffer
        oos.writeObject(this);
        oos.flush();
        oos.close();
    }

    public static ProgramOfStudy load(String fileName) throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream(fileName);
        ObjectInputStream ois = new ObjectInputStream(fis);
        ProgramOfStudy pos = (ProgramOfStudy)ois.readObject();
        ois.close();
        return pos; 
    }
}
