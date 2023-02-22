package Ejercicio1;

public class Percusion {
    String nombreInstrumento;

    int precioInstrumento;

    static String tocarInstrumento="Esta sonando un instrumento de percusion";

    public Percusion(String nombreInstrumento, int precioInstrumento) {
        this.nombreInstrumento = nombreInstrumento;
        this.precioInstrumento = precioInstrumento;
    }

    public void muestraTocar() {

        System.out.println(tocarInstrumento);
    }
}
