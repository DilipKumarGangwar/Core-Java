/*Wrapper class- Wraps primitive types to class types. Used in java frameworks like Hibernate where primitive types
are not supported */

public class WrapperClassDemo {

	public static void main(String[] args) {

        int i=10;
		Byte byte1 = Byte.valueOf((byte)1);
		Short s = Short.valueOf((short)2);
		Integer a= Integer.valueOf(i);  //Boxing or wrapping - Converting a primitive type to Class type
        Float f = Float.valueOf(10.7f);
        Character c =Character.valueOf('A');
        Double d = Double.valueOf(3400.8);
        Boolean b =  Boolean.valueOf(true);
        String str = String.valueOf("123");
        
        // Unboxing or unwrapping
        System.out.println(byte1.byteValue()+" "+s.shortValue()  +" "+a.intValue()+ " " + f.floatValue()+ " ");
        System.out.println(c.charValue()+" "+ d.doubleValue()+" "+b.booleanValue()+" ");
        System.out.println(Integer.parseInt(str));  // converting string to number - parseInt() is a static method 
        
        int x= i;
        System.out.println("Value of x="+ x);
       
	}

}
