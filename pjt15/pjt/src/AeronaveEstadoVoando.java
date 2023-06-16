public class AeronaveEstadoVoando extends AeronaveEstado {
    private static AeronaveEstadoVoando instance = new AeronaveEstadoVoando();

    private AeronaveEstadoVoando() {
    }

    public static AeronaveEstadoVoando getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Voando";
    }

    public boolean pousar(Aeronave aeronave) {
        aeronave.setEstado(AeronaveEstadoPousada.getInstance());
        return true;
    }

    public boolean esperar(Aeronave aeronave) {
        aeronave.setEstado(AeronaveEstadoEmEspera.getInstance());
        return true;
    }
}
