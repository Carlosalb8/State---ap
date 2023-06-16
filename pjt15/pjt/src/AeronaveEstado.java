public abstract class AeronaveEstado {
    public AeronaveEstado() {
    }

    public abstract String getEstado();

    public boolean voar(Aeronave aeronave) {
        aeronave.setEstado(AeronaveEstadoVoando.getInstance());
        return true;
    }

    public boolean pousar(Aeronave aeronave) {
        aeronave.setEstado(AeronaveEstadoPousada.getInstance());
        return true;
    }

    public boolean decolar(Aeronave aeronave) {
        aeronave.setEstado(AeronaveEstadoDecolando.getInstance());
        return true;
    }

    public boolean esperar(Aeronave aeronave) {
        aeronave.setEstado(AeronaveEstadoEmEspera.getInstance());
        return true;
    }

}
