package wrapperClass;

public class ConvertingStringIntoRespectivePrimitiveDataType {

	public static void main(String[] args) {
		String s="123";
		System.out.println(s+1);
		int s1 = Integer.parseInt(s);
		System.out.println(s1+1);
		
		boolean sb=Boolean.parseBoolean(s);
		System.out.println(sb);
		
		double d=Double.parseDouble(s);
		System.out.println(d);
		
		short sh=Short.parseShort(s);
		System.out.println(sh);
		
		
		byte b=Byte.parseByte(s);
		System.out.println(b);

	}

}
