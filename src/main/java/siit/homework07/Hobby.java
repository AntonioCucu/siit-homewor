package siit.homework07;

import java.util.List;

public class Hobby {

    public String name;
    public int freq;
    public List<Adresa> adresaHobbyList;

    public Hobby(String name, int freq, List<Adresa> adresaHobbyList) {

        this.name = name;
        this.freq = freq;
        this.adresaHobbyList = adresaHobbyList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Adresa> getAdresaHobbyList() {
        return adresaHobbyList;
    }

    public void setAdresaHobbyList(List<Adresa> adresaHobbyList) {
        this.adresaHobbyList = adresaHobbyList;
    }

    @Override
    public String toString() {
        return "{ Hobby: " + getName() + " / Poate fi practicat in: " + getAdresaHobbyList() + "}\n";
    }
}
