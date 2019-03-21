
package EjercicioPOO10;


public class Futbolista extends Persona{
    
    private int dorsal;
    private int posicion;

    public Futbolista(int dorsal, int posicion, String nombre, String apellido, int edad) {
        super(nombre, apellido, edad);
        this.dorsal = dorsal;
        this.posicion = posicion;
    }

    public int getDorsal() {
        return dorsal;
    }

    public int getPosicion() {
        return posicion;
    }

    @Override
    public String toString() {
        return "Futbolista: " +super.toString()+ "\n Dorsal: " + dorsal + "\n Posicion: " + posicion;
        
        
    }
    
    
    
}
