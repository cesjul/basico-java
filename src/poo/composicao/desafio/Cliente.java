package poo.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String name;
    List<Compra> purchaseList = new ArrayList<>();
    private double amount;

    Cliente(String name){
        this.name = name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getString(){
        return this.name;
    }

    public double getAmount(){
        for (Compra purchase : purchaseList) {
            this.amount += purchase.getAmount();
        }
        return this.amount;
    }
}
