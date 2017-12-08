class Overload{ // class polymorphism overload

	int demo (int a, int b){
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		return a+b;
	}

	void demo (int y){
		System.out.println("Jumlah buku : " + y);
	}

	void demo (String z){
		System.out.println("Judul Buku : " + z);
	}
}

public class RunBuku extends Buku { // menggunakan single inheritance dengan super class Buku 

	public static void main(String[] args){
		RunBuku obj = new RunBuku(); // instance class Buku
		RunBuku obj1 = new RunBuku();

		obj.setJudul("La Tahzan");
		obj.setPenerbit("Kompas");
		obj.setTahunTerbit("2000");
		obj.setJumlah(20);

		obj1.setJudul("Laskar Pelangi");
		obj1.setPenerbit("Gramedia");
		obj1.setTahunTerbit("1992");
		obj1.setJumlah(5);
		
		obj.deskripsi();
		System.out.println("Judul Buku\t\tPenerbit\t\tTahun Terbit\t\tJumlah");
		System.out.println(obj.getJudul() + "\t\t" + obj.getPenerbit() + "\t\t\t" + obj.getTahunTerbit() + "\t\t\t" + obj.getJumlah());
		System.out.println(obj1.getJudul() + "\t\t" + obj1.getPenerbit() + "\t\t" + obj1.getTahunTerbit() + "\t\t\t" + obj1.getJumlah());

		// POLYMORPHISM
		Overload obj2 = new Overload();
		int sum;

		System.out.println("\n .:: Stok ::.");
		sum = obj2.demo(obj.getJumlah(), obj1.getJumlah());
		System.out.println("Total Stok Buku : " + sum);

		obj2.demo(obj.getJudul());
		obj2.demo(obj1.getJumlah());

	}
}