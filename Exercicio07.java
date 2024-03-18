import java.util.Scanner;
public class Exercicio07 {

public static void executar(){
    Scanner leitor= new Scanner(System.in);
    double num[]= new double[5];
    double num2[]= new double[5];

    for(int i = 0;i<5;i++){
    System.out.println("Digite o numero: "+(1+i));
    num[i]=leitor.nextInt();
    System.out.println("Digite o numero para a variavel 2: ");
    num2[i]=leitor.nextInt();
    }
    for(int i = 0;i<5;i++){
       if(num[i]==num2[i]){
          System.out.println("Os numeros: "+num[i]+"/"+num2[i]+" coincidem");
       }else{
        System.out.println("Os numero "+num[i]+"/"+num2[i]+" não coincidem");
       }
  }

     
    
leitor.close();}

}
