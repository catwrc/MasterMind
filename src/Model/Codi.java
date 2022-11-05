package Model;

public class Codi {

    private String codi;
    public Codi(){};
    public Codi(String codi) {
        this.codi = codi.toUpperCase();
    }
    public String getCodi() {return codi;}
    public boolean TestCodi(String code) {
        return this.codi.equals(code);
    }
    public void setCodi(String codi){ this.codi = codi;}

}
