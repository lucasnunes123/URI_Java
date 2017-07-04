
import java.util.Scanner;


public class Uri_1116 {
    public static void main(String[] args) {
       Scanner tecla = new Scanner(System.in);
        double cont,n,x,y,cal;
       cont = 0;
       n = tecla.nextDouble();
       while (cont < n){
           x = tecla.nextDouble();
           y = tecla.nextDouble();
           cal = x/y;
           
           if (y == 0){
               System.out.println("divisao impossivel");
           }
           else {
                System.out.printf("%.1f\n",cal);
       }
           cont = cont + 1;
    }
}
}
