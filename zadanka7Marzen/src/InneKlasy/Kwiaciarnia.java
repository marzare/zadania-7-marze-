package InneKlasy;

public class Kwiaciarnia extends Sklep{
    public int powZaplecza;

    public Kwiaciarnia(String adres, float powierzchnia, String czyJestWC, int czynsz, int powZaplecza) {
        super(adres, powierzchnia, czyJestWC, czynsz);
        this.powZaplecza = powZaplecza;
    }

    @Override
    public String toString() {
       return ", powierzchnia zaplecza: " + powZaplecza;
    }

    @Override
    public void Polki(){
        System.out.println("Ilość półek, które zmieszczą się w sklepie: " + (powierzchnia/4));
    }
}
