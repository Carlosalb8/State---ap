
public class AeronaveEstadoEmEspera extends AeronaveEstado {
    private static AeronaveEstadoEmEspera instance = new AeronaveEstadoEmEspera();

    private AeronaveEstadoEmEspera() {
    }

    public static AeronaveEstadoEmEspera getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Em espera";
    }

    public boolean decolar(Aeronave aeronave) {
        aeronave.setEstado(AeronaveEstadoDecolando.getInstance());
        return true;
    }

    public boolean pousar(Aeronave aeronave) {
        aeronave.setEstado(AeronaveEstadoPousada.getInstance());
        return true;
    }

    // Implementação da transição para o estado Voando
    public boolean voar(Aeronave aeronave) {
        aeronave.setEstado(AeronaveEstadoVoando.getInstance());
        return true;
    }
}