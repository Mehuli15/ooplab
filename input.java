//create a method to input student name roll no attendence cgpa dayscholar or hosteller
class input{
	//first function 
	public void information(string name, string from, string attendence, int rollNo, float cgpa){
		name=System.out.print("Please enter your name : ");
		System.out.println("Name : "+name);

		from=System.out.print("Please enter if you are a hosteller or day-schollar : ");
		System.out.println("From : "+from);
	
		attendence=System.out.print("Please mark your attendence : ");
		System.out.println("Attendence : "+attendence);

		rollNo=System.out.print("Please enter your roll number : ");
		System.out.println("Roll number : "+rollNo);

		cgpa=System.out.print("Please enter your cgpa : ");
		System.out.println("CGPA : "+cgpa);
	}
	public static void main(String[] args){
			input info=new input();
				info.information("Mehuli Sarkar", "Hosteller", "Present", 150, 8.7);
				
}
