
import java.util.Scanner;


public class Uri_1067 {
    public static void main(String[] args) {
        Scanner tecla = new Scanner(System.in);
        int X,impares = 1;
        X= tecla.nextInt();
        for(int cont = -1;cont < X-1;cont+=2){
            impares=cont + 2;
            System.out.println(impares);
        }
    }
}
