import java.util.Scanner;

public class Ninverso {
  public static void main(String[]args){
  Scanner scanner=new Scanner(System.in);
    System.out.print("Digite seu número(vai ser invertido): ");
   int N1=scanner.nextint();
   int inverso=0;
   while(N1 != 0){
int digitado=N1 % 10;
inverso=inverso * 10 + digitado;
N1=N1/=10;

scanner.close();

   }
System.out.println(inverso);

    }
}
