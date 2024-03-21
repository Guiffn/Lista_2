import java.util.Scanner;
    public class Exercicio12{

    public static void executar(){
        Scanner leitor= new Scanner(System.in);
        double A[]= new double[5];
        double par[]=new double[5];
        double multi=1;
        var j=0;

        for(int i = 0;i<5;i++){
            System.out.println("Digite um numero para A "+(1+i)+":"); 
           A[i]=leitor.nextInt();
           
            }
            for(int i = 0;i<5;i++){
                if(A[i]%2==0 && A[i]>0){
                 par[j]=A[i];
                 multi=multi*par[j];
                 
        }
            }
             System.out.println("Os numeros pares multiplicados: "+multi);
        
    leitor.close();}

    }
