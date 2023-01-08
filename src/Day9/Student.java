package Day9;

public class Student extends Human{
    private String groupName;

    public Student(String name, String groupName) {
        super(name);
        this.groupName = groupName;
    }

    public String getGroupName() {
        return groupName;
    }

    public void printInfo(){
        super.printInfo();
        System.out.println("The name of the student is " + getName());
    }
}
