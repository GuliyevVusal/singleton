package doublecheck;

public class Singleton3 {
    public static void main(String[] args) {

        new Thread(() -> {
            try {
                MySingleton3.getInstance3().printHashCode(); // Double Check Locking 1157522427
            } catch (InterruptedException ex) {

            }

        }).start();

        new Thread(() -> {
            try {
                MySingleton3.getInstance3().printHashCode(); //  Double Check Locking 1157522427
            } catch (InterruptedException ex) {

            }

        }).start();

        new Thread(() -> {
            try {
                MySingleton3.getInstance3().printHashCode(); // Double Check Locking 1157522427
            } catch (InterruptedException ex) {

            }

        }).start();
    }

}
