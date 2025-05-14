package poo.composicao;

public class Comprando {
    public static void main(String[] args) {
        
        Compra purchase = new Compra();
        purchase.costumer = "Client";
        purchase.purchase.add(new Item(
                            "Cellphone", 
                            1, 
                            500.98));
        purchase.purchase.add(new Item(
                            "Headset", 
                            5, 
                            101.89));
        
        System.out.println((purchase.getAmount()));
        System.out.println(purchase.getQuantity());
    }
}
