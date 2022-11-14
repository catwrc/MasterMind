package Model.Mocks;

import Model.SecretCode_Interficie;

public class MockCodiSecret implements SecretCode_Interficie {

    public String secretCode = "POGY";
    public boolean is_secret;

    public void setCodiSecret(String secretCode){
        this.secretCode = secretCode;
    }
    public String generateSecretCode(){
        return this.secretCode;
    }
    public String getSecretCode(){
        return this.secretCode;
    }
}
