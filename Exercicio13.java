import java.util.Scanner;
    public class Exercicio13{

    public static void executar(){
        Scanner leitor= new Scanner(System.in);

        int n;
        System.out.println("Digite um numero");
        n=leitor.nextInt();
        
        int N[]=new int[n];
        if(n>0){
            N[0]=1;
        }
        
        if(n>1){
            N[1]=1;
        }
       
        for(int i = 2;i<n;i++){
            N[i] = N[i - 1] + N[i - 2];
        }
        System.out.println("Numeros de Fibonacci:");
        for(int i = 0;i<n;i++){
            System.out.println(N[i]+"");    
        }
           
        
            
             
        
    leitor.close();}
}

    
