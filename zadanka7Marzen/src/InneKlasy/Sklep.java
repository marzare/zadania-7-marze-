package InneKlasy;

public class Sklep {
    protected  String adres;
    protected  float powierzchnia;
    protected  String czyJestWC;
    protected int czynsz;

    public Sklep(String adres, float powierzchnia, String czyJestWC, int czynsz){
        this.adres = adres;
        this.powierzchnia = powierzchnia;
        this.czyJestWC = czyJestWC;
        this.czynsz = czynsz;
    }

    @Override
    public String toString() {
        return "Adres sklepu: " + adres + ", powierzchnia sklepu: " + powierzchnia + ", posiada WC: " + czyJestWC + ", czynsz wynosi: " + czynsz;
    }

    public void Polki(){
        System.out.println("Ilość półek, które zmieszczą się w sklepie: " + (powierzchnia/2));
    }

    public final float Hajs( int mies) {
        return (mies * czynsz);
    }
}
