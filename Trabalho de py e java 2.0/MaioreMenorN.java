import java.util.Scanner;
public class MaioreMenorN {
public static void main(String[]args){
Scanner scanner=new Scanner(System.in);
System.out.print("Digite seu número bb: ");
int N1=scanner.nextInt();
System.out.print("Digite seu número bb: ");
int N2=scanner.nextInt();
System.out.print("Digite seu número bb: ");
int N3=scanner.nextInt();
int Maior,Menor;

if(N1>=N2 && N1>=N3){Maior=N1;}
else if(N2 >= N1 && N2 >= N3){ Maior = N2;}
else{Maior=N3;}

if(N1 <= N2 && N1 <= N3){Menor = N1;}
else if (N2 <= N1 && N2 <= N3){Menor = N2;}
else{Menor = N3;}
System.out.println("Maior:"+Maior);
System.out.println("Menor:"+Menor);

    
scanner.close();
}
    
}
