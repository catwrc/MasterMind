import Model.Codi;
import Model.CodiSecret;
import Model.Joc;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.testng.AssertJUnit.assertEquals;

public class TestJoc {
    Codi codi_usuari;
    CodiSecret codi_secret;

    @BeforeEach
    void setUp(){
        codi_secret = new CodiSecret();
        codi_usuari = new Codi();
    }

    @Test
    public void TestJoc() {

        //Coincideixen per complet els 2 codis
        codi_usuari.setCodi("RYGO");
        codi_secret.setCodiSecret("RYGO");
        Joc var = new Joc(codi_secret,codi_usuari);
        assertEquals("TTTT", var.getJoc());

        //Coincideix nomes una lletra en color i posicio
        codi_usuari.setCodi("OGYR");
        codi_secret.setCodiSecret("PYYB");

        var = new Joc(codi_secret,codi_usuari);

        assertEquals("  T ", var.getJoc());

        //Coincideix tot menys una lletra en color
        codi_usuari.setCodi("OGYR");
        codi_secret.setCodiSecret("OGYB");

        var = new Joc(codi_secret,codi_usuari);

        assertEquals("TTT ", var.getJoc());

        //Coincideix 2 paraules pero no estan en la posicio correcta
        codi_secret.setCodiSecret("YOPB");
        codi_usuari.setCodi("RYOG");

        var = new Joc(codi_secret,codi_usuari);

        assertEquals(" FF ", var.getJoc());

        //Coincideix totes les paraules pero no estan en la posicio correcta
        codi_secret.setCodiSecret("YOPB");
        codi_usuari.setCodi("OYBP");

        var = new Joc(codi_secret,codi_usuari);

        assertEquals("FFFF", var.getJoc());

        //Coincideix totes les paraules pero nomes 2 estan en la posicio correcta
        codi_secret.setCodiSecret("YOPB");
        codi_usuari.setCodi("YOBP");

        var = new Joc(codi_secret,codi_usuari);

        assertEquals("TTFF", var.getJoc());

        //Coincideix 2 paraules una no esta correctament colocada i una altra no exixteix
        codi_secret.setCodiSecret("YOPB");
        codi_usuari.setCodi("YOBG");

        var = new Joc(codi_secret,codi_usuari);

        assertEquals("TTF ", var.getJoc());


    }

    //Test condition i desicion coverage
    @Test
    public void testConditionDecision(){

        //Primera desició a TRUE, segona desició a FALSE, tercera desició a TRUE
        codi_usuari.setCodi("OGYR");
        codi_secret.setCodiSecret("PYYB");
        Joc var = new Joc(codi_secret,codi_usuari);
        assertEquals("  T ", var.getJoc());

        //Primera desició a FALSE, segona desició a TRUE, tercera desició a TRUE
        codi_secret.setCodiSecret("YOPB");
        codi_usuari.setCodi("RYOG");

        var = new Joc(codi_secret,codi_usuari);

        assertEquals(" FF ", var.getJoc());

        //Primera desició a TRUE, segona desició a FALSE, tercera desició a FALSE
        var = new Joc(codi_secret,codi_usuari);
        codi_usuari.setCodi("RYGO");
        codi_secret.setCodiSecret("RYGO");

        var = new Joc(codi_secret,codi_usuari);
        assertEquals("TTTT", var.getJoc());

    }
}
