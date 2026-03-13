import java.util.Scanner; 
public class CemdeSix {
    public static void main(String[]args){
Scanner scanner=new Scanner(System.in);
System.out.print("Digite um número: ");
int a=scanner.nextInt();
for(int i =1;i < 100;i++){
int proximo=a + (i*6);
System.out.println(proximo);

}
scanner.close();
}
}