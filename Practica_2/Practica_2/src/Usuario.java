
/**
 *
 * @author Sebastian
 */
public class Usuario {

    private String Nombre;
    private String Apellidos;
    private String TipoID;
    private String Identificacion;
    private String Residencia;
    private String Celular;
    private String Nacionalidad;
    private String Email;
    private String Contraseña;

    public Usuario() {
    }
    
    public Usuario(String Nombre, String Apellidos, String TipoID, String Identificacion, String Residencia, String Celular, String Nacionalidad, String Email, String Contraseña) {
        this.Nombre = Nombre;
        this.Apellidos = Apellidos;
        this.TipoID = TipoID;
        this.Identificacion = Identificacion;
        this.Residencia = Residencia;
        this.Celular = Celular;
        this.Nacionalidad = Nacionalidad;
        this.Email = Email;
        this.Contraseña = Contraseña;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public String getTipoID() {
        return TipoID;
    }

    public void setTipoID(String TipoID) {
        this.TipoID = TipoID;
    }

    public String getIdentificacion() {
        return Identificacion;
    }

    public void setIdentificacion(String Identificacion) {
        this.Identificacion = Identificacion;
    }

    public String getResidencia() {
        return Residencia;
    }

    public void setResidencia(String Residencia) {
        this.Residencia = Residencia;
    }

    public String getCelular() {
        return Celular;
    }

    public void setCelular(String Celular) {
        this.Celular = Celular;
    }

    public String getNacionalidad() {
        return Nacionalidad;
    }

    public void setNacionalidad(String Nacionalidad) {
        this.Nacionalidad = Nacionalidad;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getContraseña() {
        return Contraseña;
    }

    public void setContraseña(String Contraseña) {
        this.Contraseña = Contraseña;
    }
    
    
}
