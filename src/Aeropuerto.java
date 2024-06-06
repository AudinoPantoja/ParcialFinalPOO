public class Aeropuerto {

    String codigo;
    String nombre;
    String poblacion;
    String pais;
    int GMT;

    public Aeropuerto(String codigo, String nombre, String poblacion, String pais, int GMT) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.poblacion = poblacion;
        this.pais = pais;
        this.GMT = GMT;
    }
    public String getCodigo() {
        return codigo;
    }
   public String getNombre() {
        return nombre;
    }
}