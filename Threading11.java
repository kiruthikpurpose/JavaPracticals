// 11. Create a Java program that demonstrates thread joining. Implement a main thread that spawns two threads: Thread A and Thread B. Thread A prints numbers from 1 to 5, and Thread B prints letters from ‘A’ to ‘E’. Ensure Thread B starts only after Thread A has finished.

class ThreadA extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread A: " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}

class ThreadB extends Thread {
    @Override
    public void run() {
        for (char c = 'A'; c <= 'E'; c++) {
            System.out.println("Thread B: " + c);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}

public class Threading11 {
    public static void main(String[] args) throws InterruptedException {
        ThreadA threadA = new ThreadA();
        ThreadB threadB = new ThreadB();

        threadA.start();
        threadA.join();  // Ensure threadB starts after threadA completes

        threadB.start();
    }
}
