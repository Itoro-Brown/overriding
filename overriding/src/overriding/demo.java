package overriding;

 class demo {

	public static void main (String[] args) {
		
		car c = new car();
		c.startCar();
		
		
		benz b = new benz();
		b.startCar();
		b.startCar(5);
	}
	
}
