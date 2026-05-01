import java.util.ArrayList;
import java.util.Scanner;

public class ArrayL {
    public static void main(String[] args) {

        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("Miguel");
        nomes.add("Adreyna");
        nomes.add("Giovana");

        //System.out.println(nomes.get(0));
        //nomes.remove(0);
        for(String nome: nomes){
            System.out.println(nome);
        } // For para Vetores.

        int i = 0;
        while(i<10){
            System.out.println("Estou no While");
            i++;
        }

        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um nome");
        String nomeDigitado = scanner.nextLine();

        if(nomes.contains(nomeDigitado)){
            System.out.println("Verdadeiro, o nome " + nomeDigitado + " está na lista");
        }else{
            System.out.println("O nome não está na lista");
        }*/
    }
}