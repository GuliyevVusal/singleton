package singleton;

public class MySingleton {
    private static MySingleton instance;

    private MySingleton() {
    }

    public static MySingleton getInstance() {
        if (instance == null) {
            instance = new MySingleton();
        }
        return instance;

    }

    public void printHashCode() {
        System.out.println(hashCode());
    }

}
