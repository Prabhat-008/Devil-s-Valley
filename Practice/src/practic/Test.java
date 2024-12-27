package practic;
public class Test {

     static int i=8 ;
     static int j=9;
   void display()
  {
	 int x = 7, y = 5, z = 10 ;
	 int sum= x+y+z;
	 System.out.println(sum);
  }

	public static void main(String[] args) {
		int sum =i+j;
		System.out.println("Value of sum = "+ sum);
		Test t= new Test();
		t.display();
		
	}

}
