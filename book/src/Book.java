public class Book {
    public String title ;
    public String author;
    private String year="2001";

    public void printtitle()
    {
        System.out.println("books have title ");
    }

    public void setprintAuthor(String A )
    {
        author = A;
        System.out.println(A);
    }
    public String getprintAuthor()
    {
        return author;

    }
    public void printyear()
    {
        System.out.println(year);
    }
}
