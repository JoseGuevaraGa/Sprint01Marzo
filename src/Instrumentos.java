import Ejercicio1.Cuerda;
import Ejercicio1.Percusion;
import Ejercicio1.Viento;

public class Instrumentos{
    public static void main(String[] args) {
        Viento flauta = new Viento("Flauta", 30);
        flauta.muestraTocar();

        Percusion tambor = new Percusion("Tambor", 30);
        tambor.muestraTocar();

        Cuerda guitarra = new Cuerda("Guitarra", 30);
        guitarra.muestraTocar();
    }
}