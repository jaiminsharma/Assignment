package Assignment;

public class ExtendingThread_P018 extends Thread {
    public void run() {
        System.out.println("Thread is running.");
    }

    public static void main(String[] args) {
    	ExtendingThread_P018 et = new ExtendingThread_P018();
        et.start();

    }

}
