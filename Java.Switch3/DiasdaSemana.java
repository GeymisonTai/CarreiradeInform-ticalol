import java.util.Scanner;
public class DiasdaSemana {
    public static void main(String[]args){
    Scanner scanner=new Scanner(System.in);
    System.out.print("Digite número da semana(1 à 7): ");
    int semana=scanner.nextInt();

    switch ((semana)) {
        case 1:{System.out.println("Domingo");}break;
        case 2:{System.out.println("Segunda");}break;
        case 3:{System.out.println("Terça");}break;
        case 4:{System.out.println("Quarta");}break;
        case 5:{System.out.println("Quinta");}break;
        case 6:{System.out.println("Sexta");}break;
        case 7:{System.out.println("Sábado");}break;

        default:{System.out.println("Número inválido");}
            break;
    }
  scanner.close();

    }
}
