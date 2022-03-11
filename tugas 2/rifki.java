import java.util.LinkedList;

public class rifki {
    public static void main(String[] args) {
        LinkedList<String> name = new LinkedList<String>();
       
      
        name.add("A");
        name.add("H");
        name.add("M");
        name.add("A");
        name.add("D");
        name.add(" ");
        name.add("R");
        name.add("I");
        name.add("F");
        name.add("K");
        name.add("I");
        name.add(" ");
        name.add("F");
        name.add("A");
        name.add("R");
        name.add("I");
        name.add("D");
        System.out.println("=====================================");
        System.out.println(name);
        System.out.println("\n");

        System.out.println("List sebelum ditambahkan karakter: " + name);
        System.out.println("\n");

        //fungsi menyisipkan karakter
        name.set(4,"G");
        name.set(1,"A");
        name.set(2,"N");
        name.set(10,"T");
        name.set(14,"E");
        name.set(8,"N");
        name.set(7,"G");
        System.out.println("List setelah ditambahkan karakter: " + name);
        System.out.println("\n");

        //fungsi Remove
        name.remove(3);
        System.out.println("List setelah di remove: " + name);
        System.out.println("\n");

        //Fungsi push
        name.push("GANTENG");
        name.push("BAIK");
        name.push("DISAYANG ORANG");
        System.out.println("Setelah elemen push" + name);
        System.out.println("\n");

        //Fungsi POP
        name.pop();
        System.out.println("setelah pop: " + name);
        //System.out.println(saya.pop());

    }
}
