import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
public class SecretCode{
   public static int CODE_LENGHT = 4;
   //private  String secretCode;
   public boolean is_secret;
   private String code;

   public String options_of_colors = "RBWOPGY"; // Red, Blue, White, Orange, Purple, Green, Yellow,
   public SecretCode(){

      this.code = randomSecretCode();
      this.is_secret = true;
   }
   public void setSecretCode(String code)
   {
      this.code = code;
      //this.code = randomSecretCode();
      //this.code = "RBWO".toUpperCase();
   }
   public String getSecretCode(){

      return this.code;

   }
   public String randomSecretCode()
   {
      // general codigo secreto aleatorio
      String code = "";
      Random random = new Random();
      List<String> aux = new ArrayList<String>(Main.Colors);

      for(int i = 0; i< Main.numFil; i++){
         code += aux.get(random.nextInt(aux.size()));
      }
      return code;
   }

   public static int numberRandomInRange(int min, int max) {
      // nextInt regresa en rango pero con límite superior exclusivo, por eso sumamos 1
      return ThreadLocalRandom.current().nextInt(min, max + 1);
   }

}




