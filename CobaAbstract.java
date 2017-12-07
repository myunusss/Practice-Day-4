abstract class Sum{
	public abstract int SumOfTwo(int n1, int n2);
	public abstract int SumOfThree(int n1, int n2, int n3);

	// Regular method
	public void disp(){
		System.out.println("Method of class sum");
	}
}

class CobaAbstract extends Sum{

	public int SumOfTwo(int num1, int num2){
		return num1+num2;
	}
	
	public int SumOfThree(int num1, int num2, int num3){
		return num1+num2+num3;
	}

	public static void main(String[] args){
		AbstactDemo obj = new AbstactDemo();

		System.out.println(obj.SumOfTwo(8, 80));
		System.out.println(obj.SumOfThree(28, 8, 1994));
		obj.disp();
	}
}