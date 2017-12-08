public class Buku implements InterfaceBuku{ // menggunakan abstaction interface

	// Menggunakan encapsulation protected yang hanya bisa diakses oleh class dan package nya saja.
	protected String judul;
	protected String penerbit;
	protected String tahunTerbit;
	protected int jumlah;

	public String getJudul(){
		return judul;
	}

	public String getPenerbit(){
		return penerbit;
	}

	public String getTahunTerbit(){
		return tahunTerbit;
	}

	public int getJumlah(){
		return jumlah;
	}

	public void setJudul(String judul){
		this.judul = judul;
	}

	public void setPenerbit(String penerbit){
		this.penerbit = penerbit;
	}

	public void setTahunTerbit(String tahunTerbit){
		this.tahunTerbit = tahunTerbit;
	}

	public void setJumlah(int jumlah){
		this.jumlah = jumlah;
	}

	public void deskripsi(){
		System.out.println(".:: Menampilkan Deskripsi Buku ::.");
	}



}