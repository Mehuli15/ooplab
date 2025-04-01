class book{
	String title;
	String author;
	int yearOfPublish;
	public book(String title, int yearOfPublish, String author){
		this.title=title;
		this.author=author;
		this.yearOfPublish=yearOfPublish;
	}
	
	public void title() {
		System.out.println("Wings of Fire");
	}
	public void author() {
		System.out.println("A.P.J Abdul Kalam");
	}
	public void yearOfPublish() {
		System.out.println("1999");
	}
}
class book1{
    public static void main(String[]args){
        book b=new book(null, 0, null);
        b.title();
        b.author();
        b.yearOfPublish();
    }
}