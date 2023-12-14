import java.io.IOException;
import java.util.Iterator;

public class POSTester {
    public static void main(String[] args) throws IOException, ClassNotFoundException{
        ProgramOfStudy pos = new ProgramOfStudy();
        pos.addCourse(new Course("CPSC", 221, "Computer Science II"));
        pos.addCourse(new Course("PHYS", 212, "Physics for Scientists and Engineers II"));
        pos.addCourse(new Course("MATH", 170, "Calculus I", Grade.A_PLUS));
        pos.addCourse(new Course("CPSC", 121, "Computer Science I", Grade.B));
        pos.addCourse(new Course("MATH", 175, "Calculus II", Grade.B_PLUS));
        pos.addCourse(new Course("PHYS", 211, "Physics for Scientists and Engineers I", Grade.C));

        System.out.println(pos);

        System.out.println();

        /* Course compTwo = pos.find("cpsc", 221);
        compTwo.setGrade(Grade.A);
        System.out.println(compTwo + "\n"); */
        
        //Course physTwo = pos.find("phys", 211);
        //String fileName = "ProgramOfStudy.dat";
        //pos.replace(physTwo, new Course("CHEM", 111, "General Chemistry I", Grade.A));
        //pos.replace(new Course("PHYS", 212, ""), new Course("CHEM", 111, "General Chemistry I", Grade.A));
        //ProgramOfStudy pos = ProgramOfStudy.load(fileName);
        //pos.save(fileName);

        for (Course course : pos) {
            //if (course.getGrade() == Grade.A_PLUS || course.getGrade() == Grade.A || course.getGrade() == Grade.A_MINUS) 
            if (course.getGrade().getRank() >= 10){
                System.out.println(course);
            }
        }

        Iterator<Course> iter = pos.iterator();
        while (iter.hasNext()) {
            Course course = iter.next();
            if (!course.taken()) {
                iter.remove();
            }
        }


        System.out.println();
        System.out.println(pos);
    }
}
