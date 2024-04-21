package singleton;

import singleton.MySingleton;

public class Singleton {
    public static void main(String[] args) {


        MySingleton a = MySingleton.getInstance();
        a.printHashCode(); // 460141958

        MySingleton b = MySingleton.getInstance();
        b.printHashCode(); // 460141958
    }

}