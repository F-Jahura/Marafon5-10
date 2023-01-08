package Day9;

public class Teacher extends Human{
    private String SubjectName;

    public Teacher(String name, String subjectName) {
        super(name);
        SubjectName = subjectName;
    }

    public String getSubjectName() {
        return SubjectName;
    }

    public void printInfo(){
        super.printInfo();
        System.out.println("The name of the teacher is " + getName());
    }
}
