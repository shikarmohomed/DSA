class Book{
	String title;
	String author;
	int no_of_chapters;
	
	public Book()
	{
		this.title = title;
		this.author = author;
		this.no_of_chapters = no_of_chapters;
	}
	public Book(String title , String author , int no_of_chapters)
	{
		this.title = title;
		this.author = author;
		this.no_of_chapters = no_of_chapters;
	}
	 public void setTitle(String title)
	 {
		 this.title = title;
	 }
	 public void setAuthor(String author)
	 {
		 this.author = author;
	 }
	 public void setNo_of_chapters(int no_of_chapters)
	 {
		 this.no_of_chapters = no_of_chapters;
	 }
	 
	 public String getTitle()
	 {
		 return this.title;
	 }
	 public String getAuthor()
	 {
		 return this.author;
	 }
	 public int getNo_of_chapters()
	 {
		 return this.no_of_chapters;
	 }
	 public int getNo_of_pages()
	 {
		 return no_of_chapters * 120;
	 }
	 
	 public void displayInfo()
	 {
		 System.out.println("The book title was: "+ title + ", and the book was wriiten by: " + author + ", there is: " + no_of_chapters + "number of chapters. " );
	 }
}
public class TestBook
{
	public static void main (String [] args)
	{
		Book B1 = new Book();
		Book B2 = new Book("Harry potter" , "J.K.Rowling" , 24);
		
		B1.setTitle("Madolduwa");
		B1.setAuthor("Martin Wickramasighe");
		B1.setNo_of_chapters(12);
		
		B1.displayInfo();
		B2.displayInfo();
	}
}