import java.util.Scanner;
public class Soma {
    public static void main(String[]args){
     Scanner scanner=new Scanner(System.in);
     System.out.print("Digite seu número: ");
     int N1=scanner.nextInt();
     System.out.print("Digite seu número: ");
     int N2=scanner.nextInt();
     int Soma= N1 + N2;
     System.out.println(Soma);
    
    scanner.close();
    }
    
}