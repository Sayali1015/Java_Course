//Threads are the smallest unit of processing that can be performed in an OS.
//In every thread we need to have a run() method which is the entry point for the thread.

//Scheduler is responsible for scheduling the threads and it uses the concept of time slicing to allocate CPU time to each thread.
//Scheduler allows which treads to run and which thread to wait. It is responsible for managing the threads and ensuring that they are executed in a fair manner.
//We cannot control the Schedular but we can suggest it to run a particular thraed. for that we hava a concept of threads priority. The priority ranges goes from 1 to 10. 1 is the lowest priority and 10 is the highest priority. And 5 is the default priority.
class A implements Runnable{
    public void run(){

        for(int i =0 ; i<5; i++){
             System.out.println("Hii");
            
        }
    }
}


class B implements Runnable{
    public void run(){

        for(int i =0 ; i<5; i++){
             System.out.println("Hello");
                
        }
    }
}

public class Threads {
    public static void main(String[] args) {
        Runnable obj1 = new A();
        Runnable obj2 = new B();

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);
       
        t1.start();
        t2.start();
    }
}
