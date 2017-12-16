package question6;
import java.util.Date;
class ThreadTimeSleep extends Thread {
    private String threadName;
    
    ThreadTimeSleep(String name) {
        threadName = name;
        System.out.println("Creating "+threadName);
    }

    static void printDateTime() {
        Date date = new Date();
        String str = String.format("Current Date/Time : %tc", date );
        System.out.println(str);
    }
    
    public void run() {
        System.out.println("Running "+threadName);
        try {
            for(int i=0; i<2; i++) {
                printDateTime();
                Thread.sleep(10000);
            }
        }

            catch(InterruptedException e) {
                System.out.println("Thread " +  threadName + " interrupted.");
            }
        }
    }
public class ThreadTimeSleepMain {
    public static void main(String args[]) {
        ThreadTimeSleep tt = new ThreadTimeSleep("MyThread");
        tt.start();
    }
}