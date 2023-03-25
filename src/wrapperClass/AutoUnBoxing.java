package wrapperClass;

public class AutoUnBoxing {

	public static void main(String[] args) {
		// Type:1 Creating Primitive
		Integer i=10;
		int i1=i;//Auto Unboxing
		System.out.println(i1);//PRIMITIVE
		
		//
		int a=new Integer(300);//auto unboxing
		System.out.println(a);//primitive
		double d=new Double(20.09);
		System.out.println(d);
		byte b=4;
		byte b1=new Byte(b);
		System.out.println(b1);

	}

}
