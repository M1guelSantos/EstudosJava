import java.util.Scanner;
public class Notas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite sua nota de 1 a 5");
        int nota= scanner.nextInt();
        switch (nota){
            case 1:
                System.out.println("Péssimo");
                break;
            case 2:
                System.out.println("Ruim");
                break;
            case 3:
                System.out.println("Regular");
                break;
            case 4:
                System.out.println("Bom");
                break;
            case 5:
                System.out.println("Ótimo");
                break;
            default:
                System.out.println("Valor inválido");
        }
    }
}
