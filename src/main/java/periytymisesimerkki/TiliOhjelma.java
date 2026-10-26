package periytymisesimerkki;

public class TiliOhjelma {
public static void main(String[] args) {
    Tili tili = new Tili();

    tili.setOmistajanNimi("Roope Ankka");
    tili.setSaldo(300);
    tili.setTilinumero("FI1315");

    Tili lainaTili = new LainaTili();

    lainaTili.setSaldo(399000);
    System.out.println("Lainaa tuolla tilillä on: " + lainaTili.getSaldo());
    
    if(lainaTili instanceof LainaTili){
        System.out.println("TILI ON TYYPILTÄÄN LainaTili");
    }
}
}
