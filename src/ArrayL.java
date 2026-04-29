import java.util.ArrayList;

public class ArrayL {
    public static void main(String[] args) {

        ArrayList<String> nomes = new ArrayList();
        nomes.add("Miguel");
        nomes.add("Adreyna");
        nomes.add("Giovana");
        nomes.add("Selma");

        System.out.println(nomes.get(1));
        nomes.remove(3);
        for(int i = 0; i < nomes.size(); i++){
            System.out.println(nomes.get(i));
        }
    }
}