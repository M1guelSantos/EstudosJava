import java.util.ArrayList;
import java.util.Scanner;
public class ListaVIP {
    public static void main(String[] args) {
      ArrayList<String> nomes = new ArrayList<>();
      Scanner scanner = new Scanner(System.in);
      for(int i = 0; i < 3; i++) {
          System.out.println("Digite os nomes");
          String listaVip = scanner.nextLine();
          nomes.add(listaVip);
      }
        System.out.println("A lista está fechada, qual nome deseja verificar?");
        String nomeTeste = scanner.nextLine();
        if(nomes.contains(nomeTeste)){
            System.out.println("Liberado");
        }else{
            System.out.println("Bloqueado");
        }
    }
}
