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

class C extends A {
	public void methodC(){
		System.out.println("Method C");
	}
}

class D extends A {
	public void methodD(){
		System.out.println("Method D");
	}
}

public class CobaInheritanceHierarchical{

	public static void main(String[] args){
		B obj1 = new B();
		C obj2 = new C();
		D obj3 = new D();

		//All classes can access the method of class A
		obj1.methodA(); // class B dapat akses ke class A
		obj2.methodA(); // class C dapat akses ke class A
		obj3.methodA(); // class D dapat akses ke class A
	}
}

// ini contoh dari Instance hierarchical
// When more than one classes inherit a same class then this is called hierarchical inheritance.