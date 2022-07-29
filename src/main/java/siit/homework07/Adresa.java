package siit.homework07;

public class Adresa {
    public String oras;
    public String tara;

    public Adresa(String oras, String tara) {

        this.oras = oras;
        this.tara = tara;
    }

    public String getOras() {
        return oras;
    }

    public String getTara() {
        return tara;
    }

    @Override
    public String toString(){
        return "/ " + getTara() + " - " + getOras() + " /";
    }
}
