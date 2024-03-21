import java.util.Scanner;
    public class Exercicio14{

    public static void executar(){
        Scanner leitor= new Scanner(System.in);
        double A[]= new double[5];
        
        

        for(int i = 0;i<5;i++){
            System.out.println("Digite um numero para A "+(1+i)+":"); 
           A[i]=leitor.nextInt();
        }
       double j=0;
    
        for(int i = 0;i<5;i++){
            if(A[i]>j){
                j=A[i];
                System.out.println(""+A[i]);
                
            }
        }
        

            

           
            
        
    leitor.close();
    }
}
    