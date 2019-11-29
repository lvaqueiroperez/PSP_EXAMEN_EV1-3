package examenpsp_ev1_3;

public class ExamenPSP_Ev1_3 {

    public static void main(String[] args) throws InterruptedException {

        ClaseHilos h1 = new ClaseHilos("HILO 1");

        h1.start();
        //para que el programa principal no acabe antes que el resto:
        h1.join();

        System.out.println("ACABA HILO MAIN");

    }

}
