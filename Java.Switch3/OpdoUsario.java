import java.util.Scanner;
public class OpdoUsario{
    public static void main(String[]args){
    Scanner scanner=new Scanner(System.in);
    System.out.print("Digite seu número: ");
    int N1=scanner.nextInt();
    System.out.print("Digite seu número: ");
    int N2=scanner.nextInt();
//////////////////////////////////////////////////////////
    System.out.println("###########################");
    System.out.println("Digite 1:para SOMAR");
    System.out.println("Digite 2: para SUBTRAÇÃO");
    System.out.println("Digite 3:para DIVISÃO");
    System.out.println("Digite 4:para MULTIPLICAÇÃO");
    System.out.println("############################");
///////////////////////////////////////////////////////////
System.out.print("Digite sua opção(1,2,3,4): ");
int Decisão=scanner.nextInt();

switch ((Decisão)) {
    case 1:{System.out.println(N1 + N2);}break;
    case 2:{System.out.println(N1-N2);}break;
    case 3:if(N2 != 0){System.out.println(N1 / N2);}
    else{System.out.println("Não é possível dividir por zero.");}    break;
    case 4:{System.out.println(N1 * N2);}break;
    default:{System.out.println("Digite uma opção válida");}break;
}
scanner.close();
    }
}
