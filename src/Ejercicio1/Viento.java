package Ejercicio1;

public class Viento {
    String nombreInstrumento;
    int precioInstrumento;

    static String tocarInstrumento="Esta sonando un instrumento de viento";

    public Viento(String nombreInstrumento, int precioInstrumento) {
        this.nombreInstrumento = nombreInstrumento;
        this.precioInstrumento = precioInstrumento;
    }

    public void muestraTocar() {

        System.out.println(tocarInstrumento);
    }
}
