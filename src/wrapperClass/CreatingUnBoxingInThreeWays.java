package wrapperClass;

public class CreatingUnBoxingInThreeWays {

	public static void main(String[] args) {
		// Type 1:  creating primitive
		int i=10;//primitive
		Integer i1 = Integer.valueOf(i);//boxing
		int i2 = i1.intValue();//unboxing
		System.out.println(i2);//primitive
		
		
		//Type 2 : Directly creating non primitive value
		Double d=20.0;//non primitive
		double d1 = d.doubleValue();//unboxing
		System.out.println(d1);//primitive
		
		//Type 3: creating object of the wrapper class
		Long l=new Long(200000);//non primitive
		long l1=l.longValue();//un boxing
		System.out.println(l1);//primitive

	}

}
