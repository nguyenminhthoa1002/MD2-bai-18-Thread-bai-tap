package baiTap1;

public class NumberGenerator implements Runnable{

    @Override
    public void run() {
        System.out.println("10 so dau tien la: ");
        for (int i = 0; i < 10; i++) {
            System.out.printf("%d\t",i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("\nDa in xong");
    }
}
