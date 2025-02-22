// Create a class Student with three instance variables(name, email & password)
// to display it create at least 3 different objects for 3 different Students

public class Task_03 {
   public static void main(String[] args){
       Student ali = new Student();  //ali is a reference variable
       ali.name = "Ali Ahmad";
       ali.email = "ali2345@gmail.com";
       ali.password = "Password";
       ali.display();
       
       Student ahsan = new Student();
       ahsan.name = "Ahsan Khan";
       ahsan.email = "ahsanz23@gmail.com";
       ahsan.password = "ahsanKhan123";
       ahsan.display();
       
       Student ahmad = new Student();
       ahmad.name = "Ahmad Zubair";
       ahmad.email = "ahmad66@gmail.com";
       ahmad.password = "ahmad_Chigga_xd234";
       ahmad.display();
   }
}

class Student{
    String name; // by default None
    String email;  // by default 0
    String password;
    public void display(){  //method
        System.out.println(name);
        System.out.println(email);
        System.out.println(password + "\n");
    }
}
