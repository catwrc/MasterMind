import Model.IntroduirColors;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.junit.jupiter.params.ParameterizedTest;

import static org.testng.AssertJUnit.*;

public class TestIntroduirColors {

    //Test de particions equivalents
    @Test
    public void esCorrecteTest(){
        IntroduirColors i = new IntroduirColors();
        //valor correcte
        String t1 = "GYOP";
        Assert.assertTrue(i.esCorrecte(t1));
        //valor correcte pero massa gran
        String t2 = "GYOPP";
        Assert.assertFalse(i.esCorrecte(t2));
        //valor correcte pero massa petit
        String t3 = "GYO";
        //valor incorrecte
        Assert.assertFalse(i.esCorrecte(t3));
        String t4 = "aaaaaa";
        //valor incorrecte
        Assert.assertFalse(i.esCorrecte(t4));
        String t5 = "1";
        //Conjunt buit
        Assert.assertFalse(i.esCorrecte(t5));
        String t6 = "";
        Assert.assertFalse(i.esCorrecte(t6));
        //Valor null
        Assert.assertFalse(i.esCorrecte(null));
    }


        //test de particions equivalents parametritzat
        @ParameterizedTest
        @CsvFileSource(resources = "lletres.csv",numLinesToSkip = 1,delimiterString = ";")
        public void Parametritzacio(final String test1, final String test2,
                                                  final String test3, final String test4,
                                                  final String test5, final String test6,
                                                  final String test7, final String test8) {

            IntroduirColors i = new IntroduirColors();

            //valors null
            assertFalse(i.esCorrecte(test1));
            //valors fora de la frontera
            assertFalse(i.esCorrecte(test2));
            //valors limit frontera
            assertFalse(i.esCorrecte(test3));
            //valors frontera
            assertFalse(i.esCorrecte(test4));
            //valors frontera
            assertFalse(i.esCorrecte(test5));
            //valors limit frontera
            assertFalse(i.esCorrecte(test6));
            //valors limit frontera
            assertFalse(i.esCorrecte(test7));
            //valors fora de la frontera
            assertFalse(i.esCorrecte(test8));

    }

        }







