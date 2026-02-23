import java.util.Scanner;
public class Ncresnte {
    public static void main(String[]args){
     Scanner scanner=new Scanner(System.in);
     System.out.print("Digite seu número: ");
     int N1=scanner.nextInt();
     System.out.print("Digite seu número: ");
     int N2=scanner.nextInt();
     System.out.print("Digite seu número: ");
     int N3=scanner.nextInt();
     int Maior,Menor;
//maior uau
if(N1 >= N2 && N1 >= N3){Maior=N1;}
else if (N2 >= N1 && N2 >= N3){Maior=N2;}
else{Maior=N3;}
//menor .-.
if(N1 <= N2 && N1 <= N3){Menor=N1;}
else if (N2 <= N1 && N2 <= N3){Menor=N2;}
else{Menor=N3;}
//merediano kk
int Medio=N1+N2+N3-Maior-Menor;
//bagulho chato pqp,pelo menos esssa questão
System.out.println(Menor);
System.out.println(Medio);
System.out.println(Maior);
    scanner.close();
    }
    
}
