package baitap2;

public class OddThread extends Thread{

    public void run() {
        System.out.println("Odd Number from 1 to 10 is: ");
        for (int i = 1; i < 11; i++) {
            if (i%2!=0) {
                System.out.printf("%d\t",i);
            }
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println();
    }
}
