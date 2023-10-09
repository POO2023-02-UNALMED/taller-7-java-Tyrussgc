package comunicacion;

public class Alfabeto extends Pictograma{
    private String[] letras;
    private String interpretacion;
    public Alfabeto(String origen, String[] letras, String interpretacion) {
        super(origen);
        this.letras = letras;
        this.interpretacion = interpretacion;
    }
    public String[] getLetras() {
        return this.letras;
    }
    public void setLetras(String[] letras) {
        this.letras = letras;
    }
    public String getInterpretacion() {
        return this.interpretacion;
    }
    public void setInterpretacion(String interpretacion) {
        this.interpretacion = interpretacion;
    }
    public int cantidadLetras() {
        return this.letras.length;
    }
    public String interpretacion() {
        return this.interpretacion;
    }
    public String toString() {
        String r = "";
        for (int i = 0; i < this.cantidadLetras()-1; i++) {
            r += letras[i]+", ";
        }
        r += letras[this.cantidadLetras()-1];
        return r;
    }
}