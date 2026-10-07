public class ItemForSale
{
protected double price;
protected String itemName;
protected String saleDate;

public ItemForSale(double price, String name, String saleDate){
    this.price = price;
    itemName = name;
    this.saleDate = saleDate;
}

public double getPrice(){
    return price;
}

public String getName(){
    return itemName;
}
}
