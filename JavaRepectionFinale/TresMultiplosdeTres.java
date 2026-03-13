import java.util.Scanner;
public class TresMultiplosdeTres{
public static void main(String[] args) {
Scanner scanner=new Scanner(System.in);
System.out.print("Digite seu número bb: ");
int A=scanner.nextInt();
System.out.print("Digite seu número bb: ");
int B=scanner.nextInt();

for(int i =1;i<4;i++){
System.out.println("Multiplos três do primeiro "+ A+":");
System.out.println(A*i*3);
;}
for(int i =1;i<4;i++){
System.out.println("Multiplos três do segundo "+ B+":");
System.out.println(B*i*3);
;}
scanner.close();
}
}
