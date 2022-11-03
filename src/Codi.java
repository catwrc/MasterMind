public class Codi {

    private String m_codigo;
    public Codi(){};
    public Codi(String codi) {
        this.m_codigo = codi.toUpperCase();
    }
    public String getCodigo() {return m_codigo;}
    public boolean checkCode(String code) {
        return this.m_codigo.equals(code);
    }
    public void setCode(String str){ this.m_codigo = str;}

}