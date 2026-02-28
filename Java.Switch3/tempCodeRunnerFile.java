
            System.out.println("Mil");
            return;
        }

        if (numero < 1 || numero > 1000) {
            System.out.println("Número fora do intervalo.");
            return;
        }

        if (numero == 100) {
            System.out.println("Cem");
            return;
        }

        int c = numero / 100;
        int resto = numero % 100;

        String resultado = "";

        if (c > 0) {
            resultado += centenas(c);
            if (resto > 0) {
                resultado += " e ";
            }
        }

        if (resto < 20) {
            resultado += unidadeAte19(resto);
        } else {
            int d = resto / 10;
            int u = resto % 10;

            resultado += dezenas(d);

            if (u > 0) {
                resultado += " e " + unidadeAte19(u);
            }
        }

        System.out.println(resultado);
        scanner.close();
    }