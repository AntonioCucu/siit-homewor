package siit.homework02;

public class SalesRepresentative {
    public int worthOfSales;
    public int quota;
    public int sales;

    //Creating the objects for our array - "Sales guy 1 has 10 sales with a quota of 500$. He has achieved 5000$ worth of sales.";
    SalesRepresentative(int quota, int sales){
        this.quota = quota;
        this.sales = sales;
        this.worthOfSales = quota * sales;
    }

    public int getWorthOfSales() {
        return worthOfSales;
    }

    public void setWorthOfSales(int worthOfSales) {
        this.worthOfSales = worthOfSales;
    }

    public int getQuota() {
        return quota;
    }

    public void setQuota(int quota) {
        this.quota = quota;
    }

    public int getSales() {
        return sales;
    }

    public void setSales(int sales) {
        this.sales = sales;
    }
}
