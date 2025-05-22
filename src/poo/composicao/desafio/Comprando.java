package poo.composicao.desafio;

public class Comprando {
    public static void main(String[] args) {
        Cliente costumer = new Cliente("James");

        Produto cellphone = new Produto("Iphone 16", 997.67);
        Produto laptop = new Produto("Alienware 15", 1517.89);

        Item cellItem = new Item(cellphone, 2);
        Item lapItem = new Item(laptop, 1);

        Compra purchase = new Compra();

        purchase.owner = costumer;
        purchase.addItem(lapItem);
        purchase.addItem(cellItem);

        purchase.removeItem(lapItem);
        
        System.out.println(purchase.getAmount());
        for (Item item : purchase.getItens()) {
            System.out.println(item.toString());
        }
    }
}
