package mx.utng.s27.reto01;

import java.util.concurrent.TimeUnit;

public class Hilo2 extends Thread {
    @Override
    public void run() {
        while (true) {
            System.out.println("Sigo en ejecucion");
            try {
                TimeUnit.MILLISECONDS.sleep(500);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}
