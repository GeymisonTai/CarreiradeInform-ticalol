import java.util.Scanner;
public class Opmat{
    public static void main(String[]args){
    Scanner scanner=new Scanner(System.in);
    System.out.print("Digite seu número: ");
    int N1=scanner.nextInt();
    System.out.print("Digite seu número: ");
    int N2=scanner.nextInt();
    ///////////0w0/////////////////////////////
    int Soma=N1 + N2;
    int Sub=N1-N2;
    int Multi=N1*N2;
    int Div=N1/N2;
    System.out.println("Soma:"+Soma);
    System.out.println("Subtração:"+Sub);
    System.out.println("Multiplicação:"+Multi);
    System.out.println("Divisão:"+Div);
    
    scanner.close();

    }
    
}
