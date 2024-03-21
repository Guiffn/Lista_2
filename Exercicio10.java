    import java.util.Scanner;
    public class Exercicio10{

    public static void executar(){
        Scanner leitor= new Scanner(System.in);
        double A[]= new double[5];
        double B[]= new double[5];

        for(int i = 0;i<5;i++){
            System.out.println("Digite um numero para A "+(1+i)+":"); 
           A[i]=leitor.nextDouble();
           B[i]=A[i];
            
            
            }
        
            for(int i = 4;i>=0;i--){
                System.out.println(""+B[i]);
            }
        
    leitor.close();}

    }