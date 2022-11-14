package Model;

import Controlador.Main;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CodiSecret {
   public boolean secret;
   private String code;

   public CodiSecret(){

      this.code = randomSecretCode();
      this.secret = true;
   }
   public void setCodiSecret(String codi)
   {
      this.code = codi;
   }
   public String getSecretCode(){
      return this.code;
   }

   //Generem un codi secret de manera aleatoria
   public String randomSecretCode()
   {
      String code = "";
      Random random = new Random();
      List<String> aux = new ArrayList<>(Main.Colors);

      for(int i = 0; i< Main.numFil; i++){
         code += aux.get(random.nextInt(aux.size()));
      }
      return code;
   }

}




