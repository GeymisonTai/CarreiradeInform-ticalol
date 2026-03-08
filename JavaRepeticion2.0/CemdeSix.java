import java.util.Scanner; 
public class CemdeSix {
    public static void main(String[]args){
Scanner scanner=new Scanner(System.in);
System.out.print("Digite um número: ");
int N1=scanner.nextInt();
for(int i=N1;i+100;i++)
System.out.println(i);
scanner.close();
}
}