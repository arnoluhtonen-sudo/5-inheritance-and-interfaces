package periytymisesimerkki;

public class Tili {

    private double saldo;
    private String omistajanNimi;
    private String tilinumero;

    public Tili() {

    }

    public Tili(double saldo, String omistajanNimi, String tilinumero) {
        this.saldo = saldo;
        this.omistajanNimi = omistajanNimi;
        this.tilinumero = tilinumero;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public String getOmistajanNimi() {
        return omistajanNimi;
    }
    public void setOmistajanNimi(String omistajanNimi) {
        this.omistajanNimi = omistajanNimi;
    }
    public String getTilinumero() {
        return tilinumero;
    }
    public void setTilinumero(String tilinumero) {
        this.tilinumero = tilinumero;
    }


    

}
