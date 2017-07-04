
import java.util.Scanner;


public class Uri_1066 {
    public static void main(String[] args) {
        Scanner tecla = new Scanner(System.in);
        int num,pos = 0,neg = 0,par = 0,im = 0;
        
        for (int cont = 0;cont<=4;cont=cont+1){
            num = tecla.nextInt();
       
            if(num>0){
                pos+=1;
            }
            if (num<0){
                neg+=1;
            }
            if (num%2==0){
                par+=1;
            }
            else {
                im+=1;
            }
        }
        System.out.println(par+" valor(es) par(es)");
        System.out.println(im+" valor(es) impar(es)");
        System.out.println(pos+" valor(es) positivo(s)");
        System.out.println(neg+" valor(es) negativo(s)");
        
    }
    
}
