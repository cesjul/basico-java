package poo.heranca;

public class Jogo {
    public static void main(String[] args) {
        Jogador player = new Jogador();

        player.walk(Direcao.NORTH);
        player.walk(Direcao.EAST);
        player.walk(Direcao.EAST);

        System.out.println(player.getPlayerPosition());

    }
}
