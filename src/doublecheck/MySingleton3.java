package doublecheck;

public class MySingleton3 {

    private static MySingleton3 instance;
    private static final Object manitor = new Object();

    private MySingleton3() {

    }

    public static MySingleton3 getInstance3() throws InterruptedException {
        if (instance == null) { // Double Check Locking
            synchronized (manitor) { // 1-ci Thread burani lock eliyende hamisi gozluyecek burda
                if (instance == null) { // 2-3 Thread bura catanda baxirki null deyil obyekt yaradilib ve return
                    Thread.sleep(1000);
                    instance = new MySingleton3();
                }
            }
        }
        return instance; // 1-ci if-e gelirler null-du ? yox iceri girmirler returne gelirler
    }                   // performans asagi dusmur belelikle her defe getInstance3 muraciet olundugunda 1 defe ise dusur

    public void printHashCode() {
        System.out.println(hashCode());
    }
}
