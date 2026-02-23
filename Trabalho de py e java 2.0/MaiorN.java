import java.util.Scanner;
public class MaiorN {
    public static void main(String[]args){
    Scanner scanner=new Scanner(System.in);
    System.out.print("Digite seu número: ");
    int N1=scanner.nextInt();
    System.out.print("Digite seu número: ");
    int N2=scanner.nextInt();
 if(N1 > N2) {System.out.println("O maior é "+ N1);}
else if (N2>N1) {System.out.println("O maior é "+ N2);}
else{System.out.println("Números iguais,coloque números diferentes.");}

scanner.close();
}    
}
