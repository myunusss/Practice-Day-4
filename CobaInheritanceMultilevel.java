class A {
	public void methodA(){
		System.out.println("Method A");
	}
}

class B extends A {
	public void methodB(){
		System.out.println("Method B");
	}
}

public class CobaInheritanceMultilevel extends B{

	public void methodC(){
		System.out.println("Method C");
	}
	public static void main (String[] args){
		CobaInheritanceMultilevel obj = new CobaInheritanceMultilevel();

		obj.methodA();
		obj.methodB();
		obj.methodC();
	}
}

// ini contoh inheritance multilevel
// one can inherit from a derived class, thereby making this derived class the base class for the new class.