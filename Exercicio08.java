import java.util.Scanner;
public class Exercicio08{

public static void executar(){
    Scanner leitor= new Scanner(System.in);
    double A[]= new double[5];
    double B[]= new double[5];
    double C[]=new double[10];

    for(int i = 0;i<5;i++){
    System.out.println("Digite um numero para A "+(1+i)+":");
    A[i]=leitor.nextInt();
    System.out.println("Digite um numero para B "+(1+i)+":");
    B[i]=leitor.nextInt();
    C[i]=B[i];
    C[i+5]=A[i];
    }
    System.out.println("Os numeros dgitados são");
    for(int i = 0;i<10;i++){
    System.out.println(""+C[i]);
    

    }



    
leitor.close();}

}
