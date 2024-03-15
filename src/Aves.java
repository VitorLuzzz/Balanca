public class Aves extends Produtos {
    public String Galo;
    public String Galinha;
    public String Galeto;
    public String Asa;
    public String Coxa;
    public String Sobrecoxa;

    public Aves(String galo, String galinha, String galeto, String asa, String coxa, String sobrecoxa) {
        Galo = galo;
        Galinha = galinha;
        Galeto = galeto;
        Asa = asa;
        Coxa = coxa;
        Sobrecoxa = sobrecoxa;
    }

    public String getGalo() {
        return Galo;
    }

    public void setGalo(String galo) {
        Galo = galo;
    }

    public String getGalinha() {
        return Galinha;
    }

    public void setGalinha(String galinha) {
        Galinha = galinha;
    }

    public String getGaleto() {
        return Galeto;
    }

    public void setGaleto(String galeto) {
        Galeto = galeto;
    }

    public String getAsa() {
        return Asa;
    }

    public void setAsa(String asa) {
        Asa = asa;
    }

    public String getCoxa() {
        return Coxa;
    }

    public void setCoxa(String coxa) {
        Coxa = coxa;
    }

    public String getSobrecoxa() {
        return Sobrecoxa;
    }

    public void setSobrecoxa(String sobrecoxa) {
        Sobrecoxa = sobrecoxa;
    }
}
