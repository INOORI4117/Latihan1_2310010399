
package hitung;


public class MatematikaBeraksi {
    public static void main(String[] args) {
        //membuat objek 
        Matematika ihsan = new Matematika(3,9);
        System.out.println("Hasil Penjumlahan : "+ihsan.setPenjumlahan());
        System.out.println("Hasil pengurangan : "+ihsan.setPengurangan());
        System.out.println("Hasil perkkalian : "+ihsan.setPerkalian());
        System.out.println("Hasil penjumlahan : "+ihsan.setPembagian());
    }
}
