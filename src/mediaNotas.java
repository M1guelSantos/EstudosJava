import java.util.ArrayList;
import java.util.Scanner;

public class mediaNotas {
    public static void main(String[] args) {
        ArrayList<Integer> notas = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i < 4; i++){
            System.out.println("Digite uma nota");
            Integer nota = scanner.nextInt();
            notas.add(nota);
        }
        int soma = 0;
        for(int soma1 = 0; soma1 < notas.size(); soma1++){
            soma = soma + notas.get(soma1);
        }
        int media = soma / 4;
        if(media >= 7){
            System.out.println("A média final do aluno é " + media + ", ele foi aprovado!");
        }else{
            System.out.println("A média final do aluno é " + media + ", ele foi reprovado!");
        }
    }
}
