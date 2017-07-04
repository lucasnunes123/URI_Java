
import java.util.Scanner;

public class Uri_1065 {
    public static void main(String[] args) {
        Scanner tecla = new Scanner(System.in);
        int a, pares = 0;
       
       for(int cont = 0; cont<5;cont=cont+1){
           a = tecla.nextInt();
           if (a%2==0){
               pares += 1;
           }
       }
        System.out.printf("%d valores pares\n",pares);
      }
}