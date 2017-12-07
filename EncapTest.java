public class EncapTest{

   private String title;
   private String description;
   private int code;

   public void setTitle(String judul){
      this.title = judul;
   }

   public void setDescription(String deskripsi){
      this.description = deskripsi;
   }

   public void setCode(int kode){
      this.code = kode;
   }

   public String getTitle(){
      return title;
   }

   public String getDescription(){
      return description;
   }

   public int getCode(){
      return code;
   }
}