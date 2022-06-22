package siit.homework03;

public class Novel extends Books{
    private String type;

    Novel(String name, int pages, String type) {
        super(name, pages);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    @Override
    public String toString(){
        return "{name= " + getName() + "// \n number of pages= " + getPages() + "// \n type=" + type +"}" + "\n";
    }
}
