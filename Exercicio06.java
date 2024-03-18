import java.util.Scanner;
public class Exercicio06 {

public static void executar(){
    Scanner leitor= new Scanner(System.in);
    double nota[]= new double[5];
    double peso[]=new double[5];
    double multi[]=new double[5];
    double soma=0;
    double somaPeso=0;

    for(int i = 0;i<5;i++){
    System.out.println("Digite a "+(i+1)+"° nota do aluno: ");
    nota[i]=leitor.nextInt();

    System.out.println("Digite o "+(i+1)+"° peso da nota do aluno: ");
    peso[i]=leitor.nextDouble();
     multi[i]=nota[i]*peso[i];
     soma=soma+multi[i];
     somaPeso=somaPeso +peso[i];
} 
double resultado= soma/somaPeso;
System.out.println("A media ponderada do aluno: "+resultado);

 
   
     
    
leitor.close();}

}
