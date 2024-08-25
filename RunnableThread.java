package Assignment;
public class RunnableThread implements Runnable {
    public void run() {
        System.out.println("Thread is running.");
    }

    public static void main(String[] args) {
        RunnableThread rt = new RunnableThread();
        Thread t = new Thread(rt);
        t.start();

}
}
