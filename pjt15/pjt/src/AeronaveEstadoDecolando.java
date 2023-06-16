public class AeronaveEstadoDecolando extends AeronaveEstado {
    private static AeronaveEstadoDecolando instance = new AeronaveEstadoDecolando();

    private AeronaveEstadoDecolando() {
    }

    public static AeronaveEstadoDecolando getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Decolando";
    }

    public boolean voar(Aeronave aeronave) {
        aeronave.setEstado(AeronaveEstadoVoando.getInstance());
        return true;
    }
}
