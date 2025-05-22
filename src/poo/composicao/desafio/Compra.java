package poo.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Compra {
    Cliente owner;
    private List<Item> itenList = new ArrayList<>();
    private double amount;

    public void addItem(Item item){
        this.itenList.add(item);
    }

    public boolean removeItem(Item item){
        if(this.itenList.contains(item)){
            int i = this.itenList.indexOf(item);
            this.itenList.remove(i);
            return true;
        }
        return false;
    }

    public List<Item> getItens(){
        return this.itenList;
    }

    public double getAmount(){
        for (Item item : itenList) {
            this.amount += (item.product.getPrice() * item.quantity);
        }
        return amount;
    }
}
