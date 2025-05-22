package poo.composicao.UmParaMuitos;

import java.util.ArrayList;

public class Compra {

    String costumer;
    ArrayList<Item> purchase = new ArrayList<>();
    private double amount;
    private int quantity;

    public double getAmount(){
        for (Item item : purchase) {
            this.amount += (item.price * item.quantity);
        }

        return this.amount;
    }

    public int getQuantity(){
        for (Item item : purchase) {
            this.quantity += item.quantity;
        }

        return this.quantity;
    }
}
