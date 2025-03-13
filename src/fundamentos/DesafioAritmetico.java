package fundamentos;

public class DesafioAritmetico {
    public static void main(String[] args) {

        int numeradorPrimeiraParte = 6 *(3 + 2);
        double numeradorPrimeiraParteQuadrado = Math.pow(numeradorPrimeiraParte, 2);
        int denominadorPrimeiraParte = 3 * 2;
        double quocientePrimeiraParte = numeradorPrimeiraParteQuadrado / denominadorPrimeiraParte;

        int fator1NumeradorSegundaParte = 1 - 5;
        int fator2NumeradorSegundaParte = 2 - 7;
        int produtoNumeradorSegundaParte = fator1NumeradorSegundaParte * fator2NumeradorSegundaParte;
        int denominadorSegundaParte = 2;
        double quocienteSegundaParte = produtoNumeradorSegundaParte / denominadorSegundaParte;
        double quocienteSegundaParteQuadrado = Math.pow(quocienteSegundaParte, 2);

        double subtracaoPrimeiraSegunda = quocientePrimeiraParte - quocienteSegundaParteQuadrado;
        double subtracaoPrimeiraSegundaCubo = Math.pow(subtracaoPrimeiraSegunda, 3);

        double dezATerceira = Math.pow(10, 3);

        double resultadoFinal = subtracaoPrimeiraSegundaCubo / dezATerceira;

        System.out.println(resultadoFinal);
    }
}
