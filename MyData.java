// WAP in java to create class as MyData with dd, mm, yy as data 
// members. 

// write default and parameterized constructor.

// display the date in dd-mm-yy format 

// use this keyword

 public class MyData{
 	int dd, mm, yy;
 	
 	 MyData(){
 		this.dd = 31;
 		this.mm = 1;
 		this.yy = 2025;
 	} 
 	
 	
 	MyData(int dd, int mm, int yy){
 		this.dd = dd;
 		this.mm = mm;
 		this.yy = yy;
 	}
 	
 	void displayDate(){
 		System.out.println("Date : " + this.dd + "-" + this.mm + "-" + this.yy);
 	}
 	
 	public static void main(String[] args){
 	
 		// making object here, as defaultDate
		MyData defaultDate = new MyData();
		System.out.println("Default date : ");
		defaultDate.displayDate();
		
		// made new object here as customDate
		MyData customDate = new MyData(25, 12, 2025);
		
		System.out.println("custom date");
		customDate.displayDate();
}
 }
