
class Student {
    String name;
    static String school;

    public static void changeSchool(){
        school = "New School!";
    }
    
}

public class Static {
    public static void main(String[] args){  
        Student.school = "JMV";   // Can access school directly through class name if it's static
        Student student = new Student();
        student.name = "Shehraz";
        System.out.println(student.school);
    }
}
