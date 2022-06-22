package siit.homework03;

public class Album extends Books{
    private int qualityOfPaper;

    Album(String name, int pages, int qualityOfPaper) {
        super(name, pages);
        this.qualityOfPaper = qualityOfPaper;
    }

    public int getQualityOfPaper() {
        return qualityOfPaper;
    }

    public void setQualityOfPaper(int qualityOfPaper) {
        this.qualityOfPaper = qualityOfPaper;
    }
    @Override
    public String toString(){
        return "{name= " + getName() + "// \n number of pages= " + getPages() + "// \n paper quality=" + qualityOfPaper +"}" + "\n";
    }
}
