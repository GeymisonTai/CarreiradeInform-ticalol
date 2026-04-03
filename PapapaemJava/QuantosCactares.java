public class QuantosCactares {

    public static String quantos(String frase) {
        int tamanho = frase.length();
        return "A frase tem " + tamanho + " caracteres.";
    }

    public static void main(String[] args) {
        String resultado = quantos("Programar é um processo arduo!");
        System.out.println(resultado);
    }
}
