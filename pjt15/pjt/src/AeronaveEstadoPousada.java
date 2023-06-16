public class AeronaveEstadoPousada extends AeronaveEstado {
    private static AeronaveEstadoPousada instance = new AeronaveEstadoPousada();

    private AeronaveEstadoPousada() {
    }

    public static AeronaveEstadoPousada getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Pousada";
    }

}
