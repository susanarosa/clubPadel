/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clubpadel;

/**
 *
 * @author Soro
 */
public class SocioClubPadel {
    private int codigo;
    private String nombreApellidos;
    private byte edad;
    private String telefono;
    private String correoE;
    private boolean padresSonSocios;
    private String direccion;

    public SocioClubPadel(int codigo, String nombreApellidos, byte edad, String telefono, String correoE, boolean padresSonSocios) {
        this.codigo = codigo;
        this.nombreApellidos = nombreApellidos;
        this.edad = edad;
        this.telefono = telefono;
        this.correoE = correoE;
        this.padresSonSocios = padresSonSocios;
        this.direccion="una direccion";
    }

    public SocioClubPadel() {
    }

    @Override
    public String toString() {
        String salida;
        
        salida = "Datos del socio\n";
        salida += "----------------------------\n";
        salida += "Código: " + this.codigo + "\n";
        salida += "Nombre: " + this.nombreApellidos + "\n";
        salida += "Edad: " + this.edad + "\n";
        salida += "Telefono: " + this.telefono + "\n";
        salida += "Correo-e: " + this.correoE + "\n";
        
        return salida;
    }
    
    
    
    
    // Getters y Setters
    public void setDireccion(String direccion){ this.direccion = direccion;}
    public String getDireccion(){ return direccion;}
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombreApellidos() {
        return nombreApellidos;
    }

    public void setNombreApellidos(String nombreApellidos) {
        this.nombreApellidos = nombreApellidos;
    }

    public byte getEdad() {
        return edad;
    }

    public void setEdad(byte edad) {
        this.edad = edad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreoE() {
        return correoE;
    }

    public void setCorreoE(String correoE) {
        this.correoE = correoE;
    }

    public boolean isPadresSonSocios() {
        return padresSonSocios;
    }

    public void setPadresSonSocios(boolean padresSonSocios) {
        this.padresSonSocios = padresSonSocios;
    }
    
    
    
}
