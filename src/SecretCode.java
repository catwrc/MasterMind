import java.util.concurrent.ThreadLocalRandom;
public class SecretCode{
   public static int CODE_LENGHT = 4;

   private String code;

   public String options_of_colors = "RBWOPGY"; // Red, Blue, White, Orange, Purple, Green, Yellow,

   public SecretCode(String a)
   {

      this.code = randomSecretCode();


   }
   public String getSecretCode(){

      return this.code;

   }
   public String randomSecretCode()
   {

      String cadena = "";
      for (int x = 0; x < CODE_LENGHT; x++) {
         int index = numberRandomInRange(0, options_of_colors.length() - 1);
         char random = options_of_colors.charAt(index);
         cadena += random;
      }
      return cadena;
   }

   public static int numberRandomInRange(int min, int max) {
      // nextInt regresa en rango pero con límite superior exclusivo, por eso sumamos 1
      return ThreadLocalRandom.current().nextInt(min, max + 1);
   }

}




