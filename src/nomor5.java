
    //Soal no 5
    //Tentukan hasil yang didapatkan ketika dilakukan perintah berikut ini:
    //remove(0), remove(3), remove(2)

    // System.out.println(nama.remove(0));
    // System.out.println(nama.remove(3));
    // System.out.println(nama.remove(2));

    import java.util.ArrayList;

public class nomor5 {
    public static void main(String[] args) {
    //String[] nama = {"A","R","I","D"};
    ArrayList<String> nama = new ArrayList<String>();
    nama.add("A");
    nama.add("R");
    nama.add("I");
    nama.add("D");
    

    System.out.println("ArrayList sebelum remove:");
    for(String var: nama){
         System.out.println(var);
    }

    //nama.remove(0);
    nama.remove(3);
    //nama.remove(2);
    System.out.println("ArrayList setelah remove:");
       for(String var2: nama){
             System.out.println(var2);

            }
    }
}