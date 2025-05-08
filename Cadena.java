import java.util.Scanner;
public class Cadena{
    public static void main(String[] arg){
        //String nombre = "Rodrigo";
        //System.out.println("Nombre: " + nombre);
        Scanner almacenar = new Scanner(System.in);
        System.out.println("Escribe tu nombre");
        String nombre = almacenar.nextLine();

        System.out.println("Escribe tu Apellido");
        String apellido = almacenar.nextLine();

        System.out.println("Tu nombre es: " +nombre +" " +apellido);
        
    }
}