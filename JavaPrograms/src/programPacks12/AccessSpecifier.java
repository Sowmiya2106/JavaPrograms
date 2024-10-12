package programPacks12;

class test{
	int a;//default access
	public int b;//public access
	private int c; //privte access
	void setC(int a)
	{
		c=a;
	}
	int getC()
	{
		return c;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       test ob=new test();
       ob.a=10;
       ob.b=20;
       //ob.c=100;
       ob.setC(100);
       System.out.println(ob.getC());
       
       
	}

}
