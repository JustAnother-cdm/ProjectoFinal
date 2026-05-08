package model;

public class Atraccion {
    private String nombre;
    private Zona theZona;
    private EstadoAtraccion estadoAtraccion;
    private int identificador;
    private int capacidadMaxima;
    private int edadMinima;
    private int contadorVisitantes;
    private float alturaMinima;
    private float[] costoAdicionalTickets = new float[2];

    private int TiempoEsperaEstimadoMinutos = 0;
    private String razonCierre;

    public Atraccion(String nombre, Zona theZona, EstadoAtraccion estadoAtraccion, int identificador, int capacidadMaxima, int edadMinima, int contadorVisitantes, float alturaMinima, float[] costoAdicionalTickets) {
        this.nombre = nombre;
        this.theZona = theZona;
        this.estadoAtraccion = estadoAtraccion;
        this.identificador = identificador;
        this.capacidadMaxima = capacidadMaxima;
        this.edadMinima = edadMinima;
        this.contadorVisitantes = contadorVisitantes;
        this.alturaMinima = alturaMinima;
        this.costoAdicionalTickets = costoAdicionalTickets;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public int getEdadMinima() {
        return edadMinima;
    }

    public void setEdadMinima(int edadMinima) {
        this.edadMinima = edadMinima;
    }

    public int getContadorVisitantes() {
        return contadorVisitantes;
    }

    public void setContadorVisitantes(int contadorVisitantes) {
        this.contadorVisitantes = contadorVisitantes;
    }

    public float getAlturaMinima() {
        return alturaMinima;
    }

    public void setAlturaMinima(float alturaMinima) {
        this.alturaMinima = alturaMinima;
    }

    public float[] getCostoAdicionalTickets() {
        return costoAdicionalTickets;
    }

    public void setCostoAdicionalTickets(float[] costoAdicionalTickets) {
        this.costoAdicionalTickets = costoAdicionalTickets;
    }

    public int getTiempoEsperaEstimadoMinutos() {
        return TiempoEsperaEstimadoMinutos;
    }

    public void setTiempoEsperaEstimadoMinutos(int tiempoEsperaEstimadoMinutos) {
        TiempoEsperaEstimadoMinutos = tiempoEsperaEstimadoMinutos;
    }

    public String getRazonCierre() {
        return razonCierre;
    }

    public void setRazonCierre(String razonCierre) {
        this.razonCierre = razonCierre;
    }

    public int calcularTiempoEspera(){
        int estimado = (10*contadorVisitantes)/2;
        setTiempoEsperaEstimadoMinutos(estimado);
        return getTiempoEsperaEstimadoMinutos();
    }

    public EstadoAtraccion getEstadoAtraccion() {
        return estadoAtraccion;
    }

    public void setEstadoAtraccion(EstadoAtraccion estadoAtraccion) {
        this.estadoAtraccion = estadoAtraccion;
    }

    public Boolean actualizarEstado(EstadoAtraccion estado, String razonOpcional){
        if (this.estadoAtraccion.equals(estado)){
            return false;
        } else if (estado.equals(EstadoAtraccion.EN_MANTENIMIETO) || estado.equals(EstadoAtraccion.CERRADA)) {
            setEstadoAtraccion(estado);
            setRazonCierre(razonOpcional);
            //Aqui irá la funcionso para mandar notificacion
            return true;
        }
        else {
            setEstadoAtraccion(estado);
            return  true;
        }
    }
}
