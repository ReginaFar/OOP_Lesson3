public class Notebook {
    public double price;
    public int ram;

    public Notebook(double price, int ram) {
        this.price = price;
        this.ram = ram;
    }

    @Override
    public String toString() {
        return "Price:" + price + ", ram:" + ram;
    }

}
