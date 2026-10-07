
public class Book extends ItemForSale
{

    String publisher;
    Author creator;

    public Book( String publisher, Author creator, double price, String name, String saleDate){
        this.publisher = publisher;
        this.creator = creator;
        super(price, name,saleDate);
    }
}
