import java.util.Scanner;
    public class Exercicio11{

    public static void executar(){
        Scanner leitor= new Scanner(System.in);
        int A[]= new int[5];
        int B[]= new int[5];
        double resultado[]= new double[5];
        double soma=0;

        for(int i = 0;i<5;i++){
            System.out.println("Digite um numero para A "+(1+i)+":"); 
           A[i]=leitor.nextInt();
           System.out.println("Digite um numero para B "+(1+i)+":"); 
           B[i]=leitor.nextInt();
             resultado[i]=A[i]*B[i];
             soma=soma+resultado[i];
             
            }
            System.out.println("O preoduto escalar dos vetores é: "+soma);
            
        
    leitor.close();}

    }