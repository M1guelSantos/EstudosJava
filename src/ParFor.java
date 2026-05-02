import java.util.Scanner;

public class ParFor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i < 5; i++){
            System.out.println("Digite um número");
            int numero = scanner.nextInt();
            if(numero % 2 == 0){
                System.out.println("O número " + numero + " é par");
            }else{
                System.out.println("O numero " +numero + " é impar");
            }
        }
        System.out.println("Fim das 5 verificações!");
    }
}
