import Controlador.Main;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

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
    public void ConditionalCoverage(){
        Main joc= new Main();
        int cont = joc.DecConCoverage3(0,-1);
        assertEquals(-2,cont);
    }

}
