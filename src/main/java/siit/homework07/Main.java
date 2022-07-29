package siit.homework07;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Persoana gigel = new Somer("Gigel", 32);
        Persoana antonio = new Angajat("Antonio", 27);
        Persoana filip = new Student("Filip", 21);
        Persoana paul = new Angajat("Paul", 26);

        Adresa iasi = new Adresa("Iasi", "Romania");
        Adresa bucuresti = new Adresa("Bucuresti", "Romania");
        Adresa worldwide = new Adresa("Anywhere", "Everywhere");
        Adresa tulcea = new Adresa("Tulcea", "Romania");
        Adresa innsbruck = new Adresa("Innsbruck", "Austria");

        List<Adresa> adresaCoding = List.of(worldwide);
        List<Adresa> adresaBw = Arrays.asList(tulcea, iasi);
        List<Adresa> adresaSnowboarding = List.of(innsbruck);
        List<Adresa> adresaAirsoft = Arrays.asList(bucuresti, iasi);

        Hobby coding = new Hobby("Coding", 7, adresaCoding);
        Hobby birdwatching = new Hobby("Bird Watching", 1, adresaBw);
        Hobby snowboarding = new Hobby("Snowboarding", 3, adresaSnowboarding);
        Hobby airsoft = new Hobby("Airsoft", 2, adresaAirsoft);

        Comparator<Persoana> nameComp = (Persoana o1, Persoana o2) -> (o1.getName().compareTo(o2.getName()));
        Comparator<Persoana> ageComp = (Persoana o1, Persoana o2) -> (o1.getAge().compareTo(o2.getAge()));

        Set<Persoana> dupaNume = new TreeSet<>(nameComp);
        dupaNume.add(gigel);
        dupaNume.add(antonio);
        dupaNume.add(filip);
        dupaNume.add(paul);

        Iterator<Persoana> itr1 = dupaNume.iterator();
        while(itr1.hasNext()){
            System.out.println(itr1.next());
        }

        System.out.println("-----------------------------------\n");

        Set<Persoana> dupaVarsta = new TreeSet<>(ageComp);
        dupaVarsta.add(gigel);
        dupaVarsta.add(antonio);
        dupaVarsta.add(filip);
        dupaVarsta.add(paul);

        Iterator<Persoana> itr2 = dupaVarsta.iterator();
        while(itr2.hasNext()){
            System.out.println(itr2.next());
        }

        System.out.println("-----------------------------------\n");

        List<Hobby> gigelHobby = List.of(birdwatching);
        List<Hobby> antonioHobby = Arrays.asList(coding, snowboarding);
        List<Hobby> filipHobby = List.of(coding);
        List<Hobby> paulHobby = List.of(birdwatching, airsoft);

        Map<Persoana, List<Hobby>> hobbyMap = new HashMap<>();
        hobbyMap.put(gigel, gigelHobby);
        hobbyMap.put(antonio, antonioHobby);
        hobbyMap.put(filip, filipHobby);
        hobbyMap.put(paul, paulHobby);

        for(Persoana persoana : hobbyMap.keySet()) {
            System.out.println(persoana + " -> " + hobbyMap.get(persoana));
        }
    }
}
