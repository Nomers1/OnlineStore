public class Movie extends ItemForSale
{

    String creator;
    String duration;
    public Movie(String creator, String duration, double price, String name, String saleDate){
        this.creator = creator;
        this.duration = duration;
        super(price,name,saleDate);
    }
}
