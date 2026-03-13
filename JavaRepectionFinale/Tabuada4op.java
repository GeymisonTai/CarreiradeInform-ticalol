import java.util.Scanner;
public class Tabuada4op {public static void main(String[]args){
Scanner scanner=new Scanner(System.in);
System.out.print("Digite um número: ");
int op=scanner.nextInt();
for(int i=1;i<11;i++){
System.out.println("Opercões com o "+i);
System.out.println(op+i);
System.out.println(op-i);
System.out.println(op*i);
System.out.println(op/i);


scanner.close();


}
}
}