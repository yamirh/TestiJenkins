package laskin;

public class Laskin {

    private double tulos;

    public Laskin() {
        this.tulos = 0.0;
    }

    public void nollaa() {
        tulos = 0;
    }

    public double annaTulos() {
        return tulos;
    }

    public double lisaa(double luku) {
        this.tulos += luku;
        return this.tulos;
    }

    public double vahenna(double luku) {
        this.tulos -= luku;
        return this.tulos;
    }
    
    public void kerro(double n) {
        tulos *= n;
    }

    public void jaa(double n) {
        if (n == 0.0) throw new IllegalArgumentException("Nollalla ei voi jakaa");
        tulos /= n;
    }

    public double nelio(double luku) {
        return Math.pow(luku, 2);
    }
    
    public void neliojuuri(double n) {
        if (n < 0) throw new IllegalArgumentException("Negatiivisella luvulla ei ole neliöjuurta");
        tulos = Math.sqrt(n);
    }

    public void virtaON() {
        tulos = 0;
    }

    public void virtaOFF() {
        // tähän voisi laittaa.
    }
}