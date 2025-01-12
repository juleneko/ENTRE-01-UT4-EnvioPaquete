import java.util.Random;
/**
 *  Un objeto de esta clase guarda los datos de un
 *  paquete
 * 
 * @author -Juleneko-
 *  
 */
public class Paquete 
{
    private Random generador;
    private Dimension dimension;
    private double peso;

    /**
     * Constructor 1 sin parámetros
     * Crea el paquete con 40 , 30, 50 de
     * alto, ancho, largo (en cm) y peso 8 Kg
     */
    public Paquete()    {
        new Dimension(40,30,50);
        peso = 8;
        
    }

    /**
     * Constructor 2 
     *  Crea el paquete con el alto, ancho, largo (en cm) indicados
     *  y peso un valor aleatorio entre 2 y 8 Kg inclusive
     *  Se crea aquí el generador
     */
    public Paquete(double alto, double ancho, double largo)    {
        new Dimension(alto,ancho,largo);
        peso = (int)Math.random()*7 +2;        
    }

    /**
     * Constructor 3 
     * Crea el paquete a la dimension y peso indicados
     * 
     */
    public Paquete(Dimension dimension, double peso)    {
        new Paquete(dimension , peso);
        
    }

    /**
     * accesor para la dimensión
     */
    public Dimension getDimension() {
        return this.dimension;

    }

    /**
     * accesor para el peso
     */
    public double getPeso() {
        return this.peso;

    }

    /**
     * calcula y devuelve el volumen del paquete (en cm3)
     * El volumen = alto x ancho x largo
     */
    public double calcularVolumen() {
        double temp1;
        temp1= dimension.getAlto() * dimension.getAncho() * dimension.getLargo();
        return temp1;
    }

    /**
     * calcula y devuelve el peso volumétrico del paquete (en Kg)
     * Peso volumétrico = volumen del paquete / 5000
     */
    public double calcularPesoVolumetrico() {
       double temp1;
       temp1= calcularVolumen()/5000;
       return temp1;
    }

    /**
     *  Devuelve el peso facturable de un paquete
     *  Siempre es el valor mayor entre su peso real y su peso volumétrico
     *      
     */
    public double calcularPesoFacturable() {
        double temp1;
        temp1= calcularPesoVolumetrico()/peso;
        return temp1;
    }


    /**
     * Devuelve una copia exacta al objeto actual
     * Se obtienen copias también de los objetos que contenga
     */
    public Paquete obtenerCopia() {
        return new Paquete(dimension,peso);
        
    }

    /**
     * Representación textual del paquete
     *  (leer enunciado)
     */
    public String toString() {
       return dimension.toString() + String.format("%20s","Peso real:") + String.format("%10.2f",getPeso()) + "(KG)" + "\n" + String.format("%20s","Volumen:") + String.format ("%10.2f",calcularVolumen()) + "(cm3)" + "\n" + String.format("%20s","Peso volumetrico:") + String.format("%10.2f",calcularPesoVolumetrico()) + "(KG)" + "\n";
    }
    
     /**
     * Muestra en pantalla el objeto actual
     * Este método se incluye como método de prueba
     * de la clase Paquete
     */
    public void print() {
        System.out.println(this.toString());
    }

    

}
