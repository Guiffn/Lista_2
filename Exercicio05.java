import java.util.Scanner;
public class Exercicio05{

public static void executar(){
    Scanner leitor= new Scanner(System.in);
    double num[]= new double[5];

    System.out.println("Digite um numero para a variavel n: ");
    double n = leitor.nextDouble();
    int cont=0;

    for(int i = 0;i<5;i++){
    System.out.println("Digite um numero: ");
     num[i]= leitor.nextDouble();
 }
 for(int i = 0;i<5;i++){
    if( num[i]==n){
        cont ++;
    }
 }
 System.out.println("O numero de vezes n foi igual a um numero do vetor= "+cont);
 

 
 leitor.close();
}
}
