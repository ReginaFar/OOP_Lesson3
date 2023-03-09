import java.util.Comparator;

public class PriceComparator implements Comparator<Notebook> {

    @Override
    public int compare(Notebook o1, Notebook o2) {
        if (o1.price > o2.price) {
            return 1;
        } else if (o1.price < o2.price) {
            return -1;
        } else {
            return 0;
        }
    }
}
