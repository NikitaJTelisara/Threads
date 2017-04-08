import java.nio.file.attribute.BasicFileAttributes;

public class ThreadsProblems {

    /* Basic Notes
    2 ways to implement threads in java  , each have 2 ways to implement
    - implementing java.lang.Runnable
    - extending java.lang.Treads class

    The runnable interface
    public interface Runnable{
       public abstract void run();
    } */

    //Steps to implement Runnable
    public static void main(String[] args) {
        /* 1. Create a class which implements the Runnable interface. An object of this class is a
           Runnable object. ThreadRunnableEx created

           2. Create an object of type Thread by passing a Runnable object as argument to the
           Thread constructor. The Thread object now has a Runnable object that implements
           the run () method.   */
        ThreadRunnableEx instance = new ThreadRunnableEx();
        Thread thread = new Thread(instance);

        /* 3. The start () method is invoked on the Thread object created in the previous step.*/
        thread.start();
        while (instance.count != 5) {
            try {
                Thread.sleep(250);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
     /* implement he run() method or pass an instance of the class to new Thread (obj) and call start () on the thread */



    ThreadAbstractEx instance1 = new ThreadAbstractEx();
    instance1.start();
        while (instance1.count != 5) {
            try {
                Thread.sleep(250);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    /* 2 reason why we prefer implementing Runnable interface
       1. Java does not all multiple inheritance. Therefore the subclass cant inherit any other class
       2. inheriting the full overhead of the Thread class would be excessive.
     */
} }
