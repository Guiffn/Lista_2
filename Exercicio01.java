import java.util.Scanner;
public class Exercicio01 {

public static void executar(){
    Scanner leitor= new Scanner(System.in);
    int num[]= new int[5];
    double soma =0;

    for(int i = 0;i<5;i++){
    System.out.println("Digite o numero: "+(1+i));
    num[i]=leitor.nextInt();
    soma= soma +num[i];
    }

     double media=soma/5;
    for(int i=0;i<5;i++){
      if(media<num[i]){
           double maior=num[i];
           System.out.println("O numero maior q a media: "+maior);
      }else if(media>num[i]){
           double menor=num[i];
           System.out.println("O numero menor q a media: "+menor);
      }else if(media==num[i]){
        double igual=num[i];
        System.out.println("O numero igual a media: "+igual);
      }
        
    }
    
   
    
   





    
    leitor.close();
}

}
