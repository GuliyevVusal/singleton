package threadsafe;

public class MySingleton2 {

    private static MySingleton2 instance;
    private static final Object manitor = new Object();

    private MySingleton2() {

    }

    public static MySingleton2 getInstance2() throws InterruptedException {
        synchronized (manitor){ // 3 Thread gelir ilk giren lock eliyir ve girir iceri diger Thread-ler gozduyur burda
            if (instance == null) { // bura geldiklerinde artiq object yaranmis olacaq
                Thread.sleep(1000);
                instance = new MySingleton2();
            }
        }
        return instance;
    }

    public void printHashCode() {
        System.out.println(hashCode());
    }
}
