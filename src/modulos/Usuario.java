/*
 * @author Torres Cruz Kevin Alan
 */

package modulos;

public class Usuario 
{
    // Atributos privados
    private String nombre;
    private String correo;
    private String rol;

    // Constructor por omisión (sin parámetros)
    public Usuario() 
    {
        this.nombre = "";
        this.correo = "";
        this.rol = "";
    }

    // Constructor con parámetros
    public Usuario(String nombre, String correo, String rol) 
    {
        this.nombre = nombre;
        this.correo = correo;
        this.rol = rol;
    }

    // Getters
    public String getNombre() 
    {
        return nombre;
    }

    public String getCorreo() 
    {
        return correo;
    }

    public String getRol() 
    {
        return rol;
    }

    // Setters
    public void setNombre(String nombre) 
    {
        this.nombre = nombre;
    }

    public void setCorreo(String correo) 
    {
        this.correo = correo;
    }

    public void setRol(String rol)
    {
        this.rol = rol;
    }

    // Método equals para comparar usuarios
    @Override
    public boolean equals(Object obj) 
    {
        if (this == obj) 
        	return true; // Comparación por referencia
        if (obj == null || getClass() != obj.getClass()) 
        	return false; // Verifica tipo

        Usuario usuario = (Usuario) obj; // Cast del objeto
        return nombre.equals(usuario.nombre) &&
               correo.equals(usuario.correo) &&
               rol.equals(usuario.rol); // Comparación de atributos
    }

}
