package wrapperClass;

public class ConvertingPrimitiveDataTypeToNonprimitive {

	public static void main(String[] args) {
	int i=10;
	Integer i1 = Integer.valueOf(i);
System.out.println(i1);
double d=10.0;
Double d1 = Double.valueOf(d);
System.out.println(d1);
System.out.println(i1+d1);
float f=10.00f;
Float f1 = Float.valueOf(f);
System.out.println(f1);
//Autoboxing process


	}

}
