package periytymisesimerkki;

public class LainaTili extends Tili {
    private double korko;
    private int lainaAikaVuosia;

    public LainaTili(){

    }

    public LainaTili(double saldo, String nimi, String tilinumero, double korko, int lainaAikaVuosia) {
        super(saldo, nimi, tilinumero);
        this.korko = korko;
        this.lainaAikaVuosia = lainaAikaVuosia;
    }
    public double getKorko() {
        return korko;
    }
    public void setKorko(double korko) {
        this.korko = korko;
    }
    public int getLainaAikaVuosia() {
        return lainaAikaVuosia;
    }
    public void setLainaAikaVuosia(int lainaAikaVuosia) {
        this.lainaAikaVuosia = lainaAikaVuosia;
    }

    


}
