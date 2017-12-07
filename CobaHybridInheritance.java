class C
{
   public void dispC()
   {
	System.out.println("C");
   }
}

class A extends C
{
   public void dispA()
   {
	System.out.println("A");
   }
}

class B extends C
{
   public void dispB()
   {
	System.out.println("B");
   }
	
}

class CobaHybridInheritance extends A
{
   public void dispD()
   {
	System.out.println("D");
   }
   public static void main(String args[]){

	CobaHybridInheritance obj = new CobaHybridInheritance();
	obj.dispC(); // class D can access to class C by class A
   obj.dispA(); // class D can access to class A casue D extend A
   obj.dispD();
   //obj.dispB(); akan error karena tidak ada derive dari B
   }
}