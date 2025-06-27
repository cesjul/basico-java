package poo.heranca;

public class Jogador {
    private int x;
    private int y;

    public boolean walk(Direcao direction){
        switch (direction) {
            case NORTH:
                this.y++;
                break;
            case SOUTH:
                this.y--;
                break;
            case EAST:
                this.x++;
                break;
            case WEST:
                this.x--;
                break;
            
        }
        return false;
    }

    public String getPlayerPosition(){
        String position = "(" + this.x + "," + this.y + ")";
        return position;
    }
}
