import java.util.Scanner;
    public class Exercicio15{

    public static void executar(){
        Scanner leitor= new Scanner(System.in);
        double A[]= new double[5];
        System.out.println("Digite um numero ");
        A[0]=leitor.nextDouble(); 
        
        for (int i = 1; i < 5; i++) {
            int num;
            do {
                System.out.print("Digite o próximo número (maior que " + A[i - 1] + "): ");
                num = leitor.nextInt();
            } while (num <= A[i - 1]); 
            A[i] = num;
        }

        
        System.out.println("Vetor preenchido:");
        for (int i = 0; i < 5; i++) {
            System.out.print(A[i] + " ");
        }
        
       
        

            

           
            
        
    leitor.close();
    }
}