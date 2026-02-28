import java.util.Scanner;

public class NumeroPorExtensoChat{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número de 1 a 1000: ");
        int n = sc.nextInt();

        if (n == 1000) {
            System.out.println("Mil");
            
        }

        if (n < 1 || n > 1000) {
            System.out.println("Número inválido");
            
        }

        String resultado = "";

        int c = n / 100;
        int resto = n % 100;
        int d = resto / 10;
        int u = resto % 10;

        switch (c) {
            case 1: if (n == 100) resultado += "Cem"; else resultado += "Cento"; break;
            case 2: resultado += "Duzentos"; break;
            case 3: resultado += "Trezentos"; break;
            case 4: resultado += "Quatrocentos"; break;
            case 5: resultado += "Quinhentos"; break;
            case 6: resultado += "Seiscentos"; break;
            case 7: resultado += "Setecentos"; break;
            case 8: resultado += "Oitocentos"; break;
            case 9: resultado += "Novecentos"; break;
        }

        if (c > 0 && resto > 0) resultado += " e ";

        if (resto < 20) {
            switch (resto) {
                case 1: resultado += "Um"; break;
                case 2: resultado += "Dois"; break;
                case 3: resultado += "Três"; break;
                case 4: resultado += "Quatro"; break;
                case 5: resultado += "Cinco"; break;
                case 6: resultado += "Seis"; break;
                case 7: resultado += "Sete"; break;
                case 8: resultado += "Oito"; break;
                case 9: resultado += "Nove"; break;
                case 10: resultado += "Dez"; break;
                case 11: resultado += "Onze"; break;
                case 12: resultado += "Doze"; break;
                case 13: resultado += "Treze"; break;
                case 14: resultado += "Quatorze"; break;
                case 15: resultado += "Quinze"; break;
                case 16: resultado += "Dezesseis"; break;
                case 17: resultado += "Dezessete"; break;
                case 18: resultado += "Dezoito"; break;
                case 19: resultado += "Dezenove"; break;
            }
        } else {
            switch (d) {
                case 2: resultado += "Vinte"; break;
                case 3: resultado += "Trinta"; break;
                case 4: resultado += "Quarenta"; break;
                case 5: resultado += "Cinquenta"; break;
                case 6: resultado += "Sessenta"; break;
                case 7: resultado += "Setenta"; break;
                case 8: resultado += "Oitenta"; break;
                case 9: resultado += "Noventa"; break;
            }

            if (u > 0) {
                resultado += " e ";
                switch (u) {
                    case 1: resultado += "Um"; break;
                    case 2: resultado += "Dois"; break;
                    case 3: resultado += "Três"; break;
                    case 4: resultado += "Quatro"; break;
                    case 5: resultado += "Cinco"; break;
                    case 6: resultado += "Seis"; break;
                    case 7: resultado += "Sete"; break;
                    case 8: resultado += "Oito"; break;
                    case 9: resultado += "Nove"; break;
                }
            }
        }

        System.out.println(resultado);
        sc.close();
    }
}