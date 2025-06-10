
package hitung;


public class Matematika {
   //membuat var
    private double bil1, bil2;
    
    //membuat constructor
    public Matematika(double bil1, double bil2){
        this.bil1 = bil1;
        this.bil2 = bil2; 
    }
    //membuat set penjumlahan
    double setpenjumlahan(){
        return bil1 + bil2;
    }
}
