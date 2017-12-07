class Overload{
	void demo (int y){
		System.out.println("y = " + y);
	}

	int demo (int a, int b){
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		return a+b;
	}

	double demo (double a){
		System.out.println("double a = " + a);
		return a*a;
	}
}

class CobaPolymorphismOverloading{
	public static void main(String[] args){
		Overload obj = new Overload();
		double result;
		int sum;

		obj.demo(20);
		sum = obj.demo(50, 38);
		result = obj.demo(7.3);
		System.out.println("O/P : " + result);
		System.out.println("a + b : " + sum);
	}
}