package baiTap3;

public class Main {
    public static void main(String[] args) {
        LazyPrimeFactorization lazyPrimeFactorization = new LazyPrimeFactorization();
        OptimizedPrimeFactorization optimizedPrimeFactorization = new OptimizedPrimeFactorization();
        Thread thread1 = new Thread(lazyPrimeFactorization);
        Thread thread2 = new Thread(optimizedPrimeFactorization);
        thread1.start();
        try {
            thread1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        thread2.start();
    }
}
