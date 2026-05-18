public class TextBook extends Book{
	private int standard;
	public TextBook(){}
	public TextBook(String isbn,String bookTitle,String authorName,double price,int availableQuantity,int standard){
		super(isbn,bookTitle,authorName,price,availableQuantity);
		this.standard=standard;
	}
	public void setstandard(int standard){
		this.standard=standard;
	}
	public int getstandard(){
		return standard;
	}
	public void Details(){
		super.Details();
		System.out.println("Standard:"+standard);
	}
}