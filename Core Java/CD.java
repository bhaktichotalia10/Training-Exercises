
public class CD extends MediaItem {
	private String artist;
	private String genre;
	
	public CD(int uid, String name, int copies, int runtime, String artist, String genre) {
		super(uid, name, copies, runtime);
		this.artist = artist;
		this.genre = genre;
	}


	public String getArtist() {
		return artist;
	}


	public void setArtist(String artist) {
		this.artist = artist;
	}


	public String getGenre() {
		return genre;
	}


	public void setGenre(String genre) {
		this.genre = genre;
	}


	@Override
	public void print() {
		System.out.println("Id= "+this.getUid()+" Title= "+this.getName()+
				" Copies= "+this.getCopies()+" Runtime= "+this.getRuntime()+
				" Artist= "+this.getArtist()+" Genre= "+this.getGenre());


	}

}
