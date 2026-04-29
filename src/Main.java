public class Main {
    public static void main (String[] args){
        float f = 10.5f;
        double d = 20.555;
        boolean bool = true;

        String[] arr = {"Miguel", "Adreyna", "Giovana"};
        String[] arr2 = new String[7];
        arr2[5] = "MiguelDoidao";

        if( arr[0] == "Miguel"){
            System.out.println("Verdadeiro");
        }else{
            System.out.println("Falso");
        }
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
        System.out.println(arr2[5]);
        System.out.println(arr[1]);

        for(int i = 10; i >= 0; i--){
            System.out.println(i);
        }
    }
}
