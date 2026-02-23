import java.util.Scanner;
public class Nsomaesub {
    public static void main(String[]args){
    Scanner scanner=new Scanner(System.in);
    System.out.print("Digite sue primeiro número: ");
    int N1=scanner.nextInt();
    System.out.print("Digite sue segundo número: ");
    int N2=scanner.nextInt();
if(N1 > N2){System.out.println(N1-N2);}
else if (N2>N1){System.out.println(N2+N1);}
else{System.out.println("Digite números diferentes,seu porra");}
   scanner.close();
    }
    
}
