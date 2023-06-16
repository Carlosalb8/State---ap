import org.junit.Assert;
import org.junit.Test;

public class AeronaveTest {

    @Test
    public void testAeronave() {
        Aeronave aeronave = new Aeronave("ABC123");

        // Verificar o estado inicial
        Assert.assertEquals("Em espera", aeronave.getNomeEstado());

        // Tentar decolar
        boolean decolou = aeronave.decolar();
        Assert.assertTrue(decolou);
        Assert.assertEquals("Decolando", aeronave.getNomeEstado());

        // Tentar pousar
        boolean pousou = aeronave.pousar();
        Assert.assertTrue(pousou);
        Assert.assertEquals("Pousada", aeronave.getNomeEstado());

        // Tentar voar
        boolean voou = aeronave.voar();
        Assert.assertTrue(voou);

        // Tentar esperar
        boolean esperou = aeronave.esperar();
        Assert.assertTrue(esperou);
        Assert.assertEquals("Em espera", aeronave.getNomeEstado());
    }
}
