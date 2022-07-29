package siit.homework07;

public class Persoana {
    public String name;
    public Integer age;

    public Persoana(String name, Integer age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "{ Name: " + getName() + " | Age: " + getAge() + " years old }";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }

        if (obj.getClass() != this.getClass()) {
            return false;
        }

        final Persoana other = (Persoana) obj;
        if ((this.name == null) ? (other.name != null) : !this.name.equals(other.name)) {
            return false;
        }

        if (this.age != other.age) {
            return false;
        }

        return true;
    }
}
