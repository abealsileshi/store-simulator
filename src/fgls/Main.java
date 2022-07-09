package fgls;

public class Main {
    public static void main(String[] args) {
        System.out.println("Main.java");
        Store store = new Store();
        store.initShelf();
        store.stackByWidth();
    }
}
