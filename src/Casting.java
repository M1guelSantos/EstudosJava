public class Casting {
    public static void main(String[] args) {

        double resultado = 0.0;
        int resultadoInt = (int) resultado;

        int meuInt = 10;
        double meuDouble = meuInt;

        String meuString = "10";
        int meuInt2 = Integer.parseInt(meuString); // Converti String para int

        String minhaString = String.valueOf(meuInt); // Reconversão

        System.out.println(meuInt2);
    }
}
