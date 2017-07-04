
import java.util.Scanner;

public class Uri_1071 {

  public static void main(String[] args) {
   int X, Y, impar = 0;
   Scanner tecla = new Scanner(System.in);
   
   X = tecla.nextInt();
   Y = tecla.nextInt();

   if (X > Y) {
    for (int cont = X - 1; cont > Y; cont--) {
     if (cont % 2 == 0) {
      impar += cont;
     }
    }
   }else {
    for (int cont = Y - 1; cont > X; cont--) {
     if (cont % 2 != 0) {
      impar += cont;
     }
    }
   }

   System.out.println(impar);

  }

}