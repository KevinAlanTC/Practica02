/*
 * @author Torres Cruz Kevin Alan
 */

import modulos.Usuario;
import java.util.Scanner;

public class Main 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        
        // Pedir nombre
        System.out.println("Ingrese su nombre:");
        System.out.print("> ");
        String nombre = scanner.nextLine();
        
        // Pedir correo con validación
        String correo = "";
        boolean correoValido = false;
        while (!correoValido) {
            System.out.println("Ingrese su correo:");
            System.out.print("> ");
            correo = scanner.nextLine();
            
         // Validar correo (contiene @ y termina con .com)
            if (esCorreoValido(correo)) 
                correoValido = true;
            else
                System.out.println("Correo no valido, intente de nuevo.");
        }
        
        // Pedir rol con validación
        String rol = "";
        boolean rolValido = false;
        while (!rolValido) 
        {
            System.out.println("Seleccione su rol:");
            System.out.println("1. Empleado");
            System.out.println("2. Administrador");
            System.out.print("> ");
            
            String opcion = scanner.nextLine();
            
            if (opcion.equals("1")) 
            {
                rol = "Empleado";
                rolValido = true;
            } 
            else if (opcion.equals("2")) 
            {
                rol = "Administrador";
                rolValido = true;
            } 
            else 
                System.out.println("Opcion no valida, intente de nuevo.");
        }
        
        // Crear objeto Usuario
        Usuario usuario = new Usuario(nombre, correo, rol);
        
        // Mostrar mensaje de confirmación
        System.out.println("\nUsuario creado con exito!");
        
        // Imprimir atributos usando getters
        System.out.println("Nombre: " + usuario.getNombre());
        System.out.println("Correo: " + usuario.getCorreo());
        System.out.println("Rol: " + usuario.getRol());
        
        scanner.close();
    }
    
    // Método para validar correo de forma más exhaustiva
    private static boolean esCorreoValido(String correo) 
    {
        // Verificar que no esté vacío
        if (correo == null || correo.trim().isEmpty())
            return false;
        
        // Verificar que contenga exactamente un @
        int contadorArroba = 0;
        int posicionArroba = -1;
        for (int i = 0; i < correo.length(); i++) 
        {
            if (correo.charAt(i) == '@') 
            {
                contadorArroba++;
                posicionArroba = i;
            }
        }
        
        // Verificar que no contenga espacios
        if (correo.contains(" "))
            return false;
        
        if (contadorArroba != 1)
            return false;
        
        // Verificar que termine con .com
        if (!correo.endsWith(".com"))
            return false;
        
        // Verificar que haya texto antes del @
        if (posicionArroba == 0)
            return false;
        
        // Verificar que haya dominio entre @ y .com
        String dominio = correo.substring(posicionArroba + 1, correo.length() - 4);
        if (dominio.isEmpty())
            return false;
        
        return true;
    }
}