package examenpsp_ev1_3;

import java.util.logging.Level;
import java.util.logging.Logger;

public class ClaseHilos extends Thread {

    public static int contSubHilo = 0;

    public ClaseHilos(String nombre) {

        super(nombre);

    }

    @Override
    public void run() {

        ClaseHilos subh = null;

        if (contSubHilo == 0) {
            //ponemos los start en un for !!!
            for (int i = 0; i < 2; i++) {

                contSubHilo++;

                subh = new ClaseHilos("SUBHILO " + contSubHilo);

                subh.start();

            }
        }

        if (contSubHilo != 0) {

            for (int i = 0; i < 25; i++) {

                System.out.println(i + ". " + getName());

                try {
                    sleep((int) (Math.random() * (500 - 600) + 600));
                } catch (InterruptedException ex) {
                    Logger.getLogger(ClaseHilos.class.getName()).log(Level.SEVERE, null, ex);
                }

                yield();

            }

        }

    }

}
