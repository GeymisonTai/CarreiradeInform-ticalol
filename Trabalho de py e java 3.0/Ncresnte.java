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
if(N1 >= N2 && N1 >= N3){Maior=N1;}
else if (N2 >= N1 && N2 >= N3){Maior=N2;}
else{Maior=N3;}
        
if(N1 <= N2 && N1 <= N3){Menor=N1;}
else if (N2 <= N1 && N2 <= N3){Menor=N2;
                               
else{Menor=N3;}
int Medio=N1+N2+N3-Maior-Menor;
        
System.out.println(Menor);
System.out.println(Medio);
System.out.println(Maior);
    scanner.close();
    }
    
}
