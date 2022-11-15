import Controlador.Main;
import Model.Joc;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.testng.Assert;
import org.testng.annotations.Test;
import Model.Mocks.MockCodiSecret;
import Model.Mocks.MockJugador;
import Model.Mocks.MockJugador2;


import java.util.ArrayList;
import java.util.List;

import static org.testng.AssertJUnit.*;

public class TestMain {

    @Test
    public void ConstructorTest(){
        Main joc= new Main();
        boolean guanyat= false;
        if(joc.getGuanyat()==false || joc.getIntents()==0 || joc.getPerdut()==false){
            guanyat= true;
        }
        Assert.assertEquals(guanyat, true);

    }

    @Test
    public void Test_Update_Code(){
        MockJugador mock_jugador = new MockJugador();
        Main game = new Main();
        game.setJugador(mock_jugador);

        game.Inicia_Mock();
        Assert.assertTrue(game.codiCorrecte, "El codi no es correcte");
        assertEquals("El codi no es correcte","POGY", game.codiMock);
    }
    @Test
    public void Llista_codis(){
        List<String> pistesCorrectes  = new ArrayList<String>(List.of(
                "    ", "  F ", " FF ", "TF  ", "T  T", "TF T", "TFTF", "TTTT"));
        MockJugador2 jugador_2 = new MockJugador2();
        Main game = new Main();
        MockCodiSecret codi_secret = new MockCodiSecret();
        codi_secret.setCodiSecret("YYPO"); //Comprovem les pistes amb el codi
        game.setJugador(jugador_2);
        game.codisecretInterficie(codi_secret);
        game.mainMock();
        int i =0;
        for(Joc p: game.getTauler().getPistasTauler()){
            assertEquals(pistesCorrectes.get(i), p.getJoc());
            i++;
        }
    }


    //Test de pairwise testing parametritzat, provem les combinacions de
    // trios on i paregui la lletra R
    @ParameterizedTest
    @CsvFileSource(resources = "pairwise.csv",numLinesToSkip = 1,delimiterString = ";")
    public void Test_PairwiseCSV(final String v1,final String v2,final String v3,final String v4,final String pista) {
        String codigo = v1+v2+v3+v4;
        MockCodiSecret mockSecretCode = new MockCodiSecret();
        mockSecretCode.setCodiSecret("POGY");
        Main joc = new Main();
        joc.codisecretInterficie(mockSecretCode);
        joc.introdueixCodi(codigo);
        assertEquals(pista, joc.getTauler().getPistasTauler().get(0).getJoc());

    }

    //Test on implementem el path coverage
    @Test
    public void testPathCoverage(){
        Main joc = new Main();
        int intents = Main.Oportunitats;
        int contador;
        contador = joc.pathCoverage(true,intents,"POGY","");
        assertEquals(3,contador);

        intents = Main.Oportunitats;
        contador = joc.pathCoverage(false,intents,"POGY",null);
        assertEquals(7,contador);
    }


    //Comprovem que el numero d'intents sempre sigui menor de 8
    @Test
    public void Intents(){
        Main joc = new Main();
        int intents = Main.Oportunitats;
        int in = joc.getIntents();
        assertTrue(in<intents);
        assertFalse(in>intents);
    }
}
