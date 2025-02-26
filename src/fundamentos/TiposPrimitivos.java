package fundamentos;

public class TiposPrimitivos {
    public static void main(String[] args) {
        byte anosDeEmpresa = 10;
        short numDeVoos = 400;
        int id = 43254325;
        long pontosAcumulados = 3_454_980_201L;

        float salario = 11_567.89F;
        double vendasAcumuladas = 2_233_654.56;

        boolean estaDeFerias = false;

        char estadoAtual = 'A';

        System.out.println(anosDeEmpresa * 10);

        System.out.println(numDeVoos / 2);

        System.out.println(pontosAcumulados / vendasAcumuladas);

        System.out.println(id + ": salario = " + salario);

        if (estaDeFerias) {
            System.out.println("Esta de férias");
        }
        else {
            System.out.println("Não esta de ferias");
        }

        System.out.println(estadoAtual);
    }
    
}
