import java.io.*;
import java.lang.*;

class Mul extends Thread{
    public void run()
    {
        System.out.println("Running thread priority is "+Thread.currentThread().getPriority());
        int i=Thread.currentThread().getPriority();
        
        for(int j=1;j<=10;j++)
        {
            System.out.println(j+"*"+i+"="+j*i);
        }
    }
    public static void main(String args[]){
        Mul m1=new Mul();
        Mul m2=new Mul();
        Mul m3=new Mul();
        
        m1.setPriority(Thread.MAX_PRIORITY);
         m2.setPriority(Thread.NORM_PRIORITY);
          m3.setPriority(Thread.MIN_PRIORITY);
          
          m1.start();
          m2.start();
          m3.start();
    }
}