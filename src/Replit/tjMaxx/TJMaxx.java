package Replit.tjMaxx;
import java.util.ArrayList;
import java.util.List;
import java.util.*;

/**
 * represents TJMaxx store class.
 */
public class TJMaxx {

    /**
     * Private lists to hold regular Item objects
     * and OnSaleItem objects that represent items that sell in TJMaxx
     */
    private List<Item> regularItems;
    private List<OnSaleItem> onSaleItems;

    /**
     * Public no-args constructor - Instantiates regularItems and onSaleItems lists
     * as new ArrayList
     */
    public TJMaxx() {
        //TODO
        regularItems = new ArrayList<>();
        onSaleItems = new ArrayList<>();
    }

    /**
     * adds an item object to regularItems list
     * @param item
     */
    public void addRegularItem(Item item) {
        //TODO
        regularItems.add(item);
    }

    /**
     * adds OnSaleItem object to onSaleItems list
     * @param item
     */
    public void addOnSaleItem(OnSaleItem item) {
        //TODO
        onSaleItems.add(item);
    }

    /**
     * getter for regularItems
     * @return
     */
    public List<Item> getRegularItems() {
        //TODO
        return regularItems;
    }

    /**
     * getter for onSaleItems
     * @return
     */
    public List<OnSaleItem> getOnSaleItems() {
        //TODO

        return onSaleItems;
    }

    /**
     * return count of regularItem object
     * @return
     */
    public int regularItemsCount() {
        //TODO

        return regularItems.size();
    }

    /**
     * returns count of onSaleItems in TJ Maxx
     * @return
     */
    public int onSaleItemsCount() {
        //TODO

        return onSaleItems.size();
    }

    /**
     * returns the name of each item in TJ Maxx starting
     * from regular item then onSaleItems
     * @return
     */
    public List<String> getAllItemNames() {
        //TODO
        List<String> newStr = new ArrayList<>();
        for(Item eachRegItem: regularItems){
            //eachRegItem.getName();
            newStr.add(eachRegItem.getName());
        }

        for(OnSaleItem eachOnSaleItem : onSaleItems){
            newStr.add(eachOnSaleItem.getName());
        }

        return newStr;
    }

    /**
     * gets catalog number and returns price for the item
     * it will search for the item both regularItems and onsaleonSaleItems
     * @param catalogNumber
     * @returns 0.0 if product cannot be found with that catalognumber
     */
    public double getItemPrice(int catalogNumber){
        //TODO
        for( Item each : regularItems  ){
            if(each.getCatalogNumber() == catalogNumber){
               return each.getPrice();
            }
        }

        for( OnSaleItem eachOnSale : onSaleItems ){
            if(eachOnSale.getCatalogNumber() == catalogNumber){
                return eachOnSale.getPrice();
            }
        }
        return 0.0;
    }

    /**
     * accepts a name then searches
     * amoung onSaleItems. Once it finds, the method will return
     * that OnSaleItem object
     * @param name
     * @return
     */
    public OnSaleItem getOnSaleItem(String name){
        //TODO
        for(OnSaleItem each : onSaleItems){
            if(each.getName().equals(name)){
                return each;
            }
        }

        return null;
    }

    /**
     * removes the item with matching catalogNumber
     * from both regularItems and onSaleItems.
     * Does nothing if not found
     * @param catalogNumber
     */
    public void removeItem(int catalogNumber) {
        //TODO
        for (Item eachItem : regularItems){
            if(eachItem.getCatalogNumber() == catalogNumber){
                regularItems.remove(eachItem);
                break;
            }

            for (OnSaleItem eachOnSaleitem : onSaleItems){
                if(eachOnSaleitem.getCatalogNumber() == catalogNumber){
                    onSaleItems.remove(eachOnSaleitem);
                    break;
                }
            }
        }


    }

    /**
     * - it accepts a catalog number and finds that item
     * among regularItems and onSaleItems
     * - if it finds the item:
     *   - decrease the count of the Item by 1
     *   - if count reaches 0 after decrementing then remove the product(call removeItem method)
     *
     * @param catalogNumber
     */
    public void buyItem(int catalogNumber) {
        //TODO
        for (Item eachItem : regularItems) {
            if (eachItem.getCatalogNumber() == catalogNumber) {
                eachItem.setQuantity(eachItem.getQuantity() - 1);
                if (eachItem.getQuantity() == 0) {
                    regularItems.remove(eachItem);
                    break;
                }
            }
        }

            for (OnSaleItem eachOnSaleItem : onSaleItems){
                if(eachOnSaleItem.getCatalogNumber() == catalogNumber){
                    eachOnSaleItem.setQuantity(eachOnSaleItem.getQuantity()-1);
                    if(eachOnSaleItem.getQuantity() == 0){
                        onSaleItems.remove(eachOnSaleItem);
                        break;
                    }
                }
            }

        }



    }

// end of TJMaxx class

