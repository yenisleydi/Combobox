package Pojo;

public class Cliente {
    private String nombre;
    private String apellidoP;
    private String apellidoM;
    private String estado;
    private String ciudad;
    private String telefono;
    private String correo;
    private String colonia;
    private String codigoPostal;

    public Cliente(String nombre, String apellidoP, String apellidoM, String estado, String ciudad, String telefono, String correo, String colonia, String codigoPostal) {
        this.nombre = nombre;
        this.apellidoP = apellidoP;
        this.apellidoM = apellidoM;
        this.estado = estado;
        this.ciudad = ciudad;
        this.telefono = telefono;
        this.correo = correo;
        this.colonia = colonia;
        this.codigoPostal = codigoPostal;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidoP() {
        return apellidoP;
    }

    public String getApellidoM() {
        return apellidoM;
    }

    public String getEstado() {
        return estado;
    }

    public String getCiudad() {
        return ciudad;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public String getColonia() {
        return colonia;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }
}
