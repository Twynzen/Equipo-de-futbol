
package EjercicioPOO10;


public class Doctor extends Persona{
    
    private String titulo;
    private int añoE;

    public Doctor(String titulo, int añoE, String nombre, String apellido, int edad) {
        super(nombre, apellido, edad);
        this.titulo = titulo;
        this.añoE = añoE;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getAñoE() {
        return añoE;
    }

    @Override
    public String toString() {
        return "Doctor: " +super.toString()+ "\n Titulo=" + titulo + " Años de expreiencia:"+ añoE;
    }

   

    
}
