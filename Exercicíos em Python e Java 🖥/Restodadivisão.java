import java.util.Scanner;
public class Restodadivisão {
    public static void main(String[]args){
    Scanner scanner=new Scanner (System.in);
    System.out.print("Digite seu número bb: ");
    int A=scanner.nextInt();
    System.out.print("Digite seu número bb: ");
    int B = scanner.nextInt();
    int Sobra= A % B ;
    System.out.println("Sobrou: " + Sobra);
    
     scanner.close();

    }
}
