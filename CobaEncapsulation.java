public class CobaEncapsulation{

   public static void main(String[] args){
      EncapTest obj = new EncapTest();
      CobaEncap obj1 = new CobaEncap();
      A obj2 = new A();

      obj.setTitle("La Tahzan");
      obj.setDescription("Buku terlaris masa kini");
      obj.setCode(201202021);

      System.out.println("Nama Buku \t\t Deskripsi \t\t\t Kode");
      System.out.println(obj.getTitle() + "\t\t" + obj.getDescription() + "\t\t" + obj.getCode());


      // Tidak akan tampil karena variable pada class EncapTest disetting private
      obj1.setTitle("Buku");
      obj1.setDescription("Buku baru");
      obj1.setCode(201202021);

      System.out.println("Nama Buku \t\t Deskripsi \t\t\t Kode");
      System.out.println(obj1.getTitle() + "\t\t" + obj1.getDescription() + "\t\t" + obj1.getCode());
   }
}