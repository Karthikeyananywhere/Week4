package enumerator;

public enum Days {

	MONDAY(1),
	TUESDAY(2),
	WEDENESDAY(3),
	THURSDAY(4),
	FRIDAY(5),
	SATURDAY(6),
	SUNDAY(7);
	
	private int orderOfTheDay;
	
	 Days(int number) {
		this.orderOfTheDay=number;
	}
	
	public static void main(String[] args) {
		
//		Days day=Days.MONDAY;
//		
//		System.out.println(day.ordinal()+" "+ day+day.orderOfTheDay) ;
//	
		
		for (Days string : Days.values()) {
			
			System.out.println(" index of "+string+" "+string.ordinal());
		}
	}
	
	
	
}
