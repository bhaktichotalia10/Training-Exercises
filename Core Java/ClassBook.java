
public class ClassBook extends WrittenItem {
	

	public ClassBook(int uid, String name, int copies, String author) {
		super(uid, name, copies, author);		
	}

	@Override
	public void print() {
		System.out.println("Id= "+this.getUid()+" Title= "+this.getName()+
				" Copies= "+this.getCopies()+" Author= "+this.getAuthor());

	}

}
