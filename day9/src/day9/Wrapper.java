package day9;

public class Wrapper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//wrapper 
		//Number is super class for all classes like Integer,Float,Double,Byte,String
		Number n=new Integer("67");
		Number n1=new Integer(67);
		Number n2=new Float(67787);
		
		System.out.println(n.equals(n1));
		System.out.println(n.getClass());
		System.out.println(n1);
		System.out.println(n2.toString());
		System.out.println(n2.getClass());
		
		System.out.println("wrappers");
		Integer x=new Integer("567");
		Float x1=new Float("567");
		String x3=new String("567879");
		
		System.out.println(x3);
		System.out.println(x1.intValue());
		//System.out.println(x3.split("r")); not ?
		
		//primitive int,float,string,byte,double
		int p=567;
		p=x;
		String c="976";
		System.out.println(x.toString());
		System.out.println(Integer.parseInt(c));
		
		System.out.println(c.getClass());
		
	}

}
