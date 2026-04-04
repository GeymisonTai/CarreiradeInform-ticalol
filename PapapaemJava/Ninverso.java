import java.util.Scanner;

public class Ninverso {
private int numero;
public Ninverso(int numero){
  this.numero = numero;}
public int inverter(){
    int n = this.numero;
    int inverso = 0;

    while (n > 0) {int digito = n % 10;inverso = inverso * 10 + digito;n /= 10; }
return inverso;
  }

  public String Resultado(){
    return "Número invertido: " + inverter();
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite seu número (vai ser invertido): ");
    int valor = scanner.nextInt();

    Ninverso obj = new Ninverso(valor);

    System.out.println(obj.Resultado());

    scanner.close();
  }
}
