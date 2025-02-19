
interface Animal {
    int eyes = 2;
    void walk();   // by default abstract and public but we can write public before it if we want
    
}

interface Harbivore {

}
// this is called multiple inheritance and can be only achieved through the use of interface
class Horse implements Animal,Harbivore{  
    public void walk(){
        System.out.println("Walks on 4 legs");
    }
}

public class Interface {
    public static void main(String[] args){
        Horse horse = new Horse();
        horse.walk();
    }
}
