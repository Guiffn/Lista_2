import java.util.Scanner;
public class Exercicio03{

public static void executar(){
    Scanner leitor= new Scanner(System.in);
    double num[]= new double[5];
    double num2[]= new double[5];

    for(int i = 0;i<5;i++){
    System.out.println("Digite um numero: ");
     num[i]= leitor.nextDouble();
     num2[i]=num[i]*2;
   
 }
 for(int i=0;i<5;i++){
   System.out.println("O dobro:"+num2[i]);
 }
 

 
 leitor.close();
}
}
