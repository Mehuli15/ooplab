class example1{
	int result, result1;
		public void square(int num){
			result=num*num;	
			System.out.println("The square of a number is "+result);
	}
		public void cube(int num){	
			result1=num*num*num;	
			System.out.println("The cube of a number is "+result1);
	}
		public static void main(String[] args){
			example1 ex=new example1();
				ex.square(5);
				ex.cube(5);
	}	
}