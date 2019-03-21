

/*Este ejercicio trata de practicar POO con polimorfismo pero termine 
muy enredado y no entendi el uso de arrays dinamicos, envio y guardado 
de datos para ser mostrados en pantalla
*/
package EjercicioPOO10;

import java.util.ArrayList;
import java.util.Scanner;




public class Principal {
    static Scanner entrada = new Scanner (System.in);
    static String nomEquipo;
    static int opc;
    static ArrayList<Persona> personas = new ArrayList<Persona>();
    public static void main (String []args){
        
        System.out.print("Digite el nombre del equipo:");
        nomEquipo = entrada.next();
        menu();
        
        
        
    }
    
    public static void menu(){
        
        
        
       
        
        
        
        do{
            System.out.println("***Bienvenido al menu del equipo "+nomEquipo+"***");
            System.out.println("Digite la opción que guste:"
                    + "\n 1.Viaje en equipo "
                    + "\n 2.Entrenamiento "
                    + "\n 3.Partido "
                    + "\n 4.Plan de entrenamiento "
                    + "\n 5.Entrevista "
                    + "\n 6.Curar lesion "
                    + "\n 7.Mostrar datos guardados");
            opc = entrada.nextInt();
            
        }while(opc<1||opc>6);
        switch(opc){
            case 1: viajeEquipo();
                    //1.Viaje en equipo 
                break;
            case 2: entrenamiento();
                    //2.Entrenamiento
                break;
            case 3: partido();
                    //3.Partido
                break;
            case 4: planEntrena();
                    //4.Plan de entrenamiento
                break;  
            case 5: entrevista();
                    //5.Entrevista
                break;
            case 6: curarHerida();
                    //6.Curar lesión
                break;
            case 7:mostrarResultados();
                break;
             
        } 
                
    }
    public static void viajeEquipo(){
        String lugar;
        System.out.print("Digite el lugar donde desea viajar el equipo "+nomEquipo+": ");
        lugar = entrada.next();
        System.out.println("El equipo "+nomEquipo+" viajara a "+lugar);
        
       System.out.println("Datos de viaje guardados, volviendo al menu..."); 
        menu();
    }
    
    public static void entrenamiento (){
        int dorsal,posicion, edad;
        boolean equipoLleno;
        String nombre,apellido;
        
            
        for(int i =0;i<4;i++){
        System.out.println("Digite el nombre de los jugadores y sus datos respectivos");
        System.out.print("Digite el nombre del jugador #"+(i+1)+": ");
        nombre = entrada.next();
        System.out.print("Digite el apellido del jugador #"+(i+1)+": ");
        apellido = entrada.next();
        System.out.print("Digite la edad del jugador #"+(i+1)+": ");
        edad = entrada.nextInt();
        System.out.print("Digite el numero de dorsal del jugador #"+(i+1)+": ");
        dorsal = entrada.nextInt();
        System.out.print("Digite la posición del jugador "+(i+1)+": ");
        posicion=entrada.nextInt();
        System.out.println("");
        
        //Guarde datos de jugadores
        Futbolista jugador = new Futbolista(dorsal,posicion,nombre,apellido,edad);
        personas.add(jugador);
                
        }
        equipoLleno =true;
        System.out.println("Datos de jugadores para entrenar guardados, volviendo al menu...");
        
         menu();
         
            System.out.println("El Equipo esta lleno, volviendo al menu...");
                      
        
         menu();
                
    }
    
    public static void partido(){
        System.out.println("Los jugadores juegan el partido" );
        System.out.println("VOLVIENDO AL MENU...");
        menu();
    }
    
    public static void planEntrena(){
        String nombre, apellido;
        int edad;
        System.out.println("DATOS DEL ENTRENADOR");
        System.out.print("Diga el nombre del entrenador: ");
        nombre = entrada.next();
        System.out.print("Diga el apellido del entrenador : ");
        apellido=entrada.next();
        System.out.print("Digite la edad del entrenador: ");
        edad=entrada.nextInt();
        
        Entrenador entrenador = new Entrenador();
        entrenador.toString();
      // nombro un entrenador para el equipo  
      System.out.println("VOLVIENDO AL MENU...");
        menu();
        
    }
    
    public static void entrevista(){
        
        
        System.out.println("En este momento el equipo "+nomEquipo+" tiene entrevistas con: "
                + "\nRCN"
                + "\nCaracol"
                + "\nCity Tv");
    }
    public static void curarHerida(){
        String titulo="Profesional",nombre,apellido;
        int añoExpe = 5,edad;
        
        System.out.print("Para curar la herida del jugador lesionado digite los siguientes datos:"
                + "\nEl nombre del doctor: ");
        nombre = entrada.next();
        System.out.print("El apellido del doctor: ");
        apellido = entrada.next();
        System.out.print("Digite la edad del doctor: ");
        edad=entrada.nextInt();
        
        
        
        
        Doctor doctor = new Doctor(titulo, añoExpe,nombre,apellido,edad);
       System.out.println("VOLVIENDO AL MENU...");
        menu();
        
    }
    public static void mostrarResultados(){
        //recorre el arreglo de poligonos
   
          System.out.println(personas);
    }
    
}
