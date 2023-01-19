import java.io.FileNotFoundException;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class ProductManager {
    public static void main(String[] args) {
        try {
            Map<String, TreeSet<Product>> productsMap = ProductImporter.readFile("products.csv");
           String category = readCategory();
           printCategoryStats(productsMap, category);
        } catch (FileNotFoundException e) {
            System.err.println("Brak pliku z danymi produktów");
        }
    }

    private static String readCategory() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj nazwe kategorii dla wyświetlenia statystyk");
        return scanner.nextLine();
    }
    private static void printCategoryStats(Map<String, TreeSet<Product>> productsMap, String category) {
        TreeSet<Product> products = productsMap.get(category);

        if(products == null){
            System.out.println("Brak produktów z danej kategorii");
        } else {
          printAll(products);
          printAvgPrice(products);
          printCheapestAndExpensiveProducts(products);
        }

    }

    private static void printCheapestAndExpensiveProducts(TreeSet<Product> products) {
        System.out.println("Najtańszy produkt " + products.first());
        System.out.println("Najdroższy produkt " + products.last());
    }

    private static void printAvgPrice(Set<Product> products) {
        double sumPrice = 0;
        for (Product product : products) {
             sumPrice += product.getPrice();
        }
        double avgPrice = sumPrice / products.size();

        System.out.println("Średnia cena produktów " + avgPrice );
    }

    private static void printAll(Set<Product> products) {
        for (Product product : products) {
            System.out.println(product);
        }
    }
}
