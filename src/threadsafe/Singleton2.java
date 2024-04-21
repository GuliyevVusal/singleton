package threadsafe;

public class Singleton2 {
    public static void main(String[] args) {

        new Thread(() -> {
            try {
                MySingleton2.getInstance2().printHashCode(); // 860708892   (synchronized- 624843417)
            } catch (InterruptedException ex) {

            }

        }).start();

        new Thread(() -> {
            try {
                MySingleton2.getInstance2().printHashCode(); // 860708892  (synchronized- 624843417)
            } catch (InterruptedException ex) {

            }

        }).start();

        new Thread(() -> {
            try {
                MySingleton2.getInstance2().printHashCode(); // 675271677  (synchronized- 624843417)
            } catch (InterruptedException ex) {

            }

        }).start();
    }

}
