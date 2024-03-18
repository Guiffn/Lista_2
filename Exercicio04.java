import java.util.Scanner;
public class Exercicio04{

public static void executar(){
    Scanner leitor= new Scanner(System.in);
    double num[]= new double[5];
    System.out.println("Digite um numero qualquer para a variavel n:");
     double n= leitor.nextDouble();

    for(int i = 0;i<5;i++){
    System.out.println("Digite um numero: ");
     num[i]= leitor.nextDouble();
 }
 for(int i = 0;i<5;i++){
    if(num[i]<n){
        System.out.println("O numero no indice:"+i+" e menor q a varivel n");
    }
    
 }

 

 
 leitor.close();
}
}
