package Day9;

public class Task9_1 {
    public static void main(String[] args) {

        Student student = new Student("Mark", "UIS-111");
        Teacher teacher = new Teacher("Mr. David", "Chemistry");
        System.out.println(student.getGroupName());
        System.out.println(teacher.getSubjectName());

        student.printInfo();
        teacher.printInfo();
    }

}
