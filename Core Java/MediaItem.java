
public abstract class MediaItem extends Item {
	private int runtime;
	

	public MediaItem(int uid, String name, int copies, int runtime) {
		super(uid, name, copies);
		this.runtime = runtime;
	}

	
	public int getRuntime() {
		return runtime;
	}



	public void setRuntime(int runtime) {
		this.runtime = runtime;
	}


}
