
import Model.Codi;
import Model.CodiSecret;
import Model.IntroduirColors;
import Model.Joc;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.junit.jupiter.params.ParameterizedTest;

import static org.testng.AssertJUnit.*;

public class TestIntroduirColors {

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


        @ParameterizedTest
        @CsvFileSource(resources = "lletres.csv",numLinesToSkip = 1,delimiterString = ";")
        public void Parametritzacio(final String v0, final String v2,
                                                  final String v3, final String v4v,
                                                  final String v4nv, final String v5,
                                                  final String v6, final String v20) {

            IntroduirColors i = new IntroduirColors();
            //Valors nulls
            //boolean code_correct = i.esCorrecte(null);
            //Assert.assertFalse(code_correct);

            //Limit 2
            assertFalse(i.esCorrecte(v2));
            assertFalse(i.esCorrecte(v3));
    }
        /*@ParameterizedTest
        @CsvFileSource(emptyValue = "/lletres.csv",numLinesToSkip = 1,delimiterString = ";")
        public void Test_Particio_Equivalent_CSV(final String v0,final String v2,
        final String v3,final String v4v,
        final String v4nv,final String v5,
        final String v6,final String v20) {
            Model.IntroduirColors i = new Model.IntroduirColors();
            //Valors nulls
            //boolean code_correct = i.esCorrecte(null);
            //Assert.assertFalse(code_correct);

            //Limit 2
            assertFalse(i.esCorrecte(v2));

            //Limit 3
            code_correct = i.esCorrecte(v3);
            assertFalse(code_correct);

            //Limit 4 validos
            code_correct = i.esCorrecte(v4v);
            assertTrue(code_correct);

            //Limit 4 no validos
            code_correct = i.esCorrecte(v4nv);
            assertFalse(code_correct);

            //Limit 5 no validos
            code_correct = i.esCorrecte(v5);
            assertFalse(code_correct);

            //Limit 6
            code_correct = i.esCorrecte(v6);
            assertFalse(code_correct);

            //Limit 20
            code_correct = i.esCorrecte(v20);
            assertFalse(code_correct);*/



        }







