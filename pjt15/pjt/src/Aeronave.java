public class Aeronave {
    private String id;
    private AeronaveEstado estado = AeronaveEstadoEmEspera.getInstance();

    public Aeronave(String id) {
        this.id = id;
    }

    public void setEstado(AeronaveEstado estado) {
        this.estado = estado;
    }

    public boolean voar() {
        return this.estado.voar(this);
    }

    public boolean pousar() {
        return this.estado.pousar(this);
    }

    public boolean decolar() {
        return this.estado.decolar(this);
    }

    public boolean esperar() {
        return this.estado.esperar(this);
    }

    public String getNomeEstado() {
        return this.estado.getEstado();
    }

    public String getId() {
        return this.id;
    }

    public AeronaveEstado getEstado() {
        return this.estado;
    }
}