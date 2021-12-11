import java.util.*;
import java.io.*;

class Child implements Runnable{
    public void run(){
        System.out.println("This is from Run Child Class: ");
        try{Thread.sleep(1000);}
        catch(Exception e){}
        
    }
}
class Child2 implements Runnable{
    public void run(){
        System.out.println("This is from Child2 CLass: ");
        
    }
}

public class ThreadsLabInheritance{
public static void main(String args[]){

//Creating Object
Child ob = new Child();
Child2 ob2 = new Child2(); 
        //passing Object to Thread Class
           Thread t1 = new Thread(ob);
           Thread t2  = new Thread(ob2);

//Prioritizing   Where '10' is High and '1' is Low 
t1.setPriority(1);
t2.setPriority(10);


t1.start();
t2.start();

System.out.println("Getting t1 Priority:  " + t1.getPriority());
System.out.println("Getting t2 Priority:  " + t2.getPriority());

}

}