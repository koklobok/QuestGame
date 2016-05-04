package org.javajunior.quest.util;

public class ThreadUtils {
    private ThreadUtils() {}

    /** Runs Thread.sleep, does not throws checked exception
     *
     * @param millis time in milliseconds to pause current thread
     */
    public static void sleep(long millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
