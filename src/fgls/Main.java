package fgls;

public class Main {
    public static void main(String[] args) {
        System.out.println("INSIDE Main.java");
        Employee e = new Cashier("Burt");
        Store store = new Store();
        store.initShelf();
        store.stackByWidth(e);
    }
}
