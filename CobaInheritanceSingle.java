class A{
	public void methodA(){
		System.out.println("Base class method !");
	}
}

public class CobaInheritanceSingle extends A{

	public void methodB(){
		System.out.println("Child class method !");
	}

	public static void main(String[] args){
		CobaInheritanceSingle obj = new CobaInheritanceSingle();
		obj.methodA();
		obj.methodB();
	}
}

// Ini contoh single inheritance
// When a class extends another one class only