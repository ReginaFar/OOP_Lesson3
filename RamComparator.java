import java.util.Comparator;

public class RamComparator implements Comparator<Notebook> {

    @Override
    public int compare(Notebook o1, Notebook o2) {
        if (o1.ram > o2.ram) {
            return 1;
        } else if (o1.ram < o2.ram) {
            return -1;
        } else {
            return 0;
        }
    }
}
