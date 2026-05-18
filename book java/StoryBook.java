public class StoryBook extends Book{
	private String category;
	public StoryBook(){}
	public StoryBook(String isbn,String bookTitle,String authorName,double price,int availableQuantity,String category){
		super(isbn,bookTitle,authorName,price,availableQuantity);
		this.category=category;
	}
	public void setcategory(String category){
		this.category=category;
	}
	public String getcategory(){
		return category;
	}
	public void Details(){
		super.Details();
		System.out.println("Category:"+category);
	}
}