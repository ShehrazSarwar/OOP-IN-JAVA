

class Pen{
    String color;
    String type;

    public void write(){
        System.out.println("Write something...");
    }

    public void printColor(){
        System.out.println(this.color);
    }
}

class Student{
    String name;
    int age;

    public void printInfo(String name,int age){
        System.out.println(name);
        System.out.println(age);
    }

    public void printInfo(String name){
        System.out.println(name);
    }

    public void printInfo(int age){
        System.out.println(age);
    }

    public void printInfo(){
        System.out.println(name);
        System.out.println(age);
    }

}

public class Basics {
    public static void main(String[] args){
        Student s1 = new Student();
        s1.name = "Shehzi";
        s1.age = 20;

        s1.printInfo(s1.name,s1.age);
        s1.printInfo();
    }
}