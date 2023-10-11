
public class Cliente {
    String nombre;
    String numeroTel;
    String preferencia;

    public Cliente(String nombre, String numeroTel, String preferencia) {
        this.nombre = nombre;
        this.numeroTel = numeroTel;
        this.preferencia = preferencia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumeroTel() {
        return numeroTel;
    }

    public void setNumeroTel(String numeroTel) {
        this.numeroTel = numeroTel;
    }

    public String getPreferencia() {
        return preferencia;
    }

    public void setPreferencia(String preferencia) {
        this.preferencia = preferencia;
    }
    
    
}
