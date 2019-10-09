
class Outer
{
	String out_string="String in Outer";
	void print() {
		Iner1 in1 =new Iner1();
		System.out.println(in1.in_string1);
		System.out.println(Iner2.in_string2);
	}
	class Iner1{
		String in_string1="String in Iner1";
		Iner1(){
			System.out.println("Constructor of Iner1");
		}
		class InClass_In_Iner1{
	}
}
	static class Iner2{
		static class staticClass_In_Iner2{
		}
		static String in_string2="static String in Iner2";
		Iner2(){
			System.out.println("Constructor of Iner2");
		}
	}
}

public class InerClassDemo3 {

	public static void main(String[] args) {
		Outer outer=new Outer();
		outer.print();
		Outer.Iner1 in1=new Outer().new Iner1();
		Outer.Iner2 in2=new Outer.Iner2();
		Outer.Iner1.InClass_In_Iner1 inin2=new Outer().new Iner1().new InClass_In_Iner1();
		Outer.Iner1.InClass_In_Iner1 inin1=in1.new InClass_In_Iner1();
		System.out.println(in1);
		System.out.println(in2);
		System.out.println(inin1);
		System.out.println(inin2);
	}
}
