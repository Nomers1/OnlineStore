public class Author
{
    private String name;
    private String birthDate;
    
    public Author(String name, String bDay){
        this.name = name;
        birthDate = bDay;
    }
    public String getBirthDate() {
        return birthDate;
    }
    public String getName() {
        return name;
    }
}
