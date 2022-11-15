import Model.CodiSecret;
import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.testng.annotations.Test;

public class TestCodiSecret {

    CodiSecret codi;

    @BeforeEach
    void Test1(){
        codi = new CodiSecret();
    }

    //Provem que la llargada del codi de secret sigui el correcte
    @Test
    public void Test2(){
        codi = new CodiSecret();
       String v_codi = codi.getSecretCode();
        Assert.assertEquals(v_codi.length(), 4);
    }

    //Provem que si  la llargada del codi no es correcta retorni false
    @Test
    public void Test3(){
        codi = new CodiSecret();
        String v_codi = codi.getSecretCode();
        Assert.assertNotEquals(v_codi.length(), 5);
        Assert.assertNotEquals(v_codi.length(), 3);
    }


    //Testejem que al crear un codi nou només es generi amb els colors correctes
    @Test
    public void Test4(){
        codi = new CodiSecret();
        String v_codi = codi.getSecretCode();
        boolean var = true;
        if(v_codi.length() == 4) {
            for (int x = 0; x < 4; x++) {
                char c = v_codi.charAt(x);
                if (c=='R'|| c=='Y'|| c=='G'|| c=='B'|| c=='O'|| c=='P') {
                } else {
                    var = false;
                    Assert.assertTrue(var);
                }
            }
            Assert.assertTrue(var);
        }
        else {
            var = false;
            Assert.assertTrue(var);
        }
    }
}

