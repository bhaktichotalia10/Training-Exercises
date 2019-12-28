
public class Client {

	public static void main(String[] args) {
		ClassBook bk = new ClassBook(1001,"Harry Potter",7,"J.K.Rowling");
		JournalPaper jp = new JournalPaper(2001,"Advanced Intelligent Systems",5,"Alexander Yin",2019);
		CD cd = new CD(3001,"Bada Pachtaoge",300,7,"Arijit Singh","Sad Song");
		Video vd = new Video(4001,"Big Data Analytics",250,112,"Vishali","Educative",2019);
		bk.checkIn();
		
		bk.print();
		jp.print();
		cd.print();
		vd.print();
		
		jp.checkOut();
	}

}
