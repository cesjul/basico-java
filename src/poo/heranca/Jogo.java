package poo.heranca;

public class Jogo {
    public static void main(String[] args) {
        Jogador player = new Jogador();
        Jogador player1 = new Jogador();

        player.walk(Direcao.NORTH);
        player.walk(Direcao.EAST);
        player.walk(Direcao.EAST);

        player1.walk(Direcao.NORTH);

        System.out.println(player.getPlayerPosition());
        System.out.println(player1.getPlayerPosition());

        if (player1.attack(player)){
            System.out.println("Enemy attacked succefully!");
            System.out.printf("Yours HP: %d | Enemy's HP: %d", player1.getHealthPoints(),
                                                                      player.getHealthPoints());
        }

    }
}
