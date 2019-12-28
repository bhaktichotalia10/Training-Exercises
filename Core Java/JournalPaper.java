
public class JournalPaper extends WrittenItem {
	private int year;
	
	public JournalPaper(int uid, String name, int copies, String author, int year) {
		super(uid, name, copies, author);
		this.year = year;
	}
	

	public int getYear() {
		return year;
	}


	public void setYear(int year) {
		this.year = year;
	}


	@Override
	public void print() {
		System.out.println("Id= "+this.getUid()+" Title= "+this.getName()+
				" Copies= "+this.getCopies()+" Author= "+this.getAuthor()+
				" Published Year= "+this.getYear());
		
	}

}