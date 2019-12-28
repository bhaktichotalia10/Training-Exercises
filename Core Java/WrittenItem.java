
public abstract class WrittenItem extends Item {
	
	private String author;
	
	public WrittenItem(int uid, String name, int copies, String author) {
		super(uid, name, copies);
		this.author = author;
	}
	
	public String getAuthor() {
		return author;
	}


	public void setAuthor(String author) {
		this.author = author;
	}

}
