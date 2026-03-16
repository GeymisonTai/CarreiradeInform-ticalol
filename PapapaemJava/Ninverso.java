import java.util.Scanner;

public class Ninverso {
  public static void main(String[]args){
  Scanner scanner=new Scanner(System.in);
   int N1=scanner.nextint();
   int inverso=0;
   while(numero != 0){
int digitado=N1 % 10;
inverso=inverso * 10 + digitado;
N1 /=10;

System.out.println(inverso);
scanner.close();

   }

    }
}
