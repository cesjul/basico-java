package poo.heranca;

public class Jogador {
    private int x;
    private int y;
    private int hp = 100;

    boolean attack(Jogador target){

        int playersAlignmentX = Math.abs(this.x - target.x);
        int playersAlignmentY = Math.abs(this.y - target.y);

        if (playersAlignmentX == 0 && playersAlignmentY != 0){
            target.hp -= 10;
            return true;
        } else if(playersAlignmentY == 0 && playersAlignmentX != 0){
            target.hp -= 10;
            return true;
        } else{
            return false;
        }

    }

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

    public int getHealthPoints(){
        return this.hp;
    }
}
