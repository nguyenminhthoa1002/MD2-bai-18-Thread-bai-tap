package baiTap3;

public class OptimizedPrimeFactorization implements Runnable{
    @Override
    public void run() {
        System.out.println("Prime Factorization from 1 to 100");
        for (int i = 2; i < 101; i++) {
            if (isPrime(i)){
                System.out.printf("%d\t",i);
            }
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println();
    }

    public static boolean isPrime(int number){
        int number1 = (int)Math.sqrt(number);
        for (int i = 2; i <= number1; i++) {
            if (number%i==0){
                return false;
            }
        }
        return true;
    }
}
