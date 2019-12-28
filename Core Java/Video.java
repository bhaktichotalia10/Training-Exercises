
public class Video extends MediaItem {
	 private String director;
	 private String genre;
	 private int year;
	 	
	public Video(int uid, String name, int copies, int runtime, String director, String genre, int year) {
		super(uid, name, copies, runtime);
		this.director = director;
		this.genre = genre;
		this.year = year;
	}
	
	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
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
				" Copies= "+this.getCopies()+" Runtime= "+this.getRuntime()+
				" Director= "+this.getDirector()+" Genre= "+this.getGenre()+
				" Year Released= "+this.getYear());

	}

}
