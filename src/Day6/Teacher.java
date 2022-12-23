package Day6;

import java.util.Random;

class Teacher {
    String teacherName;
    String subject;

    public Teacher(String teacherName, String subject) {
        this.teacherName = teacherName;
        this.subject = subject;
    }


    public String getTeacherName() {
        return teacherName;
    }

    public String getSubject() {
        return subject;
    }

    public void evaluate(Student student){
        Random random = new Random();
        int valuation = random.nextInt(5)+2;
        String value;

        if (valuation == 2){
            value = "Fail";
        } else if (valuation == 3){
            value = "Pass";
        } else if (valuation == 4) {
            value = "Good";
        } else
            value = "Great";

        System.out.println("Teacher " + getTeacherName() + " evaluated the student " + student.getStudentName() +
                " on the subject " + getSubject() + " in valuation marks " + value + ".");

    }
}

class Student{
    String studentName;

    public Student(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentName() {
        return studentName;
    }
}
