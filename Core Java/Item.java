
public abstract class Item 
{
	private int uid;
	private String name;
	private int copies;
	
	public Item(int uid, String name, int copies) {
		super();
		this.uid = uid;
		this.name = name;
		this.copies = copies;
	}

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCopies() {
		return copies;
	}

	public void setCopies(int copies) {
		this.copies = copies;
	}

	@Override
	public String toString() {
		return "Item [uid=" + uid + ", name=" + name + ", copies=" + copies + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Item other = (Item) obj;
		if (copies != other.copies)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (uid != other.uid)
			return false;
		return true;
	}
	
	public abstract void print();
	
	public void checkIn(){
		System.out.println("Welcome to library");
	}
	
	public void checkOut(){
		System.out.println("Thank you for Visiting");

	}	
	
}
