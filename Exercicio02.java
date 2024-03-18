import java.util.Scanner;
public class Exercicio02{

public static void executar(){
    Scanner leitor= new Scanner(System.in);
    double num[]= new double[5];

    for(int i = 0;i<5;i++){
    System.out.println("Digite um numero: ");
     num[i]= leitor.nextDouble();
   
 }
 for(int i=0;i<5;i++){
   
     if(num[i]>0){
        System.out.println(" O numero da posição: " +(i+1)+"° e positivo.");

     }else if(num[i]<0){
        System.out.println(" O numero da posição: " +(i+1)+"° e negativo.");

     }else{
        System.out.println(" O numero da posição: " +(i+1)+"° e igual a zero.");
     }

 }

 
 leitor.close();
}
}
