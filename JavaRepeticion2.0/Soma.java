import java.util.Scanner;
public class Soma{
public static void main(String[]args){
Scanner scanner=new Scanner(System.in);
int soma=0;
for(int i=0;i < 51;i ++){
soma += i;
}
System.out.println("A soma de 1 a 50 é:"+soma);

scanner.close();
}  
}
