import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class task1 {
    public static void main(String[] args) {

        Notebook notebook1 = new Notebook(52350.50, 32);
        Notebook notebook2 = new Notebook(39768.40, 8);
        Notebook notebook3 = new Notebook(60981.50, 16);
        Notebook notebook4 = new Notebook(55130.90, 8);
        List<Notebook> notebooks = new ArrayList<>();
        notebooks.add(notebook1);
        notebooks.add(notebook2);
        notebooks.add(notebook3);
        notebooks.add(notebook4);

        System.out.println(notebooks);

        Comparator<Notebook> priceComparator = new PriceComparator();
        Collections.sort(notebooks, priceComparator);
        System.out.println("Сортировка по цене:" + notebooks);

        Comparator<Notebook> ramComparator = new RamComparator();
        Collections.sort(notebooks, ramComparator);
        System.out.println("Сортировка по ram:" + notebooks);

        Comparator<Notebook> ramAndPriceComparator = new RamAndPriceComparator();
        Collections.sort(notebooks, ramAndPriceComparator);
        System.out.println("Сортировка по ram и по цене:" + notebooks);
    }
}