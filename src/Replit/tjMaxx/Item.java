package Replit.tjMaxx;


public class Item {

    //private instance variables
    private String name;
    private int catalogNumber;
    private int quantity;
    private double price;

    /**
     * public constructor with:
     *
     * @param name
     * @param quantity
     * @param catalogNumber
     * @param price         assigns to values to instance variables
     */
    public Item(String name, int quantity, int catalogNumber, double price) {
        //TODO
        setName(name);
        setQuantity(quantity);
        setPrice(price);
        setCatalogNumber(catalogNumber);
    }

    /**
     * setter for name instance variable
     *
     * @param name
     */
    public void setName(String name) {
        //TODO
        this.name = name;
    }

    /**
     * setter for private price
     *
     * @param price
     */
    public void setPrice(double price) {
        //TODO
        this.price = price;
    }

    /**
     * getter for price
     *
     * @return
     */
    public double getPrice() {
        //TODO
        return price;
        //return 0.0;
    }

    /**
     * getter for name
     *
     * @return
     */
    public String getName() {
        //TODO
        return name;
    }


    public int getQuantity() {
        //TODO
        return quantity;
        //return -1;
    }

    public void setQuantity(int quantity) {
        //TODO
        this.quantity = quantity;
    }

    public int getCatalogNumber() {
        //TODO
        return catalogNumber;
        //return -1;
    }

    public void setCatalogNumber(int catalogNumber) {
        //TODO
        this.catalogNumber = catalogNumber;
    }

    /**
     * Override toString:
     *
     * @returns Object description in this format:
     * "Regular Item{name='Item name', catalogNumber=1234, quantity=5, price=9.99}"
     */
    @Override
    public String toString() {
        //TODO

        return "Regular Item{name='" + getName() + "', catalogNumber=" + getCatalogNumber() + ", quantity=" + getQuantity() + ", price=" + getPrice() + "}";
    }

}
