import java.util.Scanner;
public class ElevadoSegundo {
public static void main(String[]args){
Scanner scanner=new Scanner(System.in);
System.out.print("Digite seu número(padrão): ");
int base=scanner.nextInt();
System.out.print("Digite seu número(expoente): ");
int expoente=scanner.nextInt();
long resultado=1;
for(int i =0;i < expoente;i++){
    resultado *= base;
}
System.out.println(base + " elevado a " + expoente + " = " + resultado);
scanner.close(); 
}
}
